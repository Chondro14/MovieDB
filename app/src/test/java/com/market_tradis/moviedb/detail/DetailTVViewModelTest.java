package com.market_tradis.moviedb.detail;

import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.utils.DataTV;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetailTVViewModelTest {
    private DetailTVViewModel viewModel;
    private TVShow dataTV= DataTV.getTVShow().get(0);
    private String tvId=dataTV.getTVId();

    @Before
    public void setUp(){
        viewModel=new DetailTVViewModel();
        viewModel.setSelectedTV(tvId);
    }


    @Test
    public void setSelectedTV() {
    }

    @Test
    public void getTV() {
        viewModel.setSelectedTV(dataTV.getTVId());
        TVShow tvShow=viewModel.getTV();
        assertNotNull(tvShow);
        assertEquals(dataTV.getTVId(),tvShow.getTVId());
        assertEquals(dataTV.getTVDate(),tvShow.getTVDate());
        assertEquals(dataTV.getTVImage(),tvShow.getTVImage());
        assertEquals(dataTV.getTVOverview(),tvShow.getTVOverview());
        assertEquals(dataTV.getTVTitle(),tvShow.getTVTitle());

    }
}