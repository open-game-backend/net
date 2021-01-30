package de.opengamebackend.collection.model.requests;

import java.util.List;

public class PutItemDefinitionsRequestItem {
    private String id;
    private List<String> tags;

    public PutItemDefinitionsRequestItem() {
    }

    public PutItemDefinitionsRequestItem(String id, List<String> tags) {
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
