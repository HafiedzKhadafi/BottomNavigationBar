package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder>{
    Context contex;
    List<ModelClass> model = new ArrayList<>();

    public AdapterClass(Context contex, List<ModelClass> model) {
        this.contex = contex;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(contex);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(contex)
                .load(model.get(i).getAvatar())
                .into(viewHolder.imgAvatar);

        viewHolder.onBind(model.get(i));
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAvatar;
        TextView tvJudul, tvDeskripsi;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
        }

        public void onBind(final ModelClass mdl){
            imgAvatar.setImageResource(mdl.getAvatar());
            tvJudul.setText(mdl.getJudul());
            tvDeskripsi.setText(mdl.getDeskripsi());
            itemView.setOnClickListener(new View.OnClickListener(){
                public void  onClick(View v){
                    Toast.makeText(contex, mdl.getJudul(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(), DetailClass.class);
                    intent.putExtra("id_judul", mdl.getJudul());
                    intent.putExtra("id_deskripsi", mdl.getDeskripsi());
                    intent.putExtra("id_avatar", mdl.getAvatar());
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
