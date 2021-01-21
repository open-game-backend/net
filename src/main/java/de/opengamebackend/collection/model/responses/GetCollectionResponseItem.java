package de.opengamebackend.collection.model.responses;

public class GetCollectionResponseItem {
    private String id;
    private String type;
    private int count;

    public GetCollectionResponseItem() {
    }

    public GetCollectionResponseItem(String id, String type, int count) {
        this.id = id;
        this.type = type;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
