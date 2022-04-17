package com.shalitha.app.datasource.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/shalitha/app/datasource/local/AuthLocalDataSourceImpl;", "Lcom/shalitha/app/data/datasource/AuthLocalDataSource;", "mUserDao", "Lcom/shalitha/localdb/dao/UserDao;", "(Lcom/shalitha/localdb/dao/UserDao;)V", "createNewUser", "", "pUser", "Lcom/shalitha/app/presentation/models/PUser;", "(Lcom/shalitha/app/presentation/models/PUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findUserWithThisEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentLoggedInUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "app_debug"})
public final class AuthLocalDataSourceImpl implements com.shalitha.app.data.datasource.AuthLocalDataSource {
    private final com.shalitha.localdb.dao.UserDao mUserDao = null;
    
    public AuthLocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.shalitha.localdb.dao.UserDao mUserDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createNewUser(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.presentation.models.PUser pUser, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentLoggedInUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shalitha.app.presentation.models.PUser> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.presentation.models.PUser pUser, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object findUserWithThisEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shalitha.app.presentation.models.PUser> continuation) {
        return null;
    }
}