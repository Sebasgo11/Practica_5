package com.sebastiangomez.punto_1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        Publicidad fragment = new Publicidad();
        fragmentTransaction.add(android.R.id.content,fragment).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id == R.id.publicidad) {

            Publicidad fragment = new Publicidad();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        if (id == R.id.demografia) {

            Demografia fragment = new Demografia();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        if (id == R.id.hoteles) {

            Hoteles fragment = new Hoteles();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        if (id == R.id.sitios) {

            Sitios_Turisticos fragment = new Sitios_Turisticos();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        if (id == R.id.bares) {

            Bares fragment = new Bares();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        if (id == R.id.about) {

            Acerca_De fragment = new Acerca_De();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
