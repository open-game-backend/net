package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemDefinitionsResponse {
    private List<GetItemDefinitionsResponseItem> itemDefinitions;

    public GetItemDefinitionsResponse() {
    }

    public GetItemDefinitionsResponse(List<GetItemDefinitionsResponseItem> itemDefinitions) {
        this.itemDefinitions = itemDefinitions;
    }

    public List<GetItemDefinitionsResponseItem> getItemDefinitions() {
        return itemDefinitions;
    }

    public void setItemDefinitions(List<GetItemDefinitionsResponseItem> itemDefinitions) {
        this.itemDefinitions = itemDefinitions;
    }
}
