package com.app.canteenapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OrdersActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        bottomNav = findViewById(R.id.bottomNav);

        // Highlight orders tab
        bottomNav.setSelectedItemId(R.id.nav_orders);

        bottomNav.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.nav_food) {
                startActivity(new Intent(this, MainActivity.class));
                return true;
            }

            if (item.getItemId() == R.id.nav_cart) {
                startActivity(new Intent(this, CartActivity.class));
                return true;
            }

            if (item.getItemId() == R.id.nav_orders) {
                return true;
            }

            if (item.getItemId() == R.id.nav_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
                return true;
            }

            return false;
        });
    }
}