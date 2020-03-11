package com.market_tradis.moviedb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.market_tradis.moviedb.SectioanPager.SectionPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionPager sectionPager=new SectionPager(getSupportFragmentManager(), this);
        ViewPager pager=findViewById(R.id.viewpager);
        pager.setAdapter(sectionPager);
        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }
    }
}
