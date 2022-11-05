package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityinfo);
        getSupportActionBar().setTitle("INFORMATION");
    }
    public void switch5(View view) {
        Intent intent = new Intent(MainActivityinfo.this, MainActivitymenu.class);
        startActivity(intent);
    }
}
