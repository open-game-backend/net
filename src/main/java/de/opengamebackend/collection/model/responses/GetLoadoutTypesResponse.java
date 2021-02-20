package de.opengamebackend.collection.model.responses;

import java.util.ArrayList;

public class GetLoadoutTypesResponse {
    private ArrayList<GetLoadoutTypesResponseType> loadoutTypes;

    public GetLoadoutTypesResponse() {
        loadoutTypes = new ArrayList<>();
    }

    public ArrayList<GetLoadoutTypesResponseType> getLoadoutTypes() {
        return loadoutTypes;
    }

    public void setLoadoutTypes(ArrayList<GetLoadoutTypesResponseType> loadoutTypes) {
        this.loadoutTypes = loadoutTypes;
    }
}
