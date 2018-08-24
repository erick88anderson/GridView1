package com.example.eri.gridview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] values = {
            "apple", "motorola", "samsung", "hawei", "sony", "htc", "aaaaa", "aaaaa", "aaaaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.griview);
        MarcasAdapter gridAdapter = new MarcasAdapter(this, values);
        gridView.setAdapter(gridAdapter);


    }
}
