package com.example.fastfoodapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

// the RecyclerView on the app has big gaps in between each food Item, i have searched up this bug and it was due to an updated
//    RecyclerView and many post told me to put it on Wrap content and I have done so and fixed the first few items, but when it is scrolled down
//    the gaps appear again, not sure how to fix this

    public MenuRecyclerFragment(){

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_recycler, container , false);

        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        MenuItemRecyclerViewAdapter menuItemRecyclerViewAdapter = new MenuItemRecyclerViewAdapter();

        menuItemRecyclerViewAdapter.setData(FakeDatabase.getAllMenuItems());
        recyclerView.setAdapter(menuItemRecyclerViewAdapter);

        return view;
    }
}
