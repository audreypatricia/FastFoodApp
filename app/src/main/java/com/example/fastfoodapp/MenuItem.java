package com.example.fastfoodapp;


import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuItem extends Fragment {

    private String foodName;
    private String cost;
    private String desc;
    private int menuItemId;
private int imageDrawableId;
public int qty;



    public MenuItem(String foodName, int imageDrawableId, String cost, String desc, int menuItemId) {

        this.foodName=foodName;
        this.cost=cost;
        this.desc=desc;
        this.imageDrawableId=imageDrawableId;
        this.menuItemId=menuItemId;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.menu_item_detail, container, false);
    }

    public String getFoodName(){

        return foodName;
    }

    public String getCost(){
        return cost;
    }

    public String getDesc(){
        return desc;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public int getMenuItemId(){ return menuItemId;}

}
