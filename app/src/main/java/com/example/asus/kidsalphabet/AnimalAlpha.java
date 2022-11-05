package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnimalAlpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_alpha);
        getSupportActionBar().setTitle("MY ANIMAL ALPHABET");
    }

    public void switch10(View view) {
        Intent intent = new Intent(AnimalAlpha.this, MainActivitymenu.class);
        startActivity(intent);
    }
}
