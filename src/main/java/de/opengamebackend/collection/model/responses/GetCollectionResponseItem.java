package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetCollectionResponseItem {
    private String id;
    private int count;
    private List<String> tags;

    public GetCollectionResponseItem() {
    }

    public GetCollectionResponseItem(String id, int count, List<String> tags) {
        this.id = id;
        this.count = count;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
