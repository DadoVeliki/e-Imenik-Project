package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
    }
    public void previousActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    public void prosla(View v){
        Intent i = new Intent(this, druga.class);
        startActivity(i);
    }
}