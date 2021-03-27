package de.opengamebackend.quests.model.responses;

import java.util.List;

public class GetQuestDefinitionsResponse {
    private List<GetQuestDefinitionsResponseItem> questDefinitions;

    public List<GetQuestDefinitionsResponseItem> getQuestDefinitions() {
        return questDefinitions;
    }

    public void setQuestDefinitions(List<GetQuestDefinitionsResponseItem> questDefinitions) {
        this.questDefinitions = questDefinitions;
    }
}
