package de.opengamebackend.net;

public class ApiException extends Exception {
    private int errorCode;

    public ApiException(int errorCode, String errorMessage) {
        super(errorMessage);

        this.errorCode = errorCode;
    }

    public ApiException(ApiError apiError) {
        super(apiError.getErrorMessage());

        this.errorCode = apiError.getErrorCode();
    }

    public int getErrorCode() {
        return errorCode;
    }
}
