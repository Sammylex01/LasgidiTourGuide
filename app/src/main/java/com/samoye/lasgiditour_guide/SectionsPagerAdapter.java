package com.samoye.lasgiditour_guide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {
    public SectionsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new BestHotelsFragment();
        } else if (position == 1) {
            return new TouristSiteFragment();
        } else if (position == 2) {
            return new StadiumsFragment();
        } else  {
            return new AboutLagosFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getItemCount() {
        return 4;
    }
}