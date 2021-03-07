package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetItemDefinitionsResponseItem {
    private String id;
    private Integer maxCount;
    private List<String> tags;
    private List<GetItemDefinitionsResponseItemContainer> containers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<GetItemDefinitionsResponseItemContainer> getContainers() {
        return containers;
    }

    public void setContainers(List<GetItemDefinitionsResponseItemContainer> containers) {
        this.containers = containers;
    }
}
