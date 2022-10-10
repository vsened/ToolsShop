package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AngleGrinderDetailActivity extends AppCompatActivity {

    private ImageView imageViewAngleGrinder;
    private TextView textViewAngleGrinderTitle;
    private TextView textViewAngleGrinderInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_grinder_detail);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        imageViewAngleGrinder = findViewById(R.id.imageViewAngleGrinderImage);
        textViewAngleGrinderTitle = findViewById(R.id.textViewAngleGrinderTitle);
        textViewAngleGrinderInfo = findViewById(R.id.textViewAngleGrinderInfo);
        Intent intent = getIntent();
        int imageId = intent.getIntExtra("imageId", 0);
        String title = intent.getStringExtra("title");
        String info = intent.getStringExtra("info");
        imageViewAngleGrinder.setImageDrawable(getDrawable(imageId));
        textViewAngleGrinderTitle.setText(title);
        textViewAngleGrinderInfo.setText(info);

    }
}