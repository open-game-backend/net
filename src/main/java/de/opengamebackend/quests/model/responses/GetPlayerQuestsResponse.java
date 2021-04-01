package de.opengamebackend.quests.model.responses;

import java.util.List;

public class GetPlayerQuestsResponse {
    private List<GetPlayerQuestsResponseItem> quests;

    public List<GetPlayerQuestsResponseItem> getQuests() {
        return quests;
    }

    public void setQuests(List<GetPlayerQuestsResponseItem> quests) {
        this.quests = quests;
    }
}
