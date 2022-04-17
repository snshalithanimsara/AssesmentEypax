package com.shalitha.app.presentation.detail_news

import android.os.Bundle
import coil.load
import com.shalitha.app.R
import com.shalitha.app.databinding.ActivityNewsDetailPageBinding
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.app.utills.IntentExtrasKey
import com.shalitha.app.utills.parseServerTimesStampDateStringAsDate
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.toDateEDMY

class DetailNewsActivity : BaseActivity() {


    private lateinit var mBinding: ActivityNewsDetailPageBinding

    private var mSelectedNewsItem: PArticlesItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        readArguments()
        bindUi()
        attachClickListens()
        setUpPageContent()
    }

    private fun readArguments() {
        if (intent.hasExtra(IntentExtrasKey.EXTRA_KEY_SELECTED_NEWS)) {
            intent.extras?.getParcelable<PArticlesItem>(IntentExtrasKey.EXTRA_KEY_SELECTED_NEWS)
                ?.also { selectedNewsItem ->
                    mSelectedNewsItem = selectedNewsItem
                }
        }
    }

    private fun bindUi() {
        mBinding = ActivityNewsDetailPageBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }


    private fun attachClickListens() {
        mBinding.imageBack.setOnClickListener {
            finish()
        }
    }

    private fun setUpPageContent() {
        mSelectedNewsItem?.let { pArticle ->
            mBinding.textAuthor.text =
                "${getString(R.string.label_published_by)} ${pArticle.author}"
            mBinding.textContent.text = pArticle.content
            mBinding.textNewsTitle.text = pArticle.title
            
            pArticle.publishedAt?.parseServerTimesStampDateStringAsDate()
                .also { publishedDate ->
                    publishedDate.toDateEDMY().also { formattedDateString ->
                        mBinding.textPublishAt.text = formattedDateString
                    }
                }

            loadNewsPreviewImage(pArticlesItem = pArticle)
        }
    }

    private fun loadNewsPreviewImage(pArticlesItem: PArticlesItem) {
        mBinding.imageNewsPreview.load(uri = pArticlesItem.urlToImage) {
            crossfade(true)
        }
    }


}