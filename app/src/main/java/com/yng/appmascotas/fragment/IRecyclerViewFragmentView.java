package com.yng.appmascotas.fragment;

import com.yng.appmascotas.adapter.MascotaAdaptador;
import com.yng.appmascotas.adapter.MiMascotaAdaptador;
import com.yng.appmascotas.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {
    public void generarLinearLayoutVertical();
    //public void generarGridLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    //public MiMascotaAdaptador crearAdaptadorMiPet(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
