package com.market_tradis.moviedb.data;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShowRepsonse implements Parcelable {
    private String TVId;
    private String TVTitle;
    private String TVImage;
    private String TVOverview;

    public String getTVId() {
        return TVId;
    }

    public void setTVId(String TVId) {
        this.TVId = TVId;
    }

    public String getTVTitle() {
        return TVTitle;
    }

    public void setTVTitle(String TVTitle) {
        this.TVTitle = TVTitle;
    }

    public String getTVImage() {
        return TVImage;
    }

    public void setTVImage(String TVImage) {
        this.TVImage = TVImage;
    }

    public String getTVOverview() {
        return TVOverview;
    }

    public void setTVOverview(String TVOverview) {
        this.TVOverview = TVOverview;
    }

    public String getTVDate() {
        return TVDate;
    }

    public void setTVDate(String TVDate) {
        this.TVDate = TVDate;
    }

    public TVShowRepsonse(String TVId, String TVTitle, String TVImage, String TVOverview, String TVDate) {
        this.TVId = TVId;
        this.TVTitle = TVTitle;
        this.TVImage = TVImage;
        this.TVOverview = TVOverview;
        this.TVDate = TVDate;
    }

    private String TVDate;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.TVId);
        dest.writeString(this.TVTitle);
        dest.writeString(this.TVImage);
        dest.writeString(this.TVOverview);
        dest.writeString(this.TVDate);
    }

    protected TVShowRepsonse(Parcel in) {
        this.TVId = in.readString();
        this.TVTitle = in.readString();
        this.TVImage = in.readString();
        this.TVOverview = in.readString();
        this.TVDate = in.readString();
    }

    public static final Parcelable.Creator<TVShowRepsonse> CREATOR = new Parcelable.Creator<TVShowRepsonse>() {
        @Override
        public TVShowRepsonse createFromParcel(Parcel source) {
            return new TVShowRepsonse(source);
        }

        @Override
        public TVShowRepsonse[] newArray(int size) {
            return new TVShowRepsonse[size];
        }
    };
}
