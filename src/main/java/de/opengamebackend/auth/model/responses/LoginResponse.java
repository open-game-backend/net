package de.opengamebackend.auth.model.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

public class LoginResponse {
    private String playerId;
    private String provider;
    private String providerUserId;
    private ArrayList<String> roles;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean locked;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean firstTimeSetup;

    public LoginResponse() {
    }

    public LoginResponse(String playerId, ArrayList<String> roles) {
        this.playerId = playerId;
        this.roles = roles;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
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

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isFirstTimeSetup() {
        return firstTimeSetup;
    }

    public void setFirstTimeSetup(boolean firstTimeSetup) {
        this.firstTimeSetup = firstTimeSetup;
    }
}
