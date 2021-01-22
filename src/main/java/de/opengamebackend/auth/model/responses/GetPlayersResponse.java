package de.opengamebackend.auth.model.responses;

import java.util.ArrayList;
import java.util.List;

public class GetPlayersResponse {
    private List<GetPlayersResponsePlayer> players;

    public GetPlayersResponse() {
        this.players = new ArrayList<>();
    }

    public GetPlayersResponse(List<GetPlayersResponsePlayer> players) {
        this.players = players;
    }

    public List<GetPlayersResponsePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<GetPlayersResponsePlayer> players) {
        this.players = players;
    }
}
