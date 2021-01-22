package de.opengamebackend.auth.model.responses;

public class GetPlayersResponsePlayer {
    private String playerId;
    private String provider;
    private String providerUserId;

    public GetPlayersResponsePlayer() {
    }

    public GetPlayersResponsePlayer(String playerId, String provider, String providerUserId) {
        this.playerId = playerId;
        this.provider = provider;
        this.providerUserId = providerUserId;
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
}
