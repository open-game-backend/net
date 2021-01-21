package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;
import java.util.HashMap;

public class GetCollectionResponse {
    private ArrayList<GetCollectionResponseItem> collection;

    public GetCollectionResponse() {
    }

    public GetCollectionResponse(ArrayList<GetCollectionResponseItem> collection) {
        this.collection = collection;
    }

    public ArrayList<GetCollectionResponseItem> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<GetCollectionResponseItem> collection) {
        this.collection = collection;
    }
}
