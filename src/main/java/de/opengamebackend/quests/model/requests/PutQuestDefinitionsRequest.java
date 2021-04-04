package de.opengamebackend.quests.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutQuestDefinitionsRequest {
    private List<PutQuestDefinitionsRequestItem> questDefinitions;

    public PutQuestDefinitionsRequest() {
        questDefinitions = new ArrayList<>();
    }

    public List<PutQuestDefinitionsRequestItem> getQuestDefinitions() {
        return questDefinitions;
    }

    public void setQuestDefinitions(List<PutQuestDefinitionsRequestItem> questDefinitions) {
        this.questDefinitions = questDefinitions;
    }
}
