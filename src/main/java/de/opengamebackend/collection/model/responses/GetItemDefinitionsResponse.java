package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemDefinitionsResponse {
    private List<String> itemTags;
    private List<GetItemDefinitionsResponseItem> itemDefinitions;

    public GetItemDefinitionsResponse() {
    }

    public GetItemDefinitionsResponse(List<String> itemTags, List<GetItemDefinitionsResponseItem> itemDefinitions) {
        this.itemTags = itemTags;
        this.itemDefinitions = itemDefinitions;
    }

    public List<String> getItemTags() {
        return itemTags;
    }

    public void setItemTags(List<String> itemTags) {
        this.itemTags = itemTags;
    }

    public List<GetItemDefinitionsResponseItem> getItemDefinitions() {
        return itemDefinitions;
    }

    public void setItemDefinitions(List<GetItemDefinitionsResponseItem> itemDefinitions) {
        this.itemDefinitions = itemDefinitions;
    }
}
