package com.whiwol.petagram.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whiwol.petagram.R;
import com.whiwol.petagram.adaptadores.MascotaAdaptador;
import com.whiwol.petagram.pojo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class InicioPet extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public InicioPet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_inicio_pet, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
    }

    //11.- Seteando el Adaptador
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    //12.- Inicializar Lista de Mascotas
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Charmander", "12", R.drawable.charmander));
        mascotas.add(new Mascota("Chilaquill", "4", R.drawable.chilaquil));
        mascotas.add(new Mascota("Elefantito", "6", R.drawable.donphant));
        mascotas.add(new Mascota("Ho-Oh", "7", R.drawable.hooh));
        mascotas.add(new Mascota("Vamo a Calmarno", "15", R.drawable.squar));
        mascotas.add(new Mascota("Hunter", "10", R.drawable.hunter));
        mascotas.add(new Mascota("Gatito", "5", R.drawable.meowth));
        mascotas.add(new Mascota("Mew", "10", R.drawable.mew));
    }

}
