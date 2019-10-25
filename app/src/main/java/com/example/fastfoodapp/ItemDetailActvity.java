
package com.example.fastfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActvity extends AppCompatActivity {

    private TextView foodItemTextView;
    private TextView foodCostTextView;
    private TextView foodDescTextView;
    private ImageView foodImageImageView;
    public Button addBtn;
    public Button subtractBtn;
    public TextView quantity;
    public Button addToOrder;
    int counter = 0;
    public String choices = " ";
    public String qty;
    public Double cost;
    private static FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail_actvity);

        Intent intent = getIntent();

        int menuItemId =intent.getIntExtra("menuItemId",0);

        MenuItem menuItem = FakeDatabase.getMenuItembyId(menuItemId);

        foodItemTextView = findViewById(R.id.food);
        foodCostTextView = findViewById(R.id.cost);
        foodDescTextView = findViewById(R.id.desc);
        foodImageImageView = findViewById(R.id.foodPic);
        addBtn = findViewById(R.id.add_btn);
        subtractBtn = findViewById(R.id.subtract_btn);
        addToOrder = findViewById(R.id.add_to_order);


        menuItem = FakeDatabase.getMenuItembyId(menuItem.getMenuItemId());

        foodItemTextView.setText(menuItem.getFoodName());
        foodCostTextView.setText(menuItem.getCost());
        foodDescTextView.setText(menuItem.getDesc());

        foodImageImageView.setImageResource(menuItem.getImageDrawableId());
        addBtn = findViewById(R.id.add_btn);
        quantity = findViewById(R.id.quantity_number);
        addToOrder = findViewById(R.id.add_to_order);
        quantity = findViewById(R.id.quantity_number);
        quantity.setText("1");


        addBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter = counter + 1;
                quantity.setText(String.valueOf(counter));

            }
        });

        subtractBtn = findViewById(R.id.subtract_btn);

        subtractBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter = counter - 1;
                quantity.setText(String.valueOf(counter));

            }
        });



//
//        public void add_order(View view){
//            Intent intent2 = new Intent(ItemDetailActvity.this, ViewOrderFragment.class);
//            Bundle bundle = new Bundle();
//            choices = foodItemTextView.toString();
//            qty = quantity.toString();
////            bundle.putString("chosen_food_items", choices );
////            bundle.putInt("quantity_ordered", Integer.parseInt(qty));
//            cost = Double.valueOf(String.valueOf(foodCostTextView));
////            bundle.putDouble("costEach", cost);
//            intent2.putExtra("chosen_food_items", choices);
//            intent2.putExtra("quantity_ordered", Integer.parseInt(qty));
//            intent2.putExtra("costEach", cost);
//            startActivity(intent2);
        }



//        addToOrder.setOnClickListener(new View.OnClickListener(){
//        @Override
//        public void onClick (View view){
//        ViewOrderFragment viewOrderFragment = new ViewOrderFragment();
//        Bundle extras = new Bundle();
//
//        extras.putString("foodName", foodItemTextView.getText().toString());
//        extras.putString("quantity", quantity.getText().toString());
//        extras.putString("costEach", foodCostTextView.getText().toString());
//
//        viewOrderFragment.setArguments(extras);
//
//        fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.fragment_container, viewOrderFragment).commit();
//        Intent intent2 = new Intent(getApplicationContext(), ViewOrderFragment.class);
//        intent2.putExtras(extras);

//
//    }
//    }




    }


