package de.opengamebackend.matchmaking.model.requests;

public class ServerNotifyPlayerJoinedRequest {
    private String serverId;
    private String playerId;

    public ServerNotifyPlayerJoinedRequest() {
    }

    public ServerNotifyPlayerJoinedRequest(String serverId, String playerId) {
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
