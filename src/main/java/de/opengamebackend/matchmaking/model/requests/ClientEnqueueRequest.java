package de.opengamebackend.matchmaking.model.requests;

public class ClientEnqueueRequest {
    private String playerId;
    private String version;
    private String gameMode;
    private String region;

    public ClientEnqueueRequest() {
    }

    public ClientEnqueueRequest(String playerId, String version, String gameMode, String region) {
        this.playerId = playerId;
        this.version = version;
        this.gameMode = gameMode;
        this.region = region;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
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
