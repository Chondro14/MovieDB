package com.market_tradis.moviedb.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.data.Movie;
import com.market_tradis.moviedb.repository.ViewModelFactory;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMovie extends Fragment implements InterfaceMovie {
    private RecyclerView recyclerViewMV;
    private ProgressBar progressBar;

    public FragmentMovie() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewMV=view.findViewById(R.id.rv_movie);
        progressBar=view.findViewById(R.id.progress_bar);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getActivity()!=null){
            ViewModelFactory modelFactory=ViewModelFactory.getInstance(getActivity());
            MovieViewModel viewModel=new ViewModelProvider(this, modelFactory).get(MovieViewModel.class);
            LiveData<List<Movie>> movies=  viewModel.getMovie();
            progressBar.setVisibility(View.VISIBLE);
            viewModel.getMovie().observe(getViewLifecycleOwner(),movies1 -> {
                progressBar.setVisibility(View.GONE);
                MovieAdapter movieAdapter=new MovieAdapter();
                movieAdapter.setMovieList(movies);
                recyclerViewMV.setAdapter(movieAdapter);
                movieAdapter.notifyDataSetChanged();

            });


            recyclerViewMV.setLayoutManager(new LinearLayoutManager(getActivity()));

            recyclerViewMV.setHasFixedSize(true);

        }
    }
    @Override
    public  void onShareClick(Movie movie){
        if(getActivity()!=null){
            String type="text/plain";
            ShareCompat.IntentBuilder.from(getActivity()).setType(type).setText("Halooo kak untuk movie yang lagi ngehitzzz adalah"+movie.getMovieTitle()).startChooser();
        }

    }
}
