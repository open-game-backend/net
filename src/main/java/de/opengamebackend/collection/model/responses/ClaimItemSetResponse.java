package de.opengamebackend.collection.model.responses;

import java.util.List;

public class ClaimItemSetResponse {
    private String itemSetId;
    private List<ClaimItemSetResponseItem> items;

    public String getItemSetId() {
        return itemSetId;
    }

    public void setItemSetId(String itemSetId) {
        this.itemSetId = itemSetId;
    }

    public List<ClaimItemSetResponseItem> getItems() {
        return items;
    }

    public void setItems(List<ClaimItemSetResponseItem> items) {
        this.items = items;
    }
}
