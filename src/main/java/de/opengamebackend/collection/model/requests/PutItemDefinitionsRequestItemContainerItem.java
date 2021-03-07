package de.opengamebackend.collection.model.requests;

import java.util.List;

public class PutItemDefinitionsRequestItemContainerItem {
    private List<String> requiredTags;
    private int relativeProbability;

    public List<String> getRequiredTags() {
        return requiredTags;
    }

    public void setRequiredTags(List<String> requiredTags) {
        this.requiredTags = requiredTags;
    }

    public int getRelativeProbability() {
        return relativeProbability;
    }

    public void setRelativeProbability(int relativeProbability) {
        this.relativeProbability = relativeProbability;
    }
}
