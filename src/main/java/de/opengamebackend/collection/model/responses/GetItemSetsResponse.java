package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;

public class GetItemSetsResponse {
    private ArrayList<GetItemSetsResponseItemSet> itemSets;

    public GetItemSetsResponse() {
    }

    public GetItemSetsResponse(ArrayList<GetItemSetsResponseItemSet> itemSets) {
        this.itemSets = itemSets;
    }

    public ArrayList<GetItemSetsResponseItemSet> getItemSets() {
        return itemSets;
    }

    public void setItemSets(ArrayList<GetItemSetsResponseItemSet> itemSets) {
        this.itemSets = itemSets;
    }
}
