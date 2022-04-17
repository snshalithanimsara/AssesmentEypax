package com.shalitha.app.presentation.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.shalitha.app.databinding.ActivitySearchNewsBinding
import com.shalitha.app.presentation.FetchNewsViewModel
import com.shalitha.app.presentation.home.HomeTopNewsListingAdapter
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.app.utills.IntentExtrasKey.EXTRA_KEY_SELECTED_CATEGORY
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.makeInVisible
import com.shalitha.core.extensions.makeVisible
import com.shalitha.core.extensions.withNetwork
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class SearchNewsActivity : BaseActivity() {

    private val mFetchNewsViewModel: FetchNewsViewModel by inject()
    private lateinit var mBinding: ActivitySearchNewsBinding
    private var mSelectedTopNewsCategory: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        readArguments()
        bindUi()
        setUpObservers()
        attachClickListeners()
        makeFetchNewListRequest()
    }

    private fun attachClickListeners() {
        mBinding.searchViewSearchNews.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                makeFetchNewListRequest()
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return false
            }

        })
    }

    private fun readArguments() {
        if (intent.hasExtra(EXTRA_KEY_SELECTED_CATEGORY)) {
            intent.extras?.getString(EXTRA_KEY_SELECTED_CATEGORY).also { selectedCategory ->
                mSelectedTopNewsCategory = selectedCategory
            }
        }
    }

    private fun setUpObservers() {

        mFetchNewsViewModel.fetchNewsListResponseLiveData.observe(
            this
        ) { observeFetchTopNewsListRequest(it) }
    }


    private fun bindUi() {
        mBinding = ActivitySearchNewsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    /**
     *observer top news list fetch request
     */
    private fun observeFetchTopNewsListRequest(resource: Resource<List<PArticlesItem>?>?) {
        when (resource?.state) {
            ResourceState.LOADING -> {
                startSearchNewsShimmerLoading()
            }


            ResourceState.SUCCESS -> {
                stopSearchNewsShimmerLoading().also {
                    hideSearchNewsShimmerLoading()
                    showSearchNewsListingRecycleView()
                }

                populateSearchNewsListingRecycleView(pTopNewsListResponse = resource.data)
            }

            ResourceState.ERROR -> {
                stopSearchNewsShimmerLoading()
                showAlertWithMessage(alertMessage = resource.message!!, okAction = {

                })
            }
        }
    }

    private fun populateSearchNewsListingRecycleView(pTopNewsListResponse: List<PArticlesItem>?) {
        pTopNewsListResponse?.toMutableList()?.let { topNewsList ->
            mBinding.recycleSearchResult.layoutManager =
                LinearLayoutManager(this@SearchNewsActivity)
            mBinding.recycleSearchResult.adapter =
                HomeTopNewsListingAdapter(
                    topNewsListItemResponseList = topNewsList,
                    onTopNewsItemClick = { pArticlesItem ->

                    })
        }

    }

    private fun showSearchNewsListingRecycleView() {
        mBinding.recycleSearchResult.makeVisible()
    }

    private fun hideSearchNewsShimmerLoading() {
        mBinding.shimmerSearchNews.makeInVisible()
    }

    private fun stopSearchNewsShimmerLoading() {
        mBinding.shimmerSearchNews.stopShimmer()
    }

    private fun startSearchNewsShimmerLoading() {
        mBinding.shimmerSearchNews.startShimmer()
    }


    @SuppressLint("MissingPermission")
    private fun makeFetchNewListRequest() {
        withNetwork({
            mFetchNewsViewModel.makeGetNewsListRequest(searchQuery = getSearchQueryWithSelectedCategory())
        }, {
            showInternetNotAvailableToast()
        })
    }

    private fun getSearchQueryWithSelectedCategory() =
        " ${mSelectedTopNewsCategory}+${getCurrentSearchQuery()}"

    private fun getCurrentSearchQuery() = mBinding.searchViewSearchNews.query.toString()

}