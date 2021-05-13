package com.samoye.lasgiditour_guide;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an adapter that knows which fragment should be shown on each page
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        // Set the adapter onto the view pager
        viewPager2.setAdapter(sectionsPagerAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabs = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        new TabLayoutMediator(tabs, viewPager2,
                (tab, position) ->{
                    if (position == 0) {
                        tab.setText(getString(R.string.best_hotels));
                    } else if (position == 1) {
                        tab.setText(getString(R.string.tourist_sites));
                    } else if (position == 2) {
                        tab.setText(getString(R.string.stadiums));
                    } else {
                        tab.setText(getString(R.string.about_lag));
                    }
                }
        ).attach();
    }
}