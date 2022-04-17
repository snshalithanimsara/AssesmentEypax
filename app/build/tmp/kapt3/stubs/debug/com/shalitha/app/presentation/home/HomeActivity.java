package com.shalitha.app.presentation.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0003J\b\u0010\u0011\u001a\u00020\fH\u0003J \u0010\u0012\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0018\u00010\u0014H\u0002J \u0010\u0017\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0018\u00010\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014H\u0002J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u0018\u0010 \u001a\u00020\f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\b\u0010#\u001a\u00020\fH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\fH\u0002J\b\u0010\'\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/shalitha/app/presentation/home/HomeActivity;", "Lcom/shalitha/core/base/BaseActivity;", "()V", "mBinding", "Lcom/shalitha/app/databinding/ActivityHomePageBinding;", "mFetchNewsViewModel", "Lcom/shalitha/app/presentation/FetchNewsViewModel;", "getMFetchNewsViewModel", "()Lcom/shalitha/app/presentation/FetchNewsViewModel;", "mFetchNewsViewModel$delegate", "Lkotlin/Lazy;", "bindUi", "", "hideBreakingNewsShimmerLoading", "hideTopNewsShimmerLoading", "init", "makeFetchBreakingNewsListRequest", "makeFetchNewListRequest", "observeFetchBreakingNewsListRequest", "resource", "Lcom/shalitha/network/state_models/Resource;", "", "Lcom/shalitha/app/presentation/models/PArticlesItem;", "observeFetchTopNewsListRequest", "observerLoggedInUserResponse", "signedInResponseState", "Lcom/shalitha/app/presentation/models/PUser;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "populateBreakingNewsListingRecycleView", "pBreakingNewsListResponse", "populateTopNewsListingRecycleView", "pTopNewsListResponse", "setUpObservers", "showBreakingNewsListingRecycleView", "showTopNewsListingRecycleView", "startBreakingNewsShimmerLoading", "startTopNewsShimmerLoading", "stopBreakingNewsShimmerLoading", "stopTopNewsShimmerLoading", "app_debug"})
public final class HomeActivity extends com.shalitha.core.base.BaseActivity {
    private final kotlin.Lazy mFetchNewsViewModel$delegate = null;
    private com.shalitha.app.databinding.ActivityHomePageBinding mBinding;
    
    public HomeActivity() {
        super();
    }
    
    private final com.shalitha.app.presentation.FetchNewsViewModel getMFetchNewsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void bindUi() {
    }
    
    private final void observerLoggedInUserResponse(com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser> signedInResponseState) {
    }
    
    /**
     * observer breaking news list fetch request
     */
    private final void observeFetchBreakingNewsListRequest(com.shalitha.network.state_models.Resource<? extends java.util.List<com.shalitha.app.presentation.models.PArticlesItem>> resource) {
    }
    
    /**
     * observer top news list fetch request
     */
    private final void observeFetchTopNewsListRequest(com.shalitha.network.state_models.Resource<? extends java.util.List<com.shalitha.app.presentation.models.PArticlesItem>> resource) {
    }
    
    private final void populateBreakingNewsListingRecycleView(java.util.List<com.shalitha.app.presentation.models.PArticlesItem> pBreakingNewsListResponse) {
    }
    
    private final void populateTopNewsListingRecycleView(java.util.List<com.shalitha.app.presentation.models.PArticlesItem> pTopNewsListResponse) {
    }
    
    private final void showBreakingNewsListingRecycleView() {
    }
    
    private final void hideBreakingNewsShimmerLoading() {
    }
    
    private final void stopBreakingNewsShimmerLoading() {
    }
    
    private final void startBreakingNewsShimmerLoading() {
    }
    
    private final void showTopNewsListingRecycleView() {
    }
    
    private final void hideTopNewsShimmerLoading() {
    }
    
    private final void stopTopNewsShimmerLoading() {
    }
    
    private final void startTopNewsShimmerLoading() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void makeFetchNewListRequest() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void makeFetchBreakingNewsListRequest() {
    }
}