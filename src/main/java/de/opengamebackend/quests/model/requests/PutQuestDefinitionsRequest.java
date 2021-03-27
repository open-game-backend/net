package de.opengamebackend.quests.model.requests;

import java.util.List;

public class PutQuestDefinitionsRequest {
    private List<PutQuestDefinitionsRequestItem> questDefinitions;

    public List<PutQuestDefinitionsRequestItem> getQuestDefinitions() {
        return questDefinitions;
    }

    public void setQuestDefinitions(List<PutQuestDefinitionsRequestItem> questDefinitions) {
        this.questDefinitions = questDefinitions;
    }
}
