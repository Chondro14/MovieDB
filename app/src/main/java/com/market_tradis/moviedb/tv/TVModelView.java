package com.market_tradis.moviedb.tv;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.repository.MVTVRespository;

import java.util.List;

public class TVModelView extends ViewModel {
    private MVTVRespository respository;

    public TVModelView(MVTVRespository respository) {
        this.respository=respository;
    }

    LiveData<List<TVShow>> getTVShow(){
        return respository.getAllTVShow();
    }
}
