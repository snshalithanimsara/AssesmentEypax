package com.shalitha.app.presentation.view_all

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shalitha.app.R
import com.shalitha.app.databinding.ItemViewAllNewsListingBinding
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.app.utills.parseServerTimesStampDateStringAsDate
import com.shalitha.core.extensions.toDateEDMY

class ViewAllNewsListingAdapter(
    var newsListItemResponseList: MutableList<PArticlesItem>,
    var onNewsItemClick: ((PArticlesItem) -> Unit)? = null
) : RecyclerView.Adapter<ViewAllNewsListingAdapter.NewsItemViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewAllNewsListingAdapter.NewsItemViewHolder {
        val itemViewAllNewsListingBinding =
            ItemViewAllNewsListingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return NewsItemViewHolder(itemViewAllNewsListingBinding)
    }

    override fun getItemCount(): Int = newsListItemResponseList.size

    override fun onBindViewHolder(
        holderBreakingNewsItem: ViewAllNewsListingAdapter.NewsItemViewHolder,
        position: Int
    ) = holderBreakingNewsItem.run { onBind(position) }

    inner class NewsItemViewHolder(private val itemBinding: ItemViewAllNewsListingBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(position: Int) {
            newsListItemResponseList[position].also { newsItem ->
                itemBinding.textAuthor.text =
                    "${itemView.context.getString(R.string.label_by)} ${newsItem.author}"

                itemBinding.textNewsTitle.text = newsItem.title
                itemBinding.textNewsDescription.text = newsItem.description

                newsItem.publishedAt?.parseServerTimesStampDateStringAsDate()
                    .also { publishedDate ->
                        publishedDate.toDateEDMY().also { formattedDateString ->
                            itemBinding.textNewsDate.text = formattedDateString
                        }
                    }


                itemView.setOnClickListener {
                    onNewsItemClick?.invoke(newsItem)
                }


                appendReadMoreToDescription(pArticlesItem = newsItem)
                loadNewsPreviewImage(pArticlesItem = newsItem)
            }
        }

        private fun appendReadMoreToDescription(pArticlesItem: PArticlesItem) {
            pArticlesItem.description?.let { description ->
                if (description.length > 150) {
                    itemBinding.textNewsDescription.text = HtmlCompat.fromHtml(
                        (description.substring(
                            0,
                            150
                        ) + "..." + "<font color='blue'>  <b>Read More</b></font>"),
                        HtmlCompat.FROM_HTML_MODE_LEGACY
                    )
                } else {
                    itemBinding.textNewsDescription.text = description
                }

            }
        }

        private fun loadNewsPreviewImage(pArticlesItem: PArticlesItem) {
            itemBinding.imageArticlePreview.load(uri = pArticlesItem.urlToImage) {
                crossfade(true)
            }
        }
    }


}


