package com.nagajothy.smazee.yathrack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by SANTHOSH on 3/28/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public void addFragment(Fragment fragments,String tabTitles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
