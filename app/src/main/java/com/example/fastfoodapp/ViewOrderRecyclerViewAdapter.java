package com.example.fastfoodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class ViewOrderRecyclerViewAdapter extends RecyclerView.Adapter<ViewOrderRecyclerViewAdapter.OrderViewHolder> {

        //this does not work, because you cannot convert a foodItem array into a OrderItem array;
    private ArrayList<OrderItems> ordersToAdapt;
    public void setData(ArrayList<OrderItems> ordersToAdapt){
    this.ordersToAdapt = ordersToAdapt;
        }

        @NonNull
        @Override
        public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view =
                    LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.order_layout, parent, false);
            OrderViewHolder orderViewHolder = new OrderViewHolder(view);
            return orderViewHolder;


        }

        @Override
        public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
            final OrderItems orderItemAtPosition = ordersToAdapt.get(position);
            holder.foodTextView.setText(orderItemAtPosition.getFoodName());
//            holder.foodImageView.setImageResource(orderItemAtPosition.getImageDrawableId());
            holder.qtyTextView.setText(orderItemAtPosition.getQty());
            holder.priceTextView.setText(orderItemAtPosition.getCost());
        }
            @Override
        public int getItemCount() {
            return ordersToAdapt.size();
        }

        public static class OrderViewHolder extends RecyclerView.ViewHolder{
        public View view;
       public ImageView foodImageView;
       public TextView foodTextView;
       public TextView qtyTextView;
       public TextView amountTextView;
       public TextView priceTextView;

        public OrderViewHolder(View itemView ){
            super(itemView);
            view = itemView;
            foodImageView =itemView.findViewById(R.id.imageView);
            foodTextView= itemView.findViewById(R.id.textViewFood);
            qtyTextView = itemView.findViewById(R.id.textViewQty);
            amountTextView = itemView.findViewById(R.id.textViewAmount);
            priceTextView = itemView.findViewById(R.id.textViewPrice);


    }


        }
}
