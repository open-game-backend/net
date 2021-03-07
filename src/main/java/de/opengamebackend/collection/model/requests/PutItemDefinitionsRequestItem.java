package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutItemDefinitionsRequestItem {
    private String id;
    private Integer maxCount;
    private List<String> tags;
    private List<PutItemDefinitionsRequestItemContainer> containers;

    public PutItemDefinitionsRequestItem() {
        tags = new ArrayList<>();
        containers = new ArrayList<>();
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

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public List<PutItemDefinitionsRequestItemContainer> getContainers() {
        return containers;
    }

    public void setContainers(List<PutItemDefinitionsRequestItemContainer> containers) {
        this.containers = containers;
    }
}
