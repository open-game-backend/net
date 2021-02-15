package de.opengamebackend.collection.model.requests;

public class PutItemSetsRequestItem {
    private String itemDefinitionId;
    private int count;

    public PutItemSetsRequestItem() {
    }

    public PutItemSetsRequestItem(String itemDefinitionId, int count) {
        this.itemDefinitionId = itemDefinitionId;
        this.count = count;
    }

    public String getItemDefinitionId() {
        return itemDefinitionId;
    }

    public void setItemDefinitionId(String itemDefinitionId) {
        this.itemDefinitionId = itemDefinitionId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
