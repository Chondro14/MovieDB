package com.market_tradis.moviedb.tv;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.data.TVShow;
import com.market_tradis.moviedb.detail.DetailTV;

import java.util.ArrayList;
import java.util.List;

public class TVAdapter extends RecyclerView.Adapter<TVAdapter.TVViewHolder> {
    private List<TVShow> tvShowList=new ArrayList<>();

    void setTvShowList(List<TVShow> showList){
        if(tvShowList==null)return;
        tvShowList.clear();
        tvShowList.addAll(showList);
    }
    @NonNull
    @Override
    public TVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv,parent,false);
        return new TVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TVViewHolder holder, int position) {
        TVShow tvShow=tvShowList.get(position);
        holder.bind(tvShow);

    }

    @Override
    public int getItemCount() {
        return tvShowList.size();
    }

    static class TVViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvDescription;
        final TextView tvDate;
        final ImageView tvimgPoster;
        final CardView cardViewTv;
        TVViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tv_mv_title);
            tvDescription=itemView.findViewById(R.id.tv_mv_description);
            tvDate=itemView.findViewById(R.id.tv_mv_date);
            tvimgPoster=itemView.findViewById(R.id.img_mv_poster);
            cardViewTv=itemView.findViewById(R.id.item_cardviewMv);
        }
        void bind(TVShow tvShow){
            tvTitle.setText(tvShow.getTVTitle());
            tvDate.setText(tvShow.getTVDate());
            tvDescription.setText(tvShow.getTVOverview());
            Glide.with(itemView.getContext()).load(tvShow.getTVImage()).into(tvimgPoster);
            cardViewTv.setOnClickListener(v -> {
                Intent intent=new Intent(itemView.getContext(), DetailTV.class);
                intent.putExtra(DetailTV.TV,tvShow.getTVId());
                itemView.getContext().startActivity(intent);
            });
        }
    }
}
