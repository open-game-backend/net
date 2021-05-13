package de.opengamebackend.auth.model.responses;

import java.util.ArrayList;
import java.util.List;

public class GetSecretKeysResponse {
    private List<String> keys;

    public GetSecretKeysResponse() {
        this.keys = new ArrayList<>();
    }

    public GetSecretKeysResponse(List<String> keys) {
        this.keys = keys;
    }

    public List<String> getKeys() {
        return keys;
    }
}
