package com.market_tradis.moviedb.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.repository.MVTVRespository;

import java.util.List;

public class DetailMovieViewModel extends ViewModel {
    MVTVRespository respository;
    private String MovieId;

    public DetailMovieViewModel(MVTVRespository respository) {
        this.respository=respository;
    }

    public LiveData<Movie> setSelectedMovie(String MovieId) {
        this.MovieId = MovieId;
        return respository.setAllMoview(MovieId);
    }
    public LiveData<List<Movie>> getMovie(){
        return respository.getAllMoview();
    }

}
