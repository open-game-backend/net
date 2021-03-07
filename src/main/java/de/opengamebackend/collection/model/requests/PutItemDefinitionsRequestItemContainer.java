package de.opengamebackend.collection.model.requests;

import java.util.List;

public class PutItemDefinitionsRequestItemContainer {
    private int itemCount;
    private List<PutItemDefinitionsRequestItemContainerItem> containedItems;

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public List<PutItemDefinitionsRequestItemContainerItem> getContainedItems() {
        return containedItems;
    }

    public void setContainedItems(List<PutItemDefinitionsRequestItemContainerItem> containedItems) {
        this.containedItems = containedItems;
    }
}
