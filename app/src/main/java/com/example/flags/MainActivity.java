package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.idtext);
        Context appContext = getApplicationContext();
        Configuration config = getResources().getConfiguration();
        if (config.orientation == Configuration.ORIENTATION_PORTRAIT){
            text.setText(getString(R.string.country));
        }
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            text.setText((getString(R.string.country)) + (getString(R.string.land)));
        }
    }
}