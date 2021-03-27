package de.opengamebackend.quests.model.requests;

public class PutQuestDefinitionsRequestItem {
    private String id;
    private String category;
    private int requiredProgress;
    private String rewardItemDefinitionId;
    private int rewardItemCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRequiredProgress() {
        return requiredProgress;
    }

    public void setRequiredProgress(int requiredProgress) {
        this.requiredProgress = requiredProgress;
    }

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
