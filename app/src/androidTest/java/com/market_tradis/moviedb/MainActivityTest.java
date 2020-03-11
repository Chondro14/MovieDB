package com.market_tradis.moviedb;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;

import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.utils.DataMovie;
import com.market_tradis.moviedb.utils.DataTV;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {
    private ArrayList<Movie> movies= (ArrayList<Movie>) DataMovie.generateMovie();
    private ArrayList<TVShow> tvShows= (ArrayList<TVShow>) DataTV.getTVShow();

    @Rule
    public ActivityTestRule activityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Test
    public void loadMovie(){
        onView(withText("MOVIE")).perform(click());
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition(movies.size()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));
        onView(withId(R.id.title_movie_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.title_movie_detail)).check(matches(withText(movies.get(0).getMovieTitle())));
        onView(withId(R.id.release_datemv)).check(matches(isDisplayed()));
        onView(withId(R.id.release_datemv)).check(matches(withText(movies.get(0).getMovieDate())));
        onView(withId(R.id.overview_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.overview_movie)).check(matches(withText(movies.get(0).getMovieOverview())));
        onView(withId(R.id.backhome)).check(matches(isDisplayed()));
        onView(withId(R.id.backhome)).perform(click());
        onView(withText("TVSHOW")).perform(click());
        onView(withId(R.id.recycler_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.recycler_tv)).perform(RecyclerViewActions.scrollToPosition(tvShows.size()));
        onView(withId(R.id.recycler_tv)).perform(RecyclerViewActions.actionOnItemAtPosition(3,click()));
        onView(withId(R.id.title_tv_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.title_tv_detail)).check(matches(withText(tvShows.get(3).getTVTitle())));
        onView(withId(R.id.release_datetv)).check(matches(isDisplayed()));
        onView(withId(R.id.release_datetv)).check(matches(withText(tvShows.get(3).getTVDate())));
        onView(withId(R.id.overview_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.overview_tv)).check(matches(withText(tvShows.get(3).getTVOverview())));
        onView(withId(R.id.backhome2)).check(matches(isDisplayed()));
        onView(withId(R.id.backhome2)).perform(click());
    }


    @Test
    public void loadTV(){

    }


}