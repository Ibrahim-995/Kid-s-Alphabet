package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SmallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        getSupportActionBar().setTitle("SMALL LETTTERS");
    }

    public void switch14(View view) {
        Intent intent = new Intent(SmallActivity.this,MainActivitymenu.class);
        startActivity(intent);
    }
}
