package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private ImageView drillImage;
    private TextView drillTitle;
    private TextView drillInfo;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String info = intent.getStringExtra("info");
        int imageId = intent.getIntExtra("logo", 0);
        drillImage = findViewById(R.id.imageView5);
        drillTitle = findViewById(R.id.textViewDrillTitle);
        drillInfo = findViewById(R.id.textViewDrillInfo);
        drillImage.setImageDrawable(getDrawable(imageId));
        drillTitle.setText(title);
        drillInfo.setText(info);
    }
}