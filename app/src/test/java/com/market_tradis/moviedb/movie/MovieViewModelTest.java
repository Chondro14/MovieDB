package com.market_tradis.moviedb.movie;

import com.market_tradis.moviedb.data.Movie;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieViewModelTest {
    private MovieViewModel viewModel;

    @Before
    public void setUp(){
        viewModel=new MovieViewModel();
    }

    @Test
    public void getMovie() {
        List<Movie> movies=viewModel.getMovie();
        assertNotNull(movies);
        assertEquals(13,movies.size());
    }
}