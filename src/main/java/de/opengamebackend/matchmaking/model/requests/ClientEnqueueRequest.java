package de.opengamebackend.matchmaking.model.requests;

public class ClientEnqueueRequest {
    private String version;
    private String gameMode;
    private String region;

    public ClientEnqueueRequest() {
    }

    public ClientEnqueueRequest(String version, String gameMode, String region) {
        this.version = version;
        this.gameMode = gameMode;
        this.region = region;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
