package de.opengamebackend.collection.model.responses;

public class GetLoadoutTypesResponseTypeRule {
    private String itemTag;
    private Integer minTotal;
    private Integer maxTotal;
    private Integer maxCopies;

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
    }

    public Integer getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(Integer minTotal) {
        this.minTotal = minTotal;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Integer getMaxCopies() {
        return maxCopies;
    }

    public void setMaxCopies(Integer maxCopies) {
        this.maxCopies = maxCopies;
    }
}
