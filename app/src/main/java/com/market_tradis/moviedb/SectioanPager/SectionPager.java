package com.market_tradis.moviedb.SectioanPager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.market_tradis.moviedb.R;
import com.market_tradis.moviedb.movie.FragmentMovie;
import com.market_tradis.moviedb.tv.FragmentTV;

public class SectionPager extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES=new int[]{R.string.movie,R.string.tvshow};
    private final Context mcontext;
    public SectionPager(@NonNull FragmentManager fm, Context mcontext) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentMovie();
            case 1:
                return new FragmentTV();
            default:
                return new Fragment();
        }

    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mcontext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
