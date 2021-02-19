package de.opengamebackend.collection.model.responses;

public class AddLoadoutResponse {
    private long loadoutId;

    public AddLoadoutResponse() {
    }

    public AddLoadoutResponse(long loadoutId) {
        this.loadoutId = loadoutId;
    }

    public long getLoadoutId() {
        return loadoutId;
    }

    public void setLoadoutId(long loadoutId) {
        this.loadoutId = loadoutId;
    }
}
