package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registrarinfo extends AppCompatActivity implements View.OnClickListener {

    EditText txtcorreo2,txtpass2;
    Button btnregistrador;
    daoUsuario dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarinfo);

        txtcorreo2 = (EditText) findViewById(R.id.txtcorreo2);
        txtpass2 = (EditText) findViewById(R.id.txtpass2);
        btnregistrador = (Button) findViewById(R.id.btnregistrador);
        dao = new daoUsuario(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnregistrador:
                Usuario u=new Usuario();
                u.setCorreo(txtcorreo2.getText().toString());
                u.setPsw(txtpass2.getText().toString());

                if(!u.isNull()){
                    Toast.makeText(this, "Error: Campos vacios ", Toast.LENGTH_SHORT).show();
                }
                else if(dao.insertUsuario(u)){

                    Toast.makeText(this, "Registro existoso!! ", Toast.LENGTH_SHORT).show();
                    Intent volver = new Intent(registrarinfo.this,log.class);
                    startActivity(volver);
                    finish();
                }
                else{
                    Toast.makeText(this, "Este usuario ya esta registrado ", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}