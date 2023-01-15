package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
         image.getLayoutParams().height = 800;
        image.getLayoutParams().width = 800;
       image.setImageResource(R.drawable.profile);
    }
}