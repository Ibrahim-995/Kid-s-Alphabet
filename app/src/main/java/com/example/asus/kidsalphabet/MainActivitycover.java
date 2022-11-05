package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivitycover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitycover);


    }

    public void switcher(View view){
        Intent intent = new Intent(MainActivitycover.this,MainActivitymenu.class);
        startActivity(intent);
    }



}
