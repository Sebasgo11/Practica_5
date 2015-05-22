package com.sebastiangomez.punto_2;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Turismo extends ListFragment {


    private String[] options={"Publicidad", "Demografia", "Hoteles", "Sitios Turisticos", "Bares","Acerca De"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,options));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_turismo, container, false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        switch(position){

            case 0:{
                Publicidad fragment = new Publicidad();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }

            case 1:{
                Demografia fragment = new Demografia();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }
            case 2:{
                Hoteles fragment = new Hoteles();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }

            case 3:{
                Sitios_Turisticos fragment = new Sitios_Turisticos();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();

                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }

            case 4:{
                Bares fragment = new Bares();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }

            case 5:{
                Acerca_De fragment = new Acerca_De();
                fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Toast.makeText(getActivity(), "Ha Pulsado " + options[position], Toast.LENGTH_SHORT).show();
                break;
            }
        }

    }


}

