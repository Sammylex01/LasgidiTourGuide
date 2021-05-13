package com.samoye.lasgiditour_guide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class StadiumsFragment extends Fragment {

    public StadiumsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_category_list, container, false);

        // Create a list of tours
        final ArrayList<TourCategory> tourCategories = new ArrayList<TourCategory>();

        tourCategories.add(new TourCategory(getString(R.string.national_stadium), getString(R.string.about_national_stadium), R.drawable.ic_national_staduim_lagos));
        tourCategories.add(new TourCategory(getString(R.string.teslim_stadium), getString(R.string.about_teslim_stadium), R.drawable.ic_teslim_balogun_stadium));
        tourCategories.add(new TourCategory(getString(R.string.onikan_stadium), getString(R.string.about_onikan_stadium), R.drawable.ic_onikan_stadium));
        tourCategories.add(new TourCategory(getString(R.string.agege_stadium), getString(R.string.about_agege_stadium), R.drawable.ic_agege_stadium));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tourCategories, R.color.tour_category_stadiums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                TourCategory tourCategory = tourCategories.get(position);

            }
        });

        return rootView;
    }
}