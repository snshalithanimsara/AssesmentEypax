package com.shalitha.app.presentation.sign_up;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/shalitha/app/presentation/sign_up/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "mAuthUseCase", "Lcom/shalitha/app/domain/usecases/AuthUseCase;", "(Lcom/shalitha/app/domain/usecases/AuthUseCase;)V", "signUpUserResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shalitha/network/state_models/Resource;", "", "getSignUpUserResponseLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSignUpUserResponseLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "createNewUser", "Lkotlinx/coroutines/Job;", "pUser", "Lcom/shalitha/app/presentation/models/PUser;", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private final com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.lang.Boolean>> signUpUserResponseLiveData;
    
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.domain.usecases.AuthUseCase mAuthUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.lang.Boolean>> getSignUpUserResponseLiveData() {
        return null;
    }
    
    public final void setSignUpUserResponseLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.shalitha.network.state_models.Resource<java.lang.Boolean>> p0) {
    }
    
    /**
     * create new user on local db
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job createNewUser(@org.jetbrains.annotations.NotNull()
    com.shalitha.app.presentation.models.PUser pUser) {
        return null;
    }
}