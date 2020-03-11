package com.market_tradis.moviedb.data;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieResponse implements Parcelable {
    private String MovieId;
    private String MovieTitle;
    private String MovieImage;
    private String MovieOverview;
    private String MovieDate;

    public String getMovieId() {
        return MovieId;
    }

    public void setMovieId(String movieId) {
        MovieId = movieId;
    }

    public String getMovieTitle() {
        return MovieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        MovieTitle = movieTitle;
    }

    public String getMovieImage() {
        return MovieImage;
    }

    public void setMovieImage(String movieImage) {
        MovieImage = movieImage;
    }

    public String getMovieOverview() {
        return MovieOverview;
    }

    public void setMovieOverview(String movieOverview) {
        MovieOverview = movieOverview;
    }

    public String getMovieDate() {
        return MovieDate;
    }

    public void setMovieDate(String movieDate) {
        MovieDate = movieDate;
    }

    public MovieResponse(String movieId, String movieTitle, String movieImage, String movieOverview, String movieDate) {
        MovieId = movieId;
        MovieTitle = movieTitle;
        MovieImage = movieImage;
        MovieOverview = movieOverview;
        MovieDate = movieDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.MovieId);
        dest.writeString(this.MovieTitle);
        dest.writeString(this.MovieImage);
        dest.writeString(this.MovieOverview);
        dest.writeString(this.MovieDate);
    }

    protected MovieResponse(Parcel in) {
        this.MovieId = in.readString();
        this.MovieTitle = in.readString();
        this.MovieImage = in.readString();
        this.MovieOverview = in.readString();
        this.MovieDate = in.readString();
    }

    public static final Parcelable.Creator<MovieResponse> CREATOR = new Parcelable.Creator<MovieResponse>() {
        @Override
        public MovieResponse createFromParcel(Parcel source) {
            return new MovieResponse(source);
        }

        @Override
        public MovieResponse[] newArray(int size) {
            return new MovieResponse[size];
        }
    };
}




