package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemDefinitionsResponseItem {
    private String id;
    private List<String> tags;

    public GetItemDefinitionsResponseItem() {
    }

    public GetItemDefinitionsResponseItem(String id, List<String> tags) {
        this.id = id;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
