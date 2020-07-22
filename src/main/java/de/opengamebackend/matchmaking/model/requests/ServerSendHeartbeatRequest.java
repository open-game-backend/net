package de.opengamebackend.matchmaking.model.requests;

public class ServerSendHeartbeatRequest {
    private String id;

    public ServerSendHeartbeatRequest() { }
    public ServerSendHeartbeatRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
