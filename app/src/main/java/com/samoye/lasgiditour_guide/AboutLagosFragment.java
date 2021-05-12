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
 * Use the {@link AboutLagosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutLagosFragment extends Fragment {

    public AboutLagosFragment() {
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

        tourCategories.add(new TourCategory(getString(R.string.eko_hotel), getString(R.string.about_eko_hotel),  R.drawable.ic_eko_hotel));
        tourCategories.add(new TourCategory(getString(R.string.oriental_hotel), getString(R.string.about_oriental_hotel), R.drawable.ic_oriental_hotel));
        tourCategories.add(new TourCategory(getString(R.string.de_rembrandt_hotel), getString(R.string.about_de_rembrandt_hotel), R.drawable.ic_de_rembrandt_hotels));
        tourCategories.add(new TourCategory(getString(R.string.ibis_hotel), getString(R.string.about_ibis_hotel), R.drawable.ic_ibis_hotel));
        tourCategories.add(new TourCategory(getString(R.string.rollace_hotel), getString(R.string.about_rollace_hotel), R.drawable.ic_rollace_hotels));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tourCategories, R.color.tour_category_hotel);

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