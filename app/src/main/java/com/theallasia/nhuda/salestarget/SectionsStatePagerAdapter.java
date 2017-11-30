package com.theallasia.nhuda.salestarget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nhuda on 11/10/2017.
 */

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mfragmentlist = new ArrayList<>();
    private final List<String> mfragmenTitlelist = new ArrayList<>();

    public SectionsStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title){
        mfragmentlist.add(fragment);
        mfragmenTitlelist.add(title);
    }

    @Override
    public Fragment getItem(int position) {

        return mfragmentlist.get(position);
    }

    @Override
    public int getCount() {

        return mfragmentlist.size();
    }
}
