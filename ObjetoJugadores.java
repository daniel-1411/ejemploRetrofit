package com.example.ejemploretrofid;

import java.util.List;

public class ObjetoJugadores {
    private String nombre,asignatura,descripcion,creador;
    private List<ObjetoPreguntas> preguntas;

    public ObjetoJugadores(String nombre, String asignatura, String descripcion, String creador, List<ObjetoPreguntas> preguntas) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.descripcion = descripcion;
        this.creador = creador;
        this.preguntas = preguntas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public List<ObjetoPreguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<ObjetoPreguntas> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "ObjetoJugadores{" +
                "nombre='" + nombre + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creador='" + creador + '\'' +
                ", preguntas=" + preguntas +
                '}';
    }
}
