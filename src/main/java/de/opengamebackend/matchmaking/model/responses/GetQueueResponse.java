package de.opengamebackend.matchmaking.model.responses;

import java.util.ArrayList;

public class GetQueueResponse {
    private ArrayList<GetQueueResponsePlayer> players;

    public ArrayList<GetQueueResponsePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<GetQueueResponsePlayer> players) {
        this.players = players;
    }
}
