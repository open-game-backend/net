package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemSetsResponseItemSet {
    private String id;
    private List<GetItemSetsResponseItem> items;

    public GetItemSetsResponseItemSet() {
    }

    public GetItemSetsResponseItemSet(String id, List<GetItemSetsResponseItem> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GetItemSetsResponseItem> getItems() {
        return items;
    }

    public void setItems(List<GetItemSetsResponseItem> items) {
        this.items = items;
    }
}
