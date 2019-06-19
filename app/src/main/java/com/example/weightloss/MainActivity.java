package com.example.weightloss;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.weightloss.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private  SectionsPagerAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate:String.");

        mSectionsPageAdapter=new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager=findViewById(R.id.view_pager);
        setupViewPager(mViewPager);


        TabLayout tabLayout;
        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    public void setupViewPager(ViewPager viewPager){

        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1_Fragment(),"TAB1");
        adapter.addFragment(new Tab2_Fragment(),"TAB2");
        adapter.addFragment(new Tab3_Fragment(),"TAB3");
        viewPager.setAdapter(adapter);

    }
}