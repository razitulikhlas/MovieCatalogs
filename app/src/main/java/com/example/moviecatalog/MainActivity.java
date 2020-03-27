package com.example.moviecatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button populer,trending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populer = findViewById(R.id.popular);
        trending = findViewById(R.id.trending);
        populer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.popular:
                startActivity(new Intent(MainActivity.this,PopulerActivity.class));
                break;
            case R.id.trending:
        }
    }
}
