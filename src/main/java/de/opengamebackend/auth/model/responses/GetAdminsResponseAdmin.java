package de.opengamebackend.auth.model.responses;

public class GetAdminsResponseAdmin {
    private String provider;
    private String providerUserId;
    private boolean locked;

    public GetAdminsResponseAdmin() {
    }

    public GetAdminsResponseAdmin(String provider, String providerUserId, boolean locked) {
        this.provider = provider;
        this.providerUserId = providerUserId;
        this.locked = locked;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
