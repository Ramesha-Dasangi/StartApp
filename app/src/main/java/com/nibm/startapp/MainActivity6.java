package com.nibm.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    Button changingUI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().hide();

        HomeFragment homeFragment = new HomeFragment();

        ProfileFragment profileFragment = new ProfileFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.fragmentId,
                        homeFragment
                )
                .commit();


        changingUI = findViewById(R.id.changingUI);

        changingUI.setOnClickListener(view -> {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(
                            R.id.fragmentId,
                            profileFragment
                    )
                    .commit();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","On Destroy");
    }
}