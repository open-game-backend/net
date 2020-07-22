package de.opengamebackend.matchmaking.model.responses;

import java.util.ArrayList;

public class GetServersResponse {
    private ArrayList<GetServersResponseServer> servers;

    public ArrayList<GetServersResponseServer> getServers() {
        return servers;
    }

    public void setServers(ArrayList<GetServersResponseServer> servers) {
        this.servers = servers;
    }
}
