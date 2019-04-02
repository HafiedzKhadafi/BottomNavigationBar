package com.example.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailClass extends AppCompatActivity {
    ImageView avatarimg;
    TextView judultv, deskripsitv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        avatarimg = (ImageView) findViewById(R.id.avatar_img);
        judultv = (TextView) findViewById(R.id.judul_tv);
        deskripsitv = (TextView) findViewById(R.id.deskripsi_tv);

        getData();
    }

    private void getData(){
        judultv.setText(getIntent().getStringExtra("id_judul"));
        deskripsitv.setText(getIntent().getStringExtra("id_deskripsi"));

        Glide.with(this)
                .load(getIntent().getIntExtra("id_avatar", 0))
                .into(avatarimg);
    }
}
