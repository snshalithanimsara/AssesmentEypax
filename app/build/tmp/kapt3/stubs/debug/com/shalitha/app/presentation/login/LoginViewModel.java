package com.shalitha.app.presentation.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/shalitha/app/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "mAuthUseCase", "Lcom/shalitha/app/domain/usecases/AuthUseCase;", "(Lcom/shalitha/app/domain/usecases/AuthUseCase;)V", "userSignedInResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shalitha/network/state_models/Resource;", "Lcom/shalitha/app/presentation/models/PUser;", "getUserSignedInResponseLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setUserSignedInResponseLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "checkIsUserAvailableWithThisEmail", "Lkotlinx/coroutines/Job;", "email", "", "passwordString", "setThisUserAsSignedInUser", "", "signedInUser", "(Lcom/shalitha/app/presentation/models/PUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> userSignedInResponseLiveData;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> getUserSignedInResponseLiveData() {
        return null;
    }
    
    public final void setUserSignedInResponseLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> p0) {
    }
    
    /**
     * check if the user is on local db
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkIsUserAvailableWithThisEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String passwordString) {
        return null;
    }
    
    private final java.lang.Object setThisUserAsSignedInUser(com.shalitha.app.presentation.models.PUser signedInUser, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}