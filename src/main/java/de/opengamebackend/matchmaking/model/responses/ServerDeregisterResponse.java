package de.opengamebackend.matchmaking.model.responses;

public class ServerDeregisterResponse {
    private String removedId;

    public ServerDeregisterResponse() { }
    public ServerDeregisterResponse(String removedId) {
        this.removedId = removedId;
    }

    public String getRemovedId() {
        return removedId;
    }

    public void setRemovedId(String removedId) {
        this.removedId = removedId;
    }
}
