package com.samoye.lasgiditour_guide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<TourCategory> {

    //resource id for background color for this list of word
    private int mColorResourceId;

    public TourAdapter(Activity context, ArrayList<TourCategory> tourCategories, int colorResourceId) {
        super(context, 0, tourCategories);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check the existing view group is being reused, other wise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        //get the{@link word} object located at this position in the list
        TourCategory currentTourCategoryCategory = getItem(position);

        TextView attractionDescriptionTV = (TextView) ListItemView.findViewById(R.id.tour_category_title_text_view);
        attractionDescriptionTV.setText(currentTourCategoryCategory.getTitle());

        TextView textCategoryTextView = (TextView) ListItemView.findViewById(R.id.tour_category_text_text_view);
        textCategoryTextView.setText(currentTourCategoryCategory.getText());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView attractionImageView = (ImageView) ListItemView.findViewById(R.id.image);

        // Set the ImageView to the image resource specified in the current Word
        attractionImageView.setImageResource(currentTourCategoryCategory.getImageResourceId());

        //set the theme for the list item
        View textContainer = ListItemView.findViewById(R.id.text_container);

        // find the color that resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return ListItemView;
    }
}
