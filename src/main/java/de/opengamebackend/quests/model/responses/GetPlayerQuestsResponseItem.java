package de.opengamebackend.quests.model.responses;

import java.time.OffsetDateTime;

public class GetPlayerQuestsResponseItem {
    private long id;
    private String questCategoryId;
    private String questDefinitionId;
    private int requiredProgress;
    private int currentProgress;
    private String rewardItemDefinitionId;
    private int rewardItemCount;
    private OffsetDateTime generatedAt;
    private OffsetDateTime completedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestCategoryId() {
        return questCategoryId;
    }

    public void setQuestCategoryId(String questCategoryId) {
        this.questCategoryId = questCategoryId;
    }

    public String getQuestDefinitionId() {
        return questDefinitionId;
    }

    public void setQuestDefinitionId(String questDefinitionId) {
        this.questDefinitionId = questDefinitionId;
    }

    public int getRequiredProgress() {
        return requiredProgress;
    }

    public void setRequiredProgress(int requiredProgress) {
        this.requiredProgress = requiredProgress;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
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

    public OffsetDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(OffsetDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }

    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }
}
