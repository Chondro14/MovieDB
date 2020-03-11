package com.market_tradis.moviedb.data;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    private String MovieId;
    @SerializedName("title")
    private String MovieTitle;
    @SerializedName("poster_path")
    private String MovieImage;
    @SerializedName("overview")
    private String MovieOverview;
    @SerializedName("release_date")
    private String MovieDate;

    public Movie(String movieId, String movieTitle, String movieImage, String movieOverview, String movieDate) {
        MovieId = movieId;
        MovieTitle = movieTitle;
        MovieImage = movieImage;
        MovieOverview = movieOverview;
        MovieDate = movieDate;
    }

    public String getMovieId() {
        return MovieId;
    }

    public String getMovieTitle() {
        return MovieTitle;
    }

    public String getMovieImage() {
        return MovieImage;
    }

    public String getMovieOverview() {
        return MovieOverview;
    }

    public String getMovieDate() {
        return MovieDate;
    }

}
