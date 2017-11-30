package com.theallasia.nhuda.salestarget;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionsStatePagerAdapter mSectionsStatePagerAdapte;
    private ViewPager mViewPager;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        mSectionsStatePagerAdapte = new SectionsStatePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        //setup the pager
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Dashboard(), "Dasboard");
        adapter.addFragment(new Target(), "Target");
        viewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }


}
