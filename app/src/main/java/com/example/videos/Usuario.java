package com.example.videos;

public class Usuario {
    int id;
    String Correo, Psw;

    public Usuario() {

    }

    public Usuario(String correo, String psw) {
        Correo = correo;
        Psw = psw;
    }

    public boolean isNull(){
        if(Correo.equals("")&&Psw.equals("")){
            return  false;
        }
        else{
            return true;
        }
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Correo='" + Correo + '\'' +
                ", Psw='" + Psw + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPsw() {
        return Psw;
    }

    public void setPsw(String psw) {
        Psw = psw;
    }
}


