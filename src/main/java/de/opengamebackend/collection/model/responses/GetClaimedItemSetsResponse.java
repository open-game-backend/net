package de.opengamebackend.collection.model.responses;

import java.util.List;

public class GetClaimedItemSetsResponse {
    private List<String> claimedItemSets;

    public GetClaimedItemSetsResponse() {
    }

    public GetClaimedItemSetsResponse(List<String> claimedItemSets) {
        this.claimedItemSets = claimedItemSets;
    }

    public List<String> getClaimedItemSets() {
        return claimedItemSets;
    }

    public void setClaimedItemSets(List<String> claimedItemSets) {
        this.claimedItemSets = claimedItemSets;
    }
}
