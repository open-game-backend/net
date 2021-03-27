package de.opengamebackend.quests.model.responses;

import java.util.ArrayList;

public class GetQuestCategoriesResponse {
    private ArrayList<GetQuestCategoriesReponseItem> categories;

    public ArrayList<GetQuestCategoriesReponseItem> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<GetQuestCategoriesReponseItem> categories) {
        this.categories = categories;
    }
}
