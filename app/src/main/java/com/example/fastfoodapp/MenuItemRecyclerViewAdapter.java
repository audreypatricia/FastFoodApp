package com.example.fastfoodapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuItemRecyclerViewAdapter extends RecyclerView.Adapter<MenuItemRecyclerViewAdapter.MenuItemViewHolder>{

    public ArrayList<MenuItem> menuItemsToAdapt;

    public void setData(ArrayList<MenuItem> menuItemsToAdapt){
    this.menuItemsToAdapt = menuItemsToAdapt;
    }

    public class MenuItemViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView foodNameTextView;
//        public TextView cost;
//        public TextView desc;
        public ImageView foodImageView;


        public MenuItemViewHolder(@NonNull View itemView) {
            super(itemView);
            view= itemView;
            foodNameTextView=itemView.findViewById(R.id.tv_foodName);
//            cost=itemView.findViewById(R.id.tv_cost);
//            desc=itemView.findViewById();
            foodImageView = itemView.findViewById(R.id.foodImage);
        }
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_detail,parent, false);
    MenuItemViewHolder menuItemViewHolder = new MenuItemViewHolder(view);
    return menuItemViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {
    final MenuItem menuItemAtPosition =menuItemsToAdapt.get(position);
     holder.foodNameTextView.setText(menuItemAtPosition.getFoodName());
     holder.foodImageView.setImageResource(menuItemAtPosition.getImageDrawableId());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, ItemDetailActvity.class);
                intent.putExtra("menuItemId", menuItemAtPosition.getMenuItemId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return menuItemsToAdapt.size();
    }
}
