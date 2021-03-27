package de.opengamebackend.quests.model.requests;

public class PutQuestCategoriesRequestItem {
    private String id;
    private Integer generationHourOfDay;
    private Integer generationDayOfWeek;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getGenerationHourOfDay() {
        return generationHourOfDay;
    }

    public void setGenerationHourOfDay(Integer generationHourOfDay) {
        this.generationHourOfDay = generationHourOfDay;
    }

    public Integer getGenerationDayOfWeek() {
        return generationDayOfWeek;
    }

    public void setGenerationDayOfWeek(Integer generationDayOfWeek) {
        this.generationDayOfWeek = generationDayOfWeek;
    }
}
