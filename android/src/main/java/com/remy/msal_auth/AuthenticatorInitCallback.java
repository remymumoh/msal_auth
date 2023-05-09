package com.remy.msal_auth;

import com.microsoft.identity.client.exception.MsalException;

public interface AuthenticatorInitCallback {
    void onSuccess();
    void onError(MsalException exception);
}