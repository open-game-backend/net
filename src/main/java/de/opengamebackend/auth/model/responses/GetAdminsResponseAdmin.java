package de.opengamebackend.auth.model.responses;

public class GetAdminsResponseAdmin {
    private String userId;
    private String provider;
    private boolean locked;

    public GetAdminsResponseAdmin() {
    }

    public GetAdminsResponseAdmin(String userId, String provider, boolean locked) {
        this.userId = userId;
        this.provider = provider;
        this.locked = locked;
    }

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

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
