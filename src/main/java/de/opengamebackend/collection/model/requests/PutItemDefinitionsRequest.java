package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutItemDefinitionsRequest {
    private List<String> itemTags;
    private List<PutItemDefinitionsRequestItem> itemDefinitions;

    public PutItemDefinitionsRequest() {
        itemTags = new ArrayList<>();
        itemDefinitions = new ArrayList<>();
    }

    public List<String> getItemTags() {
        return itemTags;
    }

    public void setItemTags(List<String> itemTags) {
        this.itemTags = itemTags;
    }

    public List<PutItemDefinitionsRequestItem> getItemDefinitions() {
        return itemDefinitions;
    }

    public void setItemDefinitions(List<PutItemDefinitionsRequestItem> itemDefinitions) {
        this.itemDefinitions = itemDefinitions;
    }
}
