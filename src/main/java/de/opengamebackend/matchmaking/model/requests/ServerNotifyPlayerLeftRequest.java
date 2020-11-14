package de.opengamebackend.matchmaking.model.requests;

public class ServerNotifyPlayerLeftRequest {
    private String serverId;
    private String playerId;

    public ServerNotifyPlayerLeftRequest() {
    }

    public ServerNotifyPlayerLeftRequest(String serverId, String playerId) {
        this.serverId = serverId;
        this.playerId = playerId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
