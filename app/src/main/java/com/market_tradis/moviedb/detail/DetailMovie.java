package com.market_tradis.moviedb.detail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.market_tradis.moviedb.MainActivity;
import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.repository.ViewModelFactory;

public class DetailMovie extends AppCompatActivity {

    public static final String MOVIE ="mOVIE" ;
    TextView TitleMovie,ReleaseDateMovie,OverviewMovie;
    ImageView imageMovie;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        TitleMovie=findViewById(R.id.title_movie_detail);
        ReleaseDateMovie=findViewById(R.id.release_datemv);
        OverviewMovie=findViewById(R.id.overview_movie);
        imageMovie=findViewById(R.id.image_movie);
        imageButton=findViewById(R.id.backhome);


        ViewModelFactory modelFactory=ViewModelFactory.getInstance(this);
        DetailMovieViewModel viewModel=new ViewModelProvider(this,modelFactory).get(DetailMovieViewModel.class);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String movieid=extras.getString(MOVIE);
            viewModel.setSelectedMovie(movieid);
            viewModel.getMovie().observe(this,movies -> Movie((Movie) movies));

        }
        imageButton.setOnClickListener(v -> {
            Intent intent=new Intent(DetailMovie.this, MainActivity.class);
            startActivity(intent);
        });
    }
    private void Movie(Movie movie){
        TitleMovie.setText(movie.getMovieTitle());
        ReleaseDateMovie.setText(movie.getMovieDate());
        OverviewMovie.setText(movie.getMovieOverview());
        Glide.with(this).load(movie.getMovieImage()).into(imageMovie);
    }
}
