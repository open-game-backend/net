package de.opengamebackend.collection.model.responses;

import java.util.HashMap;

public class OpenContainerResponse {
    private HashMap<String, Integer> addedItems;

    public OpenContainerResponse() {
        addedItems = new HashMap<>();
    }

    public HashMap<String, Integer> getAddedItems() {
        return addedItems;
    }

    public void setAddedItems(HashMap<String, Integer> addedItems) {
        this.addedItems = addedItems;
    }
}
