package com.u_trip;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NearbyPlaceActivity extends AppCompatActivity {

    int[] placeImage = {R.drawable.nusapenida, R.drawable.ulundanu, R.drawable.borobudur, R.drawable.monkeyforest};
    String[] Title = {"Pantai Nusa Penida", "Ulun Danu Beratan Temple", "Candi Borobudur", "Monkey Forest"};
    double[] Rating = {4.5, 4.7, 4.3, 4.2};
    String[] Comments = {"13,123", "19,123", "23,123", "1,123"};
    String[] Price = {"Rp 20.000", "GRATIS", "GRATIS", "GRATIS"};
    String[] ShortDescription = {"Tempat wisata terbaik untuk menikmati pemandangan dan merasakan makanan yang lezat....",
    "Tempat wisata terbaik untuk menikmati pemandangan dan merasakan makanan yang lezat....",
    "Tempat wisata terbaik untuk menikmati pemandangan dan merasakan makanan yang lezat....",
    "Tempat wisata terbaik untuk menikmati pemandangan dan merasakan makanan yang lezat...."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nearby_place);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listViewData);
        ContentAdapter contentAdapter = new ContentAdapter(getApplicationContext(), placeImage, Title, Rating, Comments, Price, ShortDescription);
        listView.setAdapter(contentAdapter);

    }
}