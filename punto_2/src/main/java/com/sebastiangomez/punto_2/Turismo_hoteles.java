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

public class Turismo_hoteles extends ListFragment {

    private String[] options={"Publicidad", "Demografia", "Hoteles", "Sitios Turisticos", "Bares","Acerca De"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,options));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Hoteles_Land nextHoteles=new Hoteles_Land();
        this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextHoteles,null).commit();
        return inflater.inflate(R.layout.fragment_turismo_hoteles, container, false);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

        showDetails(position);

    }

    void showDetails(int index){

        switch (index){

            case 0:{
                Publicidad_Land nextPublicidad=new Publicidad_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextPublicidad,null).commit();
                break;
            }

            case 1:{
                Demografia_Land nextDemografia=new Demografia_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextDemografia,null).commit();
                break;
            }

            case 2:{
                Hoteles_Land nextHoteles=new Hoteles_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextHoteles,null).commit();
                break;
            }

            case 3:{
                Sitios_Turisticos_Land nextSitios=new Sitios_Turisticos_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextSitios,null).commit();
                break;
            }

            case 4:{
                Bares_Land nextBares=new Bares_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextBares,null).commit();
                break;
            }

            case 5:{
                Acerca_Land nextAcerca=new Acerca_Land();
                this.getFragmentManager().beginTransaction().replace(R.id.detallehoteles,nextAcerca,null).commit();
                break;
            }

        }


    }

}