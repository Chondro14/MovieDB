package com.market_tradis.moviedb.movie;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.detail.DetailMovie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Movie> movieList=new ArrayList<>();

    void setMovieList(LiveData<List<Movie>> movie){
        if(movieList==null)return;
        movieList.clear();
        movieList.addAll((Collection<? extends Movie>) movie);
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie= movieList.get(position);
        holder.bind(movie);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        final TextView mvTitle;
        final TextView mvDescription;
        final TextView mvDate;
        final ImageView mvimgPoster;
        final CardView cardViewMv;
        MovieViewHolder(@NonNull View itemView) {

            super(itemView);
            mvTitle=itemView.findViewById(R.id.tv_mv_title);
            mvDescription=itemView.findViewById(R.id.tv_mv_description);
            mvDate=itemView.findViewById(R.id.tv_mv_date);
            mvimgPoster=itemView.findViewById(R.id.img_mv_poster);
            cardViewMv=itemView.findViewById(R.id.item_cardviewMv);
        }
        void bind(Movie movie){
            mvTitle.setText(movie.getMovieTitle());
            mvDate.setText(movie.getMovieDate());
            mvDescription.setText(movie.getMovieOverview());
            Glide.with(itemView.getContext()).load(movie.getMovieImage()).into(mvimgPoster);
            cardViewMv.setOnClickListener(v -> {
                Intent intent=new Intent(itemView.getContext(), DetailMovie.class);
                intent.putExtra(DetailMovie.MOVIE,movie.getMovieId());
                itemView.getContext().startActivity(intent);
            });
        }

    }
}
