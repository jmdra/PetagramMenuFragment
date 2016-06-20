package com.whiwol.petagram.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whiwol.petagram.R;
import com.whiwol.petagram.adaptadores.FotosPerfilAdaptador;
import com.whiwol.petagram.adaptadores.MascotaAdaptador;
import com.whiwol.petagram.pojo.Mascota;

import java.util.ArrayList;


public class PerfilPet extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public PerfilPet() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil_pet, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvFotosPerfil);

        GridLayoutManager llm = new GridLayoutManager(getActivity(), 3);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
    }

    //11.- Seteando el Adaptador
    public void inicializarAdaptador(){
        FotosPerfilAdaptador adaptador = new FotosPerfilAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    //12.- Inicializar Lista de Mascotas
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Hunter1", "12", R.drawable.hunter1));
        mascotas.add(new Mascota("Hunter2", "4", R.drawable.hunter2));
        mascotas.add(new Mascota("Hunter3", "6", R.drawable.hunter3));
        mascotas.add(new Mascota("Ho-Oh", "7", R.drawable.hunter));
        mascotas.add(new Mascota("Gastly1", "15", R.drawable.gastly));
        mascotas.add(new Mascota("Gastly2", "10", R.drawable.gastly2));
        mascotas.add(new Mascota("Hunter1", "12", R.drawable.hunter1));
        mascotas.add(new Mascota("Hunter2", "4", R.drawable.hunter2));
        mascotas.add(new Mascota("Hunter3", "6", R.drawable.hunter3));
        mascotas.add(new Mascota("Ho-Oh", "7", R.drawable.hunter));
        mascotas.add(new Mascota("Gastly1", "15", R.drawable.gastly));
        mascotas.add(new Mascota("Gastly2", "10", R.drawable.gastly2));

    }


}
