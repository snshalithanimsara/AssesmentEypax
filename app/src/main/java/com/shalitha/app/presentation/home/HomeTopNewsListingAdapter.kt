package com.shalitha.app.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shalitha.app.R
import com.shalitha.app.databinding.ItemTopNewsListingBinding
import com.shalitha.app.presentation.models.PArticlesItem

class HomeTopNewsListingAdapter(
    var topNewsListItemResponseList: MutableList<PArticlesItem>,
    var onTopNewsItemClick: ((PArticlesItem) -> Unit)? = null
) : RecyclerView.Adapter<HomeTopNewsListingAdapter.TopNewsItemViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeTopNewsListingAdapter.TopNewsItemViewHolder {
        val itemTopNewsListingBinding =
            ItemTopNewsListingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopNewsItemViewHolder(itemTopNewsListingBinding)
    }

    override fun getItemCount(): Int = topNewsListItemResponseList.size

    override fun onBindViewHolder(
        holderBreakingNewsItem: HomeTopNewsListingAdapter.TopNewsItemViewHolder,
        position: Int
    ) = holderBreakingNewsItem.run { onBind(position) }

    inner class TopNewsItemViewHolder(private val itemBinding: ItemTopNewsListingBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(position: Int) {
            topNewsListItemResponseList[position].also { breakingNewsItem ->
                itemBinding.textAuthor.text =
                    "${itemView.context.getString(R.string.label_by)} ${breakingNewsItem.author}"

                itemBinding.textTitle.text = breakingNewsItem.title
                itemBinding.textNewsDate.text = breakingNewsItem.publishedAt

                itemView.setOnClickListener {
                    onTopNewsItemClick?.invoke(breakingNewsItem)
                }
                loadNewsPreviewImage(pArticlesItem = breakingNewsItem)
            }
        }

        private fun loadNewsPreviewImage(pArticlesItem: PArticlesItem) {
            itemBinding.imageArticlePreview.load(uri = pArticlesItem.urlToImage) {
                crossfade(true)
            }
        }
    }


}


