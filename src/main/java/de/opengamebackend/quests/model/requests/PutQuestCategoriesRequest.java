package de.opengamebackend.quests.model.requests;

import java.util.List;

public class PutQuestCategoriesRequest {
    private List<PutQuestCategoriesRequestItem> categories;

    public List<PutQuestCategoriesRequestItem> getCategories() {
        return categories;
    }

    public void setCategories(List<PutQuestCategoriesRequestItem> categories) {
        this.categories = categories;
    }
}
