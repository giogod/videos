package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class menucentral1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucentral1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hola = new Intent(menucentral1.this,menuprincipal.class);
                startActivity(hola);
                finish();
            };
        },3000);

    }
}