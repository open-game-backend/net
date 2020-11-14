package de.opengamebackend.matchmaking.model.requests;

public class ClientPollMatchmakingRequest {
    private String playerId;

    public ClientPollMatchmakingRequest() {
    }

    public ClientPollMatchmakingRequest(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
