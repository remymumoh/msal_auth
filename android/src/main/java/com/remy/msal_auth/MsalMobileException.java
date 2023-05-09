package com.remy.msal_auth;

class MsalMobileException extends Exception {
    private String mErrorCode;

    String getErrorCode() {
        return mErrorCode;
    }

    MsalMobileException(String errorCode, String message) {
        super(message);
        mErrorCode = errorCode;
    }
}
