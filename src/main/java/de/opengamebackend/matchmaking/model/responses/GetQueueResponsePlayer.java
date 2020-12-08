package de.opengamebackend.matchmaking.model.responses;

import de.opengamebackend.matchmaking.model.PlayerStatus;

import java.time.OffsetDateTime;

public class GetQueueResponsePlayer {
    private String playerId;
    private String version;
    private String gameMode;
    private String region;
    private PlayerStatus status;
    private String serverId;
    private OffsetDateTime matchedTime;
    private OffsetDateTime joinedTime;

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

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public OffsetDateTime getMatchedTime() {
        return matchedTime;
    }

    public void setMatchedTime(OffsetDateTime matchedTime) {
        this.matchedTime = matchedTime;
    }

    public OffsetDateTime getJoinedTime() {
        return joinedTime;
    }

    public void setJoinedTime(OffsetDateTime joinedTime) {
        this.joinedTime = joinedTime;
    }
}
