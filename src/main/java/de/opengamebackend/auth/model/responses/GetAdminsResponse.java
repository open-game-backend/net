package de.opengamebackend.auth.model.responses;

import java.util.ArrayList;
import java.util.List;

public class GetAdminsResponse {
    private List<GetAdminsResponseAdmin> admins;

    public GetAdminsResponse() {
        this.admins = new ArrayList<>();
    }

    public GetAdminsResponse(List<GetAdminsResponseAdmin> admins) {
        this.admins = admins;
    }

    public List<GetAdminsResponseAdmin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<GetAdminsResponseAdmin> admins) {
        this.admins = admins;
    }
}
