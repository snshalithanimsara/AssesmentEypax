package com.shalitha.app.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R.\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/shalitha/app/presentation/FetchNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "mNewsUseCase", "Lcom/shalitha/app/domain/usecases/NewsUseCase;", "(Lcom/shalitha/app/domain/usecases/NewsUseCase;)V", "fetchBreakingNewsListResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shalitha/network/state_models/Resource;", "", "Lcom/shalitha/app/presentation/models/PArticlesItem;", "getFetchBreakingNewsListResponseLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFetchBreakingNewsListResponseLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "fetchNewsListResponseLiveData", "getFetchNewsListResponseLiveData", "setFetchNewsListResponseLiveData", "makeGetBreakingNewsListRequest", "Lkotlinx/coroutines/Job;", "makeGetNewsListRequest", "searchQuery", "", "app_debug"})
public final class FetchNewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.shalitha.app.domain.usecases.NewsUseCase mNewsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> fetchNewsListResponseLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> fetchBreakingNewsListResponseLiveData;
    
    public FetchNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.domain.usecases.NewsUseCase mNewsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> getFetchNewsListResponseLiveData() {
        return null;
    }
    
    public final void setFetchNewsListResponseLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> getFetchBreakingNewsListResponseLiveData() {
        return null;
    }
    
    public final void setFetchBreakingNewsListResponseLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.util.List<com.shalitha.app.presentation.models.PArticlesItem>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job makeGetNewsListRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job makeGetBreakingNewsListRequest() {
        return null;
    }
}