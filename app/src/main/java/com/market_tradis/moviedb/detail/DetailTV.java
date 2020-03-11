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
import com.market_tradis.moviedb.data.TVShow;

public class DetailTV extends AppCompatActivity {

    public static final String TV ="tv" ;
    TextView TitleTV,ReleaseDateTV,OverviewTV;
    ImageView imageTV;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_t_v);
        TitleTV=findViewById(R.id.title_tv_detail);
        ReleaseDateTV=findViewById(R.id.release_datetv);
        OverviewTV=findViewById(R.id.overview_tv);
        imageTV=findViewById(R.id.image_tv);
        imageButton2=findViewById(R.id.backhome2);

        DetailTVViewModel viewModel=new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(DetailTVViewModel.class);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String tvId=extras.getString(TV);
            viewModel.setSelectedTV(tvId);
            viewModel.getTV().observe(this,tvShows -> TV((TVShow) tvShows));
        }
        imageButton2.setOnClickListener(v -> {
            Intent intent1=new Intent(DetailTV.this, MainActivity.class);
            startActivity(intent1);
        });
    }
    private void TV(TVShow tvShow){
        TitleTV.setText(tvShow.getTVTitle());
        ReleaseDateTV.setText(tvShow.getTVDate());
        OverviewTV.setText(tvShow.getTVOverview());
        Glide.with(this).load(tvShow.getTVImage()).into(imageTV);
    }

}
