package de.opengamebackend.quests.model.responses;

import java.util.ArrayList;

public class CreateQuestsResponse {
    private ArrayList<CreateQuestsResponseItem> quests;

    public CreateQuestsResponse() {
        quests = new ArrayList<>();
    }

    public ArrayList<CreateQuestsResponseItem> getQuests() {
        return quests;
    }

    public void setQuests(ArrayList<CreateQuestsResponseItem> quests) {
        this.quests = quests;
    }
}
