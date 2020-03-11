package com.market_tradis.moviedb.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.repository.MVTVRespository;

import java.util.List;

public class DetailTVViewModel extends ViewModel {
    private String TVId;
    private MVTVRespository respository;

    public DetailTVViewModel(MVTVRespository respository) {
        this.respository=respository;
    }
    public LiveData<TVShow> setSelectedTV(String TVId) {
        this.TVId= TVId;
        return respository.setAllTVShow(TVId);
    }

    public LiveData<List<TVShow>> getTV(){
        return respository.getAllTVShow();
    }
}
