package com.shalitha.app.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/shalitha/app/domain/usecases/NewsUseCase;", "", "mNewsRepository", "Lcom/shalitha/app/domain/repository/NewsRepository;", "(Lcom/shalitha/app/domain/repository/NewsRepository;)V", "fetchBreakingNewsList", "Lcom/shalitha/app/presentation/models/PFetchNewsResponse;", "countryCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewsWithSearchQuery", "searchQuery", "app_debug"})
public final class NewsUseCase {
    private final com.shalitha.app.domain.repository.NewsRepository mNewsRepository = null;
    
    public NewsUseCase(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.domain.repository.NewsRepository mNewsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchNewsWithSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shalitha.app.presentation.models.PFetchNewsResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchBreakingNewsList(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shalitha.app.presentation.models.PFetchNewsResponse> continuation) {
        return null;
    }
}