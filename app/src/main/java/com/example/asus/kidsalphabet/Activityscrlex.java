package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activityscrlex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityscrlex);
        getSupportActionBar().setTitle("EASY COUNTING");
    }

    public void switch12(View view) {
        Intent intent = new Intent(Activityscrlex.this, MainActivitymenu.class);
        startActivity(intent);
    }
}
