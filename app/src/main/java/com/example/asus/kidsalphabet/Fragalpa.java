package com.example.asus.kidsalphabet;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragalpa extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragalpa);
        getSupportActionBar().setTitle("PLAY AND SAY ALPHABETS");

        String[] name = {"A", "B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        listView = (ListView) findViewById(R.id.listviewid);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        Fragment fragment;

        if(i==0)
        {

            fragment = new ShowFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==1)
        {
            fragment = new BFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==2)
        {
            fragment = new CFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==3)
        {
            fragment = new DFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }

        else if(i==4)
        {
            fragment = new EFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==5)
        {
            fragment = new FFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==6)
        {
            fragment = new GFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==7)
        {
            fragment = new HFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==8)
        {
            fragment = new IFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==9)
        {
            fragment = new JFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==10)
        {
            fragment = new KFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==11)
        {
            fragment = new LFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==12)
        {

            fragment = new MFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==13)
        {

            fragment = new NFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==14)
        {

            fragment = new OFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==15)
        {

            fragment = new PFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==16)
        {

            fragment = new QFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==17)
        {

            fragment = new RFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==18)
        {

            fragment = new SFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==19)
        {

            fragment = new TFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==20)
        {

            fragment = new UFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==21)
        {

            fragment = new VFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==22)
        {

            fragment = new WFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==23)
        {

            fragment = new XFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==24)
        {

            fragment = new YFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }
        else if(i==25)
        {

            fragment = new ZFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragid,fragment);
            fragmentTransaction.commit();

        }


    }

    public void switch11(View view) {
        Intent intent = new Intent(Fragalpa.this, MainActivitymenu.class);
        startActivity(intent);
    }
}
