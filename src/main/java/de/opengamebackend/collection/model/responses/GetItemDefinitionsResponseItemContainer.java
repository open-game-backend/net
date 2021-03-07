package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemDefinitionsResponseItemContainer {
    private int itemCount;
    private List<GetItemDefinitionsResponseItemContainerItem> containedItems;

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public List<GetItemDefinitionsResponseItemContainerItem> getContainedItems() {
        return containedItems;
    }

    public void setContainedItems(List<GetItemDefinitionsResponseItemContainerItem> containedItems) {
        this.containedItems = containedItems;
    }
}
