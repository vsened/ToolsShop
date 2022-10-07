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

public class PuncherCategoryActivity extends AppCompatActivity {

    private ListView listViewPunchers;
    private ArrayList<Puncher> punchers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puncher_category);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        listViewPunchers = findViewById(R.id.listViewPunchers);
        punchers = new ArrayList<>();
        punchers.add(new Puncher(getString(R.string.puncher_interskol_title), getString(R.string.puncher_interskol_info), R.drawable.interskol_puncher));
        punchers.add(new Puncher(getString(R.string.puncher_makita_title), getString(R.string.puncher_makita_info), R.drawable.makita_puncher));
        punchers.add(new Puncher(getString(R.string.puncher_dewalt_title), getString(R.string.puncher_dewalt_info), R.drawable.dewalt_puncher));
        ArrayAdapter<Puncher> adapter = new ArrayAdapter<Puncher>(getApplicationContext(), android.R.layout.simple_list_item_1, punchers){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView text = (TextView) super.getView(position, convertView, parent);
                text.setTextColor(Color.BLACK);
                return text;
            }
        };
        listViewPunchers.setAdapter(adapter);

        listViewPunchers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), PuncherDetailActivity.class);
                intent.putExtra("title", punchers.get(i).getTitle());
                intent.putExtra("info", punchers.get(i).getInfo());
                intent.putExtra("imageId", punchers.get(i).getImageResourceId());
                startActivity(intent);
            }
        });


    }
}