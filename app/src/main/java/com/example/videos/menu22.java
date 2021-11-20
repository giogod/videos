package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu22 extends AppCompatActivity implements  View.OnClickListener {
    Button cerrar;
    TextView nombres;
    int id=0;
    Usuario u;
    daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu22);
        cerrar = (Button) findViewById(R.id.btncerrar);
        nombres = (TextView) findViewById(R.id.nombre);

        Bundle b=getIntent().getExtras();
        id=b.getInt("Id");
        dao=new daoUsuario(this);
        u=dao.getUsuarioById(id);
        nombres.setText(u.getCorreo());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncerrar:
                Intent hola= new Intent(menu22.this,menuprincipal.class);
                startActivity(hola);
                finish();
                break;

        }

    }
}
