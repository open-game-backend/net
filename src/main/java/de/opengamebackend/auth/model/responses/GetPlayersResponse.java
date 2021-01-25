package de.opengamebackend.auth.model.responses;

import java.util.ArrayList;
import java.util.List;

public class GetPlayersResponse {
    private List<GetPlayersResponsePlayer> players;
    private int totalPlayers;
    private int totalPages;

    public GetPlayersResponse() {
        this.players = new ArrayList<>();
    }

    public GetPlayersResponse(List<GetPlayersResponsePlayer> players, int totalPlayers, int totalPages) {
        this.players = players;
        this.totalPlayers = totalPlayers;
        this.totalPages = totalPages;
    }

    public List<GetPlayersResponsePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<GetPlayersResponsePlayer> players) {
        this.players = players;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
