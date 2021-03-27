package de.opengamebackend.quests.model.responses;

import java.util.ArrayList;

public class GetQuestCategoriesResponse {
    private ArrayList<GetQuestCategoriesResponseItem> categories;

    public ArrayList<GetQuestCategoriesResponseItem> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<GetQuestCategoriesResponseItem> categories) {
        this.categories = categories;
    }
}
