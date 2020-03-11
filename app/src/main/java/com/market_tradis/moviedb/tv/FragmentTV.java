package com.market_tradis.moviedb.tv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.repository.ViewModelFactory;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTV extends Fragment implements InterfaceTV {
    private RecyclerView recyclerViewYV;
    private ProgressBar progressBarYV;

    public FragmentTV() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t_v, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewYV=view.findViewById(R.id.recycler_tv);
        progressBarYV=view.findViewById(R.id.progress_bartv);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       if(getActivity()!=null){
           ViewModelFactory factory=ViewModelFactory.getInstance(getActivity());
           TVModelView modelView=new ViewModelProvider(this,factory).get(TVModelView.class);
           List<TVShow> tvShows= (List<TVShow>) modelView.getTVShow();
           progressBarYV.setVisibility(View.VISIBLE);
           modelView.getTVShow().observe(getViewLifecycleOwner(),tvShows1 -> {
               progressBarYV.setVisibility(View.GONE);
               TVAdapter adapter=new TVAdapter();
               adapter.setTvShowList(tvShows);
               recyclerViewYV.setAdapter(adapter);
               adapter.notifyDataSetChanged();
           });



           recyclerViewYV.setLayoutManager(new LinearLayoutManager(getActivity()));

           recyclerViewYV.setHasFixedSize(true);
       }
    }
    @Override
    public  void onShareClick(TVShow tv){
        if(getActivity()!=null){
            String type="text/plain";
            ShareCompat.IntentBuilder.from(getActivity()).setType(type).setText("Halooo kak untuk movie yang lagi ngehitzzz adalah"+tv.getTVTitle()).startChooser();
        }

    }
}
