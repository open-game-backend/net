package de.opengamebackend.collection.model.requests;

import java.util.List;

public class PutLoadoutTypesRequestType {
    private String id;
    private List<PutLoadoutTypesRequestTypeRule> rules;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PutLoadoutTypesRequestTypeRule> getRules() {
        return rules;
    }

    public void setRules(List<PutLoadoutTypesRequestTypeRule> rules) {
        this.rules = rules;
    }
}
