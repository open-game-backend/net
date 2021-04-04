package de.opengamebackend.quests.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutQuestCategoriesRequest {
    private List<PutQuestCategoriesRequestItem> categories;

    public PutQuestCategoriesRequest() {
        categories = new ArrayList<>();
    }

    public List<PutQuestCategoriesRequestItem> getCategories() {
        return categories;
    }

    public void setCategories(List<PutQuestCategoriesRequestItem> categories) {
        this.categories = categories;
    }
}
