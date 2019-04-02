package com.example.bottomnavigation;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
    Context context;
    List<ModelClass> model = new ArrayList<>();
    MainView view;
    public DataClass(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        ModelClass mdl;
        mdl = new ModelClass("Happy Death Day 2u", "Memiliki genre Comedy, Horror, Mystery, Science Fiction, Thriller dengan durasi 100 Menit tersebut dirilis di berbagai belahan di dunia khususnya di USA pada tanggal 13 Feb 2019. Happy Death Day 2U (2019) adalah karya dari sutradara terkenal yaitu Christopher Landon dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Israel Broussard, Jessica Rothe, Phi Vu, Suraj Sharma menghasilkan karya seni yang bagus dan terciptalah film Happy Death Day 2U (2019) sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.happydeathday2u);
        model.add(mdl);
        mdl = new ModelClass("Velvet Buzzsaw", "Memiliki genre Horror, Mystery, Thriller dengan durasi 113 Menit tersebut dirilis di berbagai belahan di dunia khususnya di USA pada tanggal 1 Feb 2019. Velvet Buzzsaw (2019) adalah karya dari sutradara terkenal yaitu Dan Gilroy, Donald Sparks, Mike Smith, Peter Dress, Susan Malerstein dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Jake Gyllenhaal, Rene Russo, Tom Sturridge, Zawe Ashton menghasilkan karya seni yang bagus dan terciptalah film Velvet Buzzsaw (2019) sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.velvetbuzzsaw);
        model.add(mdl);
        mdl = new ModelClass("Avenger:Endgame", "Memiliki genre Action, Adventure, Science Fiction dengan durasi 180 Menit tersebut dirilis di berbagai belahan di dunia khususnya di USA pada tanggal 24 Apr 2019. Avengers: Endgame (2019) adalah karya dari sutradara terkenal yaitu Anthony Russo, Chris Castaldi, Joe Russo dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Chris Evans, Chris Hemsworth, Robert Downey Jr. menghasilkan karya seni yang bagus dan terciptalah film Avengers: Endgame (2019) sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.avengerendgame);
        model.add(mdl);
        mdl = new ModelClass("Fyre","Memiliki genre Documentary, TV Movie dengan durasi 98 Menit tersebut dirilis di berbagai belahan di dunia khususnya di USA pada tanggal 18 Jan 2019. Fyre (2019 adalah karya dari sutradara terkenal yaitu Chris Smith dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Billy McFarland, Ja Rule, Jason Bell menghasilkan karya seni yang bagus dan terciptalah film Fyre (2019 sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.fyre);
        model.add(mdl);
        mdl = new ModelClass("Polar", "Memiliki genre Action, Crime, Drama dengan durasi 119 Menit tersebut dirilis di berbagai belahan di dunia khususnya di Germany, USA pada tanggal 25 Jan 2019. Polar (2019) adalah karya dari sutradara terkenal yaitu Jonas Åkerlund dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Katheryn Winnick, Mads Mikkelsen, Vanessa Hudgens menghasilkan karya seni yang bagus dan terciptalah film Polar (2019) sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.polar);
        model.add(mdl);
        mdl = new ModelClass("What Men Want", "Memiliki genre Comedy, Fantasy, Romance dengan durasi 117 Menit tersebut dirilis di berbagai belahan di dunia khususnya di USA pada tanggal 8 Feb 2019. What Men Want (2019) adalah karya dari sutradara terkenal yaitu Adam Shankman dan bekerjasama dengan para bintang film yang memiliki akting luar biasa seperti Aldis Hodge, Taraji P. Henson, Tracy Morgan menghasilkan karya seni yang bagus dan terciptalah film What Men Want (2019) sangat populer dikalangan masyarakat dan tentu saja mampu membuat penontonya berdecak kagum dengan tontonan yang disuguhkan di depan mata.", R.drawable.whatmenwant);
        model.add(mdl);
        view.onSuccess(model);
    }
}
