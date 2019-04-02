package com.example.bottomnavigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Fragment implements MainView{
    AdapterClass adapter;
    DataClass data;
    View v;
    List<ModelClass> model = new ArrayList<>();
    //private OnFragmentInteractionListener mListener;

    public Movie() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_movie, container, false);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    /*public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        android.support.v7.widget.RecyclerView A = (RecyclerView) v.findViewById(R.id.recyclerview);

        A.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new AdapterClass(getContext(), model);
        A.setAdapter(adapter);
        data = new DataClass(this,getContext());
        data.setData();
    }

    @Override
    public void onSuccess(List<ModelClass> model) {
        this.model.clear();
        this.model.addAll(model);
        this.adapter.notifyDataSetChanged();
    }
/*
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/
}
