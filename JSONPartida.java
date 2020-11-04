package com.example.ejemploretrofid;

import java.util.List;

public class JSONPartida {
    private Partida partida;

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return "JSONPartida{" +
                "partida=" + partida +
                '}';
    }
}
