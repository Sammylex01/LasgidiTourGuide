package com.samoye.lasgiditour_guide;

public class TourCategory {

    private String mTitle;

    private String mText;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public TourCategory(String title, String text, int imageResourceId) {
        mTitle = title;
        mText = text;
        mImageResourceId = imageResourceId;

    }

    // get the title of tour category
    public String getTitle() {
        return mTitle;
    }

    // get the text of tour category
    public String getText() {
        return mText;
    }

    // get the image of tour category
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

