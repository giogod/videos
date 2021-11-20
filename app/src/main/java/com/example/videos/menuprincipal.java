package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
    }
    public void adios  (View view){
        Intent ir1 = new Intent(menuprincipal.this,MainActivity.class);
        startActivity(ir1);

    }
    public void log (View view){
        Intent ir1 = new Intent(menuprincipal.this,log.class);
        startActivity(ir1);

    }
    public void menu2  (View view){
        Intent ir12 = new Intent(menuprincipal.this,menu2.class);
        startActivity(ir12);

    }
    public void menu3  (View view){
        Intent ir3 = new Intent(menuprincipal.this,menu3.class);
        startActivity(ir3);

    }
}