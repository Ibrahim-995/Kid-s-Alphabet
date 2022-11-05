package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivitymenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymenu);
        getSupportActionBar().setTitle("MENU");

    }
    public void switch1(View view){
        Intent intent = new Intent(MainActivitymenu.this,MainActivityalpha.class);
        startActivity(intent);
    }
    public void switch2(View view){
        Intent intent = new Intent(MainActivitymenu.this,Fragalpa.class);
        startActivity(intent);
    }

    public void switch6(View view){
        Intent intent = new Intent(MainActivitymenu.this,MainActivityinfo.class);
        startActivity(intent);
    }

    public void switch8(View view){
        Intent intent = new Intent(MainActivitymenu.this,Activityscrlex.class);
        startActivity(intent);
    }
    public void switch7(View view){
        Intent intent = new Intent(MainActivitymenu.this,SmallActivity.class);
        startActivity(intent);
    }

    public void switch9(View view){
        Intent intent = new Intent(MainActivitymenu.this,AnimalAlpha.class);
        startActivity(intent);
    }

}
