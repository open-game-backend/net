package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;

public class GetLoadoutsResponseLoadout {
    private long id;
    private String type;
    private ArrayList<GetLoadoutsResponseLoadoutItem> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<GetLoadoutsResponseLoadoutItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<GetLoadoutsResponseLoadoutItem> items) {
        this.items = items;
    }
}
