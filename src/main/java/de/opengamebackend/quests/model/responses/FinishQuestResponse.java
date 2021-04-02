package de.opengamebackend.quests.model.responses;

public class FinishQuestResponse {
    private String rewardItemDefinitionId;
    private int rewardItemCount;

    public String getRewardItemDefinitionId() {
        return rewardItemDefinitionId;
    }

    public void setRewardItemDefinitionId(String rewardItemDefinitionId) {
        this.rewardItemDefinitionId = rewardItemDefinitionId;
    }

    public int getRewardItemCount() {
        return rewardItemCount;
    }

    public void setRewardItemCount(int rewardItemCount) {
        this.rewardItemCount = rewardItemCount;
    }
}
