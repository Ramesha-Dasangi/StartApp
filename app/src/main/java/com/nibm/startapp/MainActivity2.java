package com.nibm.startapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button button1,button2,button3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();

        button1 = findViewById(R.id.button1);

        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(
                view ->{
                    Log.d("click event","clicked");
                    Intent intent =  new Intent(MainActivity2.this,MainActivity.class);

                    startActivity(intent);
                }
        );

        button3.setOnClickListener(
                view -> {
                    Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
                    startActivity(intent);
                }
        );


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