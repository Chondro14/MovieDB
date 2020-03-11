package com.market_tradis.moviedb.data;

public class TVShow {
    private String TVId;
    private String TVTitle;
    private String TVImage;
    private String TVOverview;

    public String getTVId() {
        return TVId;
    }

    public String getTVTitle() {
        return TVTitle;
    }

    public String getTVImage() {
        return TVImage;
    }

    public String getTVOverview() {
        return TVOverview;
    }

    public String getTVDate() {
        return TVDate;
    }

    public TVShow(String TVId, String TVTitle, String TVImage, String TVOverview, String TVDate) {
        this.TVId = TVId;
        this.TVTitle = TVTitle;
        this.TVImage = TVImage;
        this.TVOverview = TVOverview;
        this.TVDate = TVDate;
    }

    private String TVDate;
}
