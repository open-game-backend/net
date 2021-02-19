package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class LoadoutRequest {
    private String type;
    private List<LoadoutRequestItem> items;

    public LoadoutRequest() {
        items = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LoadoutRequestItem> getItems() {
        return items;
    }

    public void setItems(List<LoadoutRequestItem> items) {
        this.items = items;
    }
}
