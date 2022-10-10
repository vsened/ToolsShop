package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AngleGrinderCategoryActivity extends AppCompatActivity {
    private ListView listViewAngleGrinder;
    private ArrayList<AngleGrinder> angleGrinders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_grinder_category);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        listViewAngleGrinder = findViewById(R.id.listViewAngleGrinders);
        angleGrinders = new ArrayList<>();
        angleGrinders.add(new AngleGrinder(getString(R.string.angle_grinder_interskol_title),getString(R.string.angle_grinder_interskol_info), R.drawable.interskol_angle_puncher));
        angleGrinders.add(new AngleGrinder(getString(R.string.angle_grinder_makita_title),getString(R.string.angle_grinder_makita_info), R.drawable.makita_angle_grinder));
        angleGrinders.add(new AngleGrinder(getString(R.string.angle_grinder_dewalt_title),getString(R.string.angle_grinder_dewalt_info), R.drawable.dewalt_angle_puncher));
        ArrayAdapter<AngleGrinder> adapter = new ArrayAdapter<AngleGrinder>(getApplicationContext(), android.R.layout.simple_list_item_1, angleGrinders){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView text = (TextView) super.getView(position, convertView, parent);
                text.setTextColor(Color.BLACK);
                return text;
            }
        };
        listViewAngleGrinder.setAdapter(adapter);

        listViewAngleGrinder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), AngleGrinderDetailActivity.class);
                intent.putExtra("title", angleGrinders.get(i).getTitle());
                intent.putExtra("info", angleGrinders.get(i).getInfo());
                intent.putExtra("imageId", angleGrinders.get(i).getImageResourceId());
                startActivity(intent);
            }
        });



    }
}