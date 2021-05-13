package de.opengamebackend.auth.model.responses;

public class GenerateSecretKeyResponse {
    private String key;

    public GenerateSecretKeyResponse() {
    }

    public GenerateSecretKeyResponse(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
