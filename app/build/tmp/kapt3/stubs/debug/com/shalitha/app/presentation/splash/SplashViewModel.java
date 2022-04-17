package com.shalitha.app.presentation.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/shalitha/app/presentation/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "mAuthUseCase", "Lcom/shalitha/app/domain/usecases/AuthUseCase;", "(Lcom/shalitha/app/domain/usecases/AuthUseCase;)V", "isLoggedInUserAvailableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shalitha/network/state_models/Resource;", "Lcom/shalitha/app/presentation/models/PUser;", "()Landroidx/lifecycle/MutableLiveData;", "setLoggedInUserAvailableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "checkIsUserAvailable", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> isLoggedInUserAvailableLiveData;
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> isLoggedInUserAvailableLiveData() {
        return null;
    }
    
    public final void setLoggedInUserAvailableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<com.shalitha.app.presentation.models.PUser>> p0) {
    }
    
    /**
     * check  logged in  user is available on local db
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkIsUserAvailable() {
        return null;
    }
}