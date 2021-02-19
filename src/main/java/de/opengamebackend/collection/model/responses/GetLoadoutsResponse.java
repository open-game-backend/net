package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;

public class GetLoadoutsResponse {
    private ArrayList<GetLoadoutsResponseLoadout> loadouts;

    public ArrayList<GetLoadoutsResponseLoadout> getLoadouts() {
        return loadouts;
    }

    public void setLoadouts(ArrayList<GetLoadoutsResponseLoadout> loadouts) {
        this.loadouts = loadouts;
    }
}
