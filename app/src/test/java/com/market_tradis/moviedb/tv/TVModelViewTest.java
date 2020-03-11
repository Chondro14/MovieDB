package com.market_tradis.moviedb.tv;

import com.market_tradis.moviedb.data.TVShow;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TVModelViewTest {
    private TVModelView modelView;

    @Before
    public void setUp(){
        modelView=new TVModelView();
    }

    @Test
    public void getTVShow() {
        List<TVShow> tvShows=modelView.getTVShow();
        assertNotNull(tvShows);
        assertEquals(11,tvShows.size());
    }
}