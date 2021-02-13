package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutItemDefinitionsRequest {
    private List<PutItemDefinitionsRequestItem> itemDefinitions;

    public PutItemDefinitionsRequest() {
        itemDefinitions = new ArrayList<>();
    }

    public List<PutItemDefinitionsRequestItem> getItemDefinitions() {
        return itemDefinitions;
    }

    public void setItemDefinitions(List<PutItemDefinitionsRequestItem> itemDefinitions) {
        this.itemDefinitions = itemDefinitions;
    }
}
