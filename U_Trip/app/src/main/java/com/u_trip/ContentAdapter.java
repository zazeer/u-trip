package com.u_trip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentAdapter extends BaseAdapter {
    int[] placeImage;
    String[] Title;
    double[] Rating;
    String[] Comments;
    String[] Price;
    String[] ShortDescription;
    Context context;
    LayoutInflater inflater;



    @Override
    public int getCount() {
        return Rating.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    public ContentAdapter(Context context, int[] placeImage, String[] title, double[] rating, String[] comments, String[] price, String[] shortDescription) {
        this.context = context;
        this.placeImage = placeImage;
        Title = title;
        Rating = rating;
        Comments = comments;
        Price = price;
        ShortDescription = shortDescription;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_nearby_place_lvtemplate, null);

        ImageView placeImageView = view.findViewById(R.id.placeImageData);
        TextView titleText = view.findViewById(R.id.titleData);
        ImageView starImage = view.findViewById(R.id.starImageData);
        TextView ratingText = view.findViewById(R.id.ratingTextData);
        ImageView commentImage = view.findViewById(R.id.commentsImageData);
        TextView commentsText = view.findViewById(R.id.commentsTextData);
        TextView priceText = view.findViewById(R.id.priceData);
        TextView shortDescriptionText = view.findViewById(R.id.shortDescriptionData);
        Button detailsButton = view.findViewById(R.id.buttonDetails);

        placeImageView.setImageResource(placeImage[i]);
        titleText.setText(Title[i]);
        starImage.setImageResource(R.drawable.star);
        ratingText.setText(String.valueOf(Rating[i]));
        commentImage.setImageResource(R.drawable.comment);
        commentsText.setText(Comments[i]);
        priceText.setText(Price[i]);
        shortDescriptionText.setText(ShortDescription[i]);

        return view;
    }
}
