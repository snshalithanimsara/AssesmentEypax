package com.shalitha.app.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shalitha.app.R
import com.shalitha.app.databinding.ItemBreakingNewsListingBinding
import com.shalitha.app.presentation.models.PArticlesItem

class BreakingNewsListingAdapter(
    var breakingNewsListItemResponseList: MutableList<PArticlesItem>,
    var onBreakingNewsItemClick: ((PArticlesItem) -> Unit)? = null
) : RecyclerView.Adapter<BreakingNewsListingAdapter.BreakingNewsItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreakingNewsItemViewHolder {
        val itemBreakingNewsListingBinding =
            ItemBreakingNewsListingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return BreakingNewsItemViewHolder(itemBreakingNewsListingBinding)
    }

    override fun getItemCount(): Int = breakingNewsListItemResponseList.size

    override fun onBindViewHolder(
        holderBreakingNewsItem: BreakingNewsItemViewHolder,
        position: Int
    ) =
        holderBreakingNewsItem.run { onBind(position) }

    inner class BreakingNewsItemViewHolder(private val itemBinding: ItemBreakingNewsListingBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(position: Int) {
            breakingNewsListItemResponseList[position].also { breakingNewsItem ->
                itemBinding.textAuthor.text =
                    "${itemView.context.getString(R.string.label_by)} ${breakingNewsItem.author}"

                itemBinding.textTitle.text = breakingNewsItem.title
                itemBinding.textSummary.text = breakingNewsItem.description

                itemView.setOnClickListener {
                    onBreakingNewsItemClick?.invoke(breakingNewsItem)
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


