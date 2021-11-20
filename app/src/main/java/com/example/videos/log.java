package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class log extends AppCompatActivity implements View.OnClickListener {

    Button btningresar1, btnregistrar1;
    EditText txtcorreo1, txtpass1;
    daoUsuario dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        txtcorreo1 = (EditText) findViewById(R.id.txtcorreo1);
        txtpass1 = (EditText) findViewById(R.id.txtpass1);
        btningresar1 = (Button) findViewById(R.id.btningresar1);
        btnregistrar1 = (Button) findViewById(R.id.btnregistrar1);
        dao = new daoUsuario(this);

        Bundle b =getIntent().getExtras();



        btningresar1.setOnClickListener(this);
        btnregistrar1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btningresar1:
                String u=txtcorreo1.getText().toString();
                String p=txtpass1.getText().toString();
                if(u.equals("")&&p.equals("")){
                    Toast.makeText(this, "Error:campos vacios", Toast.LENGTH_SHORT).show();

                } else if(dao.login(u,p)==1){
                    Usuario ux=dao.getUsuario(u,p);
                    Toast.makeText(this, "DATOS CORRECTOS", Toast.LENGTH_SHORT).show();
                    Intent m = new Intent(log.this,nube.class);
                    m.putExtra("ID",ux.getId());
                    startActivity(m);
                    finish();
                }
                else{
                    Toast.makeText(this, "Datos erroneos", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.btnregistrar1:
                Intent i=new Intent(log.this,registrarinfo.class);
                startActivity(i);

                break;
        }
    }

}

