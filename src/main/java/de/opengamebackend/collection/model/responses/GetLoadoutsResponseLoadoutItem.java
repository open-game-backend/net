package de.opengamebackend.collection.model.responses;

public class GetLoadoutsResponseLoadoutItem {
    private String itemDefinitionId;
    private int count;

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
