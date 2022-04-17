package com.shalitha.app.presentation.sign_up;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/shalitha/app/presentation/sign_up/SignUpActivity;", "Lcom/shalitha/core/base/BaseActivity;", "()V", "mBinding", "Lcom/shalitha/app/databinding/ActivitySignUpBinding;", "mSignUpViewModel", "Lcom/shalitha/app/presentation/sign_up/SignUpViewModel;", "getMSignUpViewModel", "()Lcom/shalitha/app/presentation/sign_up/SignUpViewModel;", "mSignUpViewModel$delegate", "Lkotlin/Lazy;", "attachClickListens", "", "bindUi", "extractUserFromForm", "Lcom/shalitha/app/presentation/models/PUser;", "init", "isFormValid", "", "navigateToLogin", "observerUserSignUpResponse", "signUpResponseState", "Lcom/shalitha/network/state_models/Resource;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "processSignUpUser", "setUpObservers", "app_debug"})
public final class SignUpActivity extends com.shalitha.core.base.BaseActivity {
    private final kotlin.Lazy mSignUpViewModel$delegate = null;
    private com.shalitha.app.databinding.ActivitySignUpBinding mBinding;
    
    public SignUpActivity() {
        super();
    }
    
    private final com.shalitha.app.presentation.sign_up.SignUpViewModel getMSignUpViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void bindUi() {
    }
    
    private final void attachClickListens() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void observerUserSignUpResponse(com.shalitha.network.state_models.Resource<java.lang.Boolean> signUpResponseState) {
    }
    
    private final void navigateToLogin() {
    }
    
    private final void processSignUpUser() {
    }
    
    private final com.shalitha.app.presentation.models.PUser extractUserFromForm() {
        return null;
    }
    
    private final boolean isFormValid() {
        return false;
    }
}