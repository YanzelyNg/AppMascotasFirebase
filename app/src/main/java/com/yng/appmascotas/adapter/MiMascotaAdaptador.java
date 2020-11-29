package com.yng.appmascotas.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.yng.appmascotas.R;
import com.yng.appmascotas.pojo.Mascota;

import java.util.ArrayList;

public class MiMascotaAdaptador extends RecyclerView.Adapter<MiMascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MiMascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_miperfil, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        Picasso.get().load(mascota.getUrlFoto()).into(mascotaViewHolder.imgFoto);
        //mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvCantLike.setText(String.valueOf(mascota.getCantLikes()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvCantLike;
        private ImageButton btncantLike;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto= (ImageView) itemView.findViewById(R.id.imgFoto);
            tvCantLike = (TextView) itemView.findViewById(R.id.tvCantLike);
            btncantLike=(ImageButton) itemView.findViewById(R.id.btncantLike);
        }
    }
}
