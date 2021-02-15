package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;

public class PutItemSetsRequest {
    private ArrayList<PutItemSetsRequestItemSet> itemSets;

    public PutItemSetsRequest() {
        itemSets = new ArrayList<>();
    }

    public PutItemSetsRequest(ArrayList<PutItemSetsRequestItemSet> itemSets) {
        this.itemSets = itemSets;
    }

    public ArrayList<PutItemSetsRequestItemSet> getItemSets() {
        return itemSets;
    }

    public void setItemSets(ArrayList<PutItemSetsRequestItemSet> itemSets) {
        this.itemSets = itemSets;
    }
}
