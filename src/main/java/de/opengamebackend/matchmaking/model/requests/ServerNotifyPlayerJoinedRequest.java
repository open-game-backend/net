package de.opengamebackend.matchmaking.model.requests;

public class ServerNotifyPlayerJoinedRequest {
    private String serverId;
    private String ticket;

    public ServerNotifyPlayerJoinedRequest() {
    }

    public ServerNotifyPlayerJoinedRequest(String serverId, String ticket) {
        this.serverId = serverId;
        this.ticket = ticket;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
