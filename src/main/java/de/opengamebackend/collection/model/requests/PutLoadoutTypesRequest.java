package de.opengamebackend.collection.model.requests;

import java.util.ArrayList;
import java.util.List;

public class PutLoadoutTypesRequest {
    private List<PutLoadoutTypesRequestType> loadoutTypes;

    public PutLoadoutTypesRequest() {
        loadoutTypes = new ArrayList<>();
    }

    public List<PutLoadoutTypesRequestType> getLoadoutTypes() {
        return loadoutTypes;
    }

    public void setLoadoutTypes(List<PutLoadoutTypesRequestType> loadoutTypes) {
        this.loadoutTypes = loadoutTypes;
    }
}
