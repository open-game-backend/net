package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutItemSetsRequestItemSet {
    private String id;
    private List<PutItemSetsRequestItem> items;

    public PutItemSetsRequestItemSet() {
        items = new ArrayList<>();
    }

    public PutItemSetsRequestItemSet(String id, List<PutItemSetsRequestItem> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PutItemSetsRequestItem> getItems() {
        return items;
    }

    public void setItems(List<PutItemSetsRequestItem> items) {
        this.items = items;
    }
}
