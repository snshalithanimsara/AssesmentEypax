package com.shalitha.app.presentation.view_all

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.shalitha.app.R
import com.shalitha.app.databinding.ActivityNewsListingPageBinding
import com.shalitha.app.presentation.FetchNewsViewModel
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.app.utills.IntentExtrasKey
import com.shalitha.app.utills.IntentExtrasKey.EXTRA_KEY_IS_BREAKING_NEWS_SELECTED
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.makeInVisible
import com.shalitha.core.extensions.makeVisible
import com.shalitha.core.extensions.withNetwork
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class ViewAllNewsActivity : BaseActivity() {


    private val mFetchNewsViewModel: FetchNewsViewModel by inject()


    private lateinit var mBinding: ActivityNewsListingPageBinding
    private var mSelectedTopNewsCategory: String? = null
    private var mIsBreakingNewsSelected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        readArguments()
        bindUi()
        setUpPageTitle()
        setUpObservers()
        attachClickListeners()
        checkNewSectionAndFetchList()

    }

    private fun checkNewSectionAndFetchList() {
        if (mIsBreakingNewsSelected) {
            makeFetchBreakingNewsListRequest()
        } else {
            makeFetchNewListRequest()
        }
    }

    private fun setUpPageTitle() {
        if (mIsBreakingNewsSelected)
            mBinding.textSelectedNewsSection.text = getString(R.string.label_breaking_news)
        else
            mBinding.textSelectedNewsSection.text = getString(R.string.label_top_news)
    }

    private fun attachClickListeners() {
        mBinding.imageBack.setOnClickListener {
            finish()
        }
    }

    private fun readArguments() {
        if (intent.hasExtra(EXTRA_KEY_IS_BREAKING_NEWS_SELECTED)) {
            intent.extras?.getBoolean(EXTRA_KEY_IS_BREAKING_NEWS_SELECTED)
                ?.also { isBreakingNewsSelected ->
                    mIsBreakingNewsSelected = isBreakingNewsSelected
                }
        }

        if (intent.hasExtra(IntentExtrasKey.EXTRA_KEY_SELECTED_CATEGORY)) {
            intent.extras?.getString(IntentExtrasKey.EXTRA_KEY_SELECTED_CATEGORY)
                .also { selectedCategory ->
                    mSelectedTopNewsCategory = selectedCategory
                }
        }
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
        mBinding = ActivityNewsListingPageBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    /**
     *observer top news list fetch request
     */
    private fun observeFetchTopNewsListRequest(resource: Resource<List<PArticlesItem>?>?) {
        when (resource?.state) {
            ResourceState.LOADING -> {
                startNewsShimmerLoading()
            }


            ResourceState.SUCCESS -> {
                stopNewsShimmerLoading().also {
                    hideNewsShimmerLoading()
                    showNewsListingRecycleView()
                }

                populateNewsListingRecycleView(newListResponse = resource.data)
            }

            ResourceState.ERROR -> {
                stopNewsShimmerLoading()
                showAlertWithMessage(alertMessage = resource.message!!, okAction = {

                })
            }
        }
    }

    /**
     *observer breaking news list fetch request
     */
    private fun observeFetchBreakingNewsListRequest(resource: Resource<List<PArticlesItem>?>?) {
        when (resource?.state) {
            ResourceState.LOADING -> {
                startNewsShimmerLoading()
            }

            ResourceState.SUCCESS -> {
                stopNewsShimmerLoading().also {
                    hideNewsShimmerLoading()
                    showNewsListingRecycleView()
                }

                populateNewsListingRecycleView(newListResponse = resource.data)
            }

            ResourceState.ERROR -> {
                stopNewsShimmerLoading()
                showAlertWithMessage(alertMessage = resource.message!!, okAction = {

                })
            }
        }
    }

    private fun populateNewsListingRecycleView(newListResponse: List<PArticlesItem>?) {
        newListResponse?.toMutableList()?.let { newsList ->
            mBinding.recycleListAllNews.layoutManager =
                LinearLayoutManager(this@ViewAllNewsActivity)
            mBinding.recycleListAllNews.adapter =
                ViewAllNewsListingAdapter(
                    newsListItemResponseList = newsList,
                    onNewsItemClick = { pArticlesItem ->

                    })
        }

    }

    private fun showNewsListingRecycleView() {
        mBinding.recycleListAllNews.makeVisible()
    }

    private fun hideNewsShimmerLoading() {
        mBinding.shimmerListedNews.makeInVisible()
    }

    private fun stopNewsShimmerLoading() {
        mBinding.shimmerListedNews.stopShimmer()
    }

    private fun startNewsShimmerLoading() {
        mBinding.shimmerListedNews.startShimmer()
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