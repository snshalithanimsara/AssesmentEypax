package com.shalitha.app.presentation.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shalitha.app.R
import com.shalitha.app.databinding.ActivityHomePageBinding
import com.shalitha.app.presentation.FetchNewsViewModel
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.app.presentation.search.SearchNewsActivity
import com.shalitha.app.presentation.view_all.ViewAllNewsActivity
import com.shalitha.app.utills.IntentExtrasKey
import com.shalitha.app.utills.IntentExtrasKey.EXTRA_KEY_SELECTED_CATEGORY
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.makeInVisible
import com.shalitha.core.extensions.makeVisible
import com.shalitha.core.extensions.startActivity
import com.shalitha.core.extensions.withNetwork
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class HomeActivity : BaseActivity() {

    private val mFetchNewsViewModel: FetchNewsViewModel by inject()
    private lateinit var mBinding: ActivityHomePageBinding
    private var mSelectedTopNewsCategory: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        bindUi()
        setUpObservers()
        attachClickListeners()
        setDefaultTopNewsCategorySelected()
        makeFetchBreakingNewsListRequest()
    }

    private fun setDefaultTopNewsCategorySelected() {
        mBinding.radioButtonHealthy.isChecked = true
    }

    private fun setUpObservers() {
        mFetchNewsViewModel.fetchBreakingNewsListResponseLiveData.observe(
            this
        ) { observeFetchBreakingNewsListRequest(it) }

        mFetchNewsViewModel.fetchNewsListResponseLiveData.observe(
            this
        ) { observeFetchTopNewsListRequest(it) }
    }


    private fun bindUi() {
        mBinding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    private fun attachClickListeners() {
        mBinding.textSearchNews.setOnClickListener {
            startActivity<SearchNewsActivity> {
                putExtra(EXTRA_KEY_SELECTED_CATEGORY, mSelectedTopNewsCategory)
            }
        }

        mBinding.textViewAllBreakingNews.setOnClickListener {
            startActivity<ViewAllNewsActivity> {
                putExtra(IntentExtrasKey.EXTRA_KEY_IS_BREAKING_NEWS_SELECTED, true)
            }
        }
        mBinding.textViewAllTopNews.setOnClickListener {
            startActivity<ViewAllNewsActivity> {
                putExtra(IntentExtrasKey.EXTRA_KEY_IS_BREAKING_NEWS_SELECTED, false)
                putExtra(EXTRA_KEY_SELECTED_CATEGORY, mSelectedTopNewsCategory)
            }
        }

        mBinding.radioGroupTopNewsCategory.setOnCheckedChangeListener { radioGroup, selectedRadioButtonId ->
            when (selectedRadioButtonId) {
                R.id.radio_button_healthy -> {
                    mSelectedTopNewsCategory = getString(R.string.action_healthy)
                }

                R.id.radio_button_finance -> {
                    mSelectedTopNewsCategory = getString(R.string.action_finance)
                }

                R.id.radio_button_technology -> {
                    mSelectedTopNewsCategory = getString(R.string.action_technology)
                }
            }
            makeFetchNewListRequest()
        }
    }

    /**
     *observer breaking news list fetch request
     */
    private fun observeFetchBreakingNewsListRequest(resource: Resource<List<PArticlesItem>?>?) {
        when (resource?.state) {
            ResourceState.LOADING -> {
                startBreakingNewsShimmerLoading()
            }


            ResourceState.SUCCESS -> {
                stopBreakingNewsShimmerLoading().also {
                    hideBreakingNewsShimmerLoading()
                    showBreakingNewsListingRecycleView()
                }

                populateBreakingNewsListingRecycleView(pBreakingNewsListResponse = resource.data)
            }

            ResourceState.ERROR -> {
                stopBreakingNewsShimmerLoading()
                showAlertWithMessage(alertMessage = resource.message!!, okAction = {

                })
            }
        }
    }

    /**
     *observer top news list fetch request
     */
    private fun observeFetchTopNewsListRequest(resource: Resource<List<PArticlesItem>?>?) {
        when (resource?.state) {
            ResourceState.LOADING -> {
                hideTopNewsListingRecycleView()
                showTopNewsShimmerLoading()
                startTopNewsShimmerLoading()
            }


            ResourceState.SUCCESS -> {
                stopTopNewsShimmerLoading().also {
                    hideTopNewsShimmerLoading()
                    showTopNewsListingRecycleView()
                }

                populateTopNewsListingRecycleView(pTopNewsListResponse = resource.data)
            }

            ResourceState.ERROR -> {
                stopBreakingNewsShimmerLoading()
                showAlertWithMessage(alertMessage = resource.message!!, okAction = {

                })
            }
        }
    }

    private fun populateBreakingNewsListingRecycleView(pBreakingNewsListResponse: List<PArticlesItem>?) {
        pBreakingNewsListResponse?.toMutableList()?.let { breakingNewsList ->
            mBinding.recycleBreakingNews.layoutManager =
                LinearLayoutManager(this@HomeActivity, RecyclerView.HORIZONTAL, false)
            mBinding.recycleBreakingNews.adapter =
                BreakingNewsListingAdapter(
                    breakingNewsListItemResponseList = breakingNewsList,
                    onBreakingNewsItemClick = { pArticlesItem ->

                    })
        }

    }

    private fun populateTopNewsListingRecycleView(pTopNewsListResponse: List<PArticlesItem>?) {
        pTopNewsListResponse?.toMutableList()?.let { topNewsList ->
            mBinding.recycleTopNews.layoutManager =
                LinearLayoutManager(this@HomeActivity)
            mBinding.recycleTopNews.adapter =
                HomeTopNewsListingAdapter(
                    topNewsListItemResponseList = topNewsList,
                    onTopNewsItemClick = { pArticlesItem ->

                    })
        }

    }

    private fun showBreakingNewsListingRecycleView() {
        mBinding.recycleBreakingNews.makeVisible()
    }

    private fun hideBreakingNewsShimmerLoading() {
        mBinding.shimmerBreakingNewsListing.makeInVisible()
    }

    private fun stopBreakingNewsShimmerLoading() {
        mBinding.shimmerBreakingNewsListing.stopShimmer()
    }

    private fun startBreakingNewsShimmerLoading() {
        mBinding.shimmerBreakingNewsListing.startShimmer()
    }

    private fun showTopNewsListingRecycleView() {
        mBinding.recycleTopNews.makeVisible()
    }

    private fun hideTopNewsListingRecycleView() {
        mBinding.recycleTopNews.makeInVisible()
    }

    private fun hideTopNewsShimmerLoading() {
        mBinding.shimmerTopNews.makeInVisible()
    }

    private fun stopTopNewsShimmerLoading() {
        mBinding.shimmerTopNews.stopShimmer()
    }

    private fun startTopNewsShimmerLoading() {
        mBinding.shimmerTopNews.startShimmer()
    }

    private fun showTopNewsShimmerLoading() {
        mBinding.shimmerTopNews.makeVisible()
    }


    @SuppressLint("MissingPermission")
    private fun makeFetchNewListRequest() {
        withNetwork({
            mFetchNewsViewModel.makeGetNewsListRequest(searchQuery = mSelectedTopNewsCategory)
        }, {
            showInternetNotAvailableToast()
        })
    }

    @SuppressLint("MissingPermission")
    private fun makeFetchBreakingNewsListRequest() {
        withNetwork({
            mFetchNewsViewModel.makeGetBreakingNewsListRequest()
        }, {
            showInternetNotAvailableToast()
        })
    }


}