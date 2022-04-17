package com.shalitha.app.presentation.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/shalitha/app/presentation/home/HomeTopNewsListingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shalitha/app/presentation/home/HomeTopNewsListingAdapter$TopNewsItemViewHolder;", "topNewsListItemResponseList", "", "Lcom/shalitha/app/presentation/models/PArticlesItem;", "onTopNewsItemClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnTopNewsItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnTopNewsItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getTopNewsListItemResponseList", "()Ljava/util/List;", "setTopNewsListItemResponseList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holderBreakingNewsItem", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TopNewsItemViewHolder", "app_debug"})
public final class HomeTopNewsListingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shalitha.app.presentation.home.HomeTopNewsListingAdapter.TopNewsItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.shalitha.app.presentation.models.PArticlesItem> topNewsListItemResponseList;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.shalitha.app.presentation.models.PArticlesItem, kotlin.Unit> onTopNewsItemClick;
    
    public HomeTopNewsListingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shalitha.app.presentation.models.PArticlesItem> topNewsListItemResponseList, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.shalitha.app.presentation.models.PArticlesItem, kotlin.Unit> onTopNewsItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shalitha.app.presentation.models.PArticlesItem> getTopNewsListItemResponseList() {
        return null;
    }
    
    public final void setTopNewsListItemResponseList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shalitha.app.presentation.models.PArticlesItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.shalitha.app.presentation.models.PArticlesItem, kotlin.Unit> getOnTopNewsItemClick() {
        return null;
    }
    
    public final void setOnTopNewsItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.shalitha.app.presentation.models.PArticlesItem, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shalitha.app.presentation.home.HomeTopNewsListingAdapter.TopNewsItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.presentation.home.HomeTopNewsListingAdapter.TopNewsItemViewHolder holderBreakingNewsItem, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/shalitha/app/presentation/home/HomeTopNewsListingAdapter$TopNewsItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/shalitha/app/databinding/ItemTopNewsListingBinding;", "(Lcom/shalitha/app/presentation/home/HomeTopNewsListingAdapter;Lcom/shalitha/app/databinding/ItemTopNewsListingBinding;)V", "loadNewsPreviewImage", "", "pArticlesItem", "Lcom/shalitha/app/presentation/models/PArticlesItem;", "onBind", "position", "", "app_debug"})
    public final class TopNewsItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.shalitha.app.databinding.ItemTopNewsListingBinding itemBinding = null;
        
        public TopNewsItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.shalitha.app.databinding.ItemTopNewsListingBinding itemBinding) {
            super(null);
        }
        
        public final void onBind(int position) {
        }
        
        private final void loadNewsPreviewImage(com.shalitha.app.presentation.models.PArticlesItem pArticlesItem) {
        }
    }
}