package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;

public class GetLoadoutTypesResponseType {
    private String id;
    private ArrayList<GetLoadoutTypesResponseTypeRule> rules;

    public GetLoadoutTypesResponseType() {
        rules = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<GetLoadoutTypesResponseTypeRule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<GetLoadoutTypesResponseTypeRule> rules) {
        this.rules = rules;
    }
}
