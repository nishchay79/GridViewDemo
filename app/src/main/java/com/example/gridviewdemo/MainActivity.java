package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String [] numberwords = {"one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    int [] numberImage ={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,
                          R.drawable.eight,R.drawable.nine,R.drawable.ten};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        MainAdapter adapter = new MainAdapter(MainActivity.this,numberwords,numberImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked " + numberwords[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
