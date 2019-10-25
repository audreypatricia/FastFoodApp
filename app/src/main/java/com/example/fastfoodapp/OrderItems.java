package com.example.fastfoodapp;

import android.provider.ContactsContract;

import androidx.fragment.app.Fragment;

public class OrderItems extends Fragment {
    private String foodName;
    private String cost;
    private String qty;
//    private int imageDrawableId;
//    private int orderId;




    public OrderItems(String foodName, String cost, String qty){
        this.foodName = foodName;
        this.cost = cost;
        this.qty = qty;
//        this.imageDrawableId = imageDrawableId;
//        this.orderId = orderId;

    }
    public String getFoodName() {
        return foodName;
    }

    public String getCost() {
        return cost;
    }

    public String getQty() {
        return qty;
    }

//    public int getImageDrawableId() {
//        return imageDrawableId;
//    }
//    public int getOrderId(){
//       return orderId;
//    }
}
