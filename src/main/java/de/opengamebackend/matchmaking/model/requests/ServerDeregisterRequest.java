package de.opengamebackend.matchmaking.model.requests;

public class ServerDeregisterRequest {
    private String id;

    public ServerDeregisterRequest() {
    }

    public ServerDeregisterRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
