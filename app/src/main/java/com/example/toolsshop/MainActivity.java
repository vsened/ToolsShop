package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent drillIntent = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                        startActivity(drillIntent);
                        break;
                    case 1:
                        Intent puncherIntent = new Intent(getApplicationContext(), PuncherCategoryActivity.class);
                        startActivity(puncherIntent);
                        break;
                    case 2:
                        Intent angleGrinderIntent = new Intent(getApplicationContext(), AngleGrinderCategoryActivity.class);
                        startActivity(angleGrinderIntent);
                        break;
                }
            }
        });
    }
}