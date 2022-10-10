package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PuncherDetailActivity extends AppCompatActivity {
    private ImageView imageViewPuncher;
    private TextView textViewPuncherTitle;
    private TextView textViewPuncherInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puncher_detail);
        imageViewPuncher = findViewById(R.id.imageViewPuncherLogo);
        textViewPuncherTitle  = findViewById(R.id.textViewPuncherTitle);
        textViewPuncherInfo = findViewById(R.id.textViewPuncherInfo);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String info = intent.getStringExtra("info");
        int imageId = intent.getIntExtra("imageId", 0);
        imageViewPuncher.setImageDrawable(getDrawable(imageId));
        textViewPuncherTitle.setText(title);
        textViewPuncherInfo.setText(info);



    }
}