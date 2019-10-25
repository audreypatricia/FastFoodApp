package com.example.fastfoodapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewOrderFragment extends Fragment {

    private RecyclerView recyclerView;
//    public ImageView foodImageView;
    public TextView foodTextView;
    public TextView qtyTextView;
    public TextView amountTextView;
    public TextView priceTextView;

    public ViewOrderFragment() {
        // Required empty public constructor
    }
//
//
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//
        View view = inflater.inflate(R.layout.fragment_view_order, container , false);
//
//        foodImageView =view.findViewById(R.id.imageView);
        foodTextView= view.findViewById(R.id.textViewFood);
        qtyTextView = view.findViewById(R.id.textViewQty);
        amountTextView = view.findViewById(R.id.textViewAmount);
        priceTextView = view.findViewById(R.id.textViewPrice);
//
        String getFoodName = getArguments().getString("foodName");
        foodTextView.setText(getFoodName);
        String getQty = getArguments().getString("quantity");
        qtyTextView.setText(getQty);
        String getCost = getArguments().getString("costEach");
        priceTextView.setText(getCost);

        ArrayList<OrderItems> orderItems = new ArrayList<OrderItems>();
        OrderItems item = new OrderItems(foodTextView.toString(), priceTextView.toString(),qtyTextView.toString());
        orderItems.add(item);

        recyclerView = view.findViewById(R.id.rv_order);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

         ViewOrderRecyclerViewAdapter viewOrderRecyclerViewAdapter= new ViewOrderRecyclerViewAdapter();

        viewOrderRecyclerViewAdapter.setData(orderItems); // should get data from a personalized array OrderItem
        recyclerView.setAdapter(viewOrderRecyclerViewAdapter);

        return view;


    }

}
