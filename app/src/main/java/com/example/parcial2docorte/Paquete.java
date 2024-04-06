package com.example.parcial2docorte;

import android.widget.EditText;

import java.io.Serializable;

public class Paquete implements Serializable {
    EditText cedula;
    EditText nombre;
    EditText apellido;
    EditText correo;
    String carrera;
    String valor;

    public Paquete(String textoValor1, String textoValor2, String textoValor3, String textoValor4, String carrera, String valor) {
    }

    public Paquete(EditText cedula, EditText nombre, EditText apellido, EditText correo, String carrera, String valor) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.valor = valor;
    }

    public EditText getCedula() {
        return cedula;
    }

    public void setCedula(EditText cedula) {
        this.cedula = cedula;
    }

    public EditText getNombre() {
        return nombre;
    }

    public void setNombre(EditText nombre) {
        this.nombre = nombre;
    }

    public EditText getApellido() {
        return apellido;
    }

    public void setApellido(EditText apellido) {
        this.apellido = apellido;
    }

    public EditText getCorreo() {
        return correo;
    }

    public void setCorreo(EditText correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
