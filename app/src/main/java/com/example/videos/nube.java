package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class nube extends AppCompatActivity {

    Button boton;
    private final static String id_Datos = "https://docs.google.com/forms/u/0/d/e/1FAIpQLSfplRHhujQAE3fTGQiCK8dPCtkVs1WTRKCn2wW6QX2IrDeROQ/formResponse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nube);

        boton = (Button) findViewById(R.id.datos);
    }
    public void onClick(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()){
            case R.id.datos:
                intent.setData(Uri.parse(id_Datos));
                startActivity(intent);
        }
    }

}