package com.nagajothy.smazee.yathrack;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TabLayout tablayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    Toolbar toolbar;
    private int[] tabIcons = {
            R.drawable.history_icon,
            R.drawable.live_status,
            R.drawable.information
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new History(), "History");
        viewPagerAdapter.addFragment(new LiveStatus(), "Live Status");
        viewPagerAdapter.addFragment(new Information(), "Information");

        viewPager.setAdapter(viewPagerAdapter);
        tablayout.setupWithViewPager(viewPager);
        setupTabIcons();


        //toolbar = (Toolbar)findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }
    private void setupTabIcons() {
        tablayout.getTabAt(0).setIcon(tabIcons[0]);
        tablayout.getTabAt(1).setIcon(tabIcons[1]);
        tablayout.getTabAt(2).setIcon(tabIcons[2]);
    }

}
