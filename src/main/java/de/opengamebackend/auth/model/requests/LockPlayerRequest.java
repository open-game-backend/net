package de.opengamebackend.auth.model.requests;

public class LockPlayerRequest {
    private String userId;
    private String provider;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
