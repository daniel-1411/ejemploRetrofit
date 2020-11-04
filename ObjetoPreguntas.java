package com.example.ejemploretrofid;

import java.util.List;

public class ObjetoPreguntas {
    private String letra,posicion,definicion,solucion;

    public ObjetoPreguntas(String letra, String posicion, String definicion, String solucion) {
        this.letra = letra;
        this.posicion = posicion;
        this.definicion = definicion;
        this.solucion = solucion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    @Override
    public String toString() {
        return "ObjetoPreguntas{" +
                "letra='" + letra + '\'' +
                ", posicion='" + posicion + '\'' +
                ", definicion='" + definicion + '\'' +
                ", solucion='" + solucion + '\'' +
                '}';
    }
}
