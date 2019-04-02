package com.example.bottomnavigation;

public class ModelClass {
    String judul, deskripsi;
    int avatar;

    public ModelClass(String judul, String deskripsi, int avatar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.avatar = avatar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getAvatar() {
        return avatar;
    }
}
