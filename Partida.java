package com.example.ejemploretrofid;

import java.util.List;

public class Partida {
    private int id;
    private List<ObjetoJugadores> jugadores;

    public List<ObjetoJugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<ObjetoJugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", jugadores=" + jugadores +
                '}';
    }
}
