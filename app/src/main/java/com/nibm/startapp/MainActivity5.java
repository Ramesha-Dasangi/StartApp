package com.nibm.startapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.SQLOutput;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        getSupportActionBar().hide();

        int age = 17;

        if (age > 18) {
            getAdults();
        } else {
            throw new RuntimeException("child not permitted");
        }
    }


    void getAdults() {
        System.out.println("You are eligible for blaa");
    }

    void getChild(){
        System.out.println("You are not eligible");
    }
}