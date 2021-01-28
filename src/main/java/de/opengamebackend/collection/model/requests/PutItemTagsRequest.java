package de.opengamebackend.collection.model.requests;

import java.util.List;

public class PutItemTagsRequest {
    private List<String> itemTags;

    public PutItemTagsRequest() {
    }

    public PutItemTagsRequest(List<String> itemTags) {
        this.itemTags = itemTags;
    }

    public List<String> getItemTags() {
        return itemTags;
    }

    public void setItemTags(List<String> itemTags) {
        this.itemTags = itemTags;
    }
}
