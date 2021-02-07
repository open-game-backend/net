package de.opengamebackend.collection.model.requests;

public class AddCollectionItemsRequest {
    private String itemDefinitionId;
    private int itemCount;

    public String getItemDefinitionId() {
        return itemDefinitionId;
    }

    public void setItemDefinitionId(String itemDefinitionId) {
        this.itemDefinitionId = itemDefinitionId;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
