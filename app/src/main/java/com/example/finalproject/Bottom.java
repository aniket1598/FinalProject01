package com.example.finalproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistner);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new Homefragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId())
            {

                case R.id.home:
                    selectedFragment = new Homefragment();
                    break;

                case R.id.Myorder:
                    selectedFragment = new Myorderfragment();
                    break;

                case R.id.Cart:
                    selectedFragment = new Mycartfragment();
                    break;

                case R.id.person:
                    selectedFragment = new Myprofilefragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectedFragment).commit();

            return true;

        }
    };
}
