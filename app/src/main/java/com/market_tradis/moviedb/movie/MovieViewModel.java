package com.market_tradis.moviedb.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.repository.MVTVRespository;

import java.util.List;

public class MovieViewModel extends ViewModel {
    private MVTVRespository respository;

    public MovieViewModel(MVTVRespository respository) {
        this.respository=respository;
    }

    public LiveData<List<Movie>> getMovie(){
        return respository.getAllMoview();
    }


}
