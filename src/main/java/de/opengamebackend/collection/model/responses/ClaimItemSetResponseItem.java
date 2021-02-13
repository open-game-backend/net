package de.opengamebackend.collection.model.responses;

public class ClaimItemSetResponseItem {
    private String id;
    private int count;

    public ClaimItemSetResponseItem() {
    }

    public ClaimItemSetResponseItem(String id, int count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
