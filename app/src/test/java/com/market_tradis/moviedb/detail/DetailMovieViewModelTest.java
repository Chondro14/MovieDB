package com.market_tradis.moviedb.detail;

import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.utils.DataMovie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetailMovieViewModelTest {
    private DetailMovieViewModel viewModel;
    private Movie dataMovie= DataMovie.generateMovie().get(0);
    private String movieId=dataMovie.getMovieId();

    @Before
    public void setUp(){
        viewModel=new DetailMovieViewModel();
        viewModel.setSelectedMovie(movieId);
    }


    @Test
    public void setSelectedMovie() {
    }

    @Test
    public void getMovie() {
        viewModel.setSelectedMovie(movieId);
        Movie movie=viewModel.getMovie();
        assertNotNull(movie);
        assertEquals(dataMovie.getMovieId(),movie.getMovieId());
        assertEquals(dataMovie.getMovieDate(),movie.getMovieDate());
        assertEquals(dataMovie.getMovieImage(),movie.getMovieImage());
        assertEquals(dataMovie.getMovieOverview(),movie.getMovieOverview());
        assertEquals(dataMovie.getMovieTitle(),movie.getMovieTitle());
    }
}