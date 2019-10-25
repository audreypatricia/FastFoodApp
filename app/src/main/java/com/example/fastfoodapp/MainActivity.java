package com.example.fastfoodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new HomePageFragment();
        swapFragment(fragment);
//
//        Fragment fragment = new MenuRecyclerFragment();

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                if (menuItem.getItemId() == R.id.nav_home) {
                Fragment fragment = new HomePageFragment();
                    swapFragment(fragment);
                    return true;
                } else if (menuItem.getItemId() == R.id.nav_menu) {
                    Fragment fragment = new MenuRecyclerFragment();
                    swapFragment(fragment);

                    return true;
                } else if (menuItem.getItemId() == R.id.nav_order) {
                    Fragment fragment = new ViewOrderFragment();

//                    Bundle bundle = new Bundle();
//                    bundle.putString("foodName",foodItemTextView.getText().toString());
//                    bundle.putString("quantity", quantity.getText().toString());
//                    bundle.putString("costEach",foodCostTextView.getText().toString());

                    swapFragment(fragment);
                    return true;
                }
                return false;
            }
        });

    }

    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}







//            public void swapFragment(Fragment fragment) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container, fragment);
//                fragmentTransaction.commit();}



