package com.company;

import java.util.Arrays;

// crear una clase publica que se llama ListaCasas on los atributos Casa y contador
public class ListaCasas {

    private Casa[] lista;
    private int contador;

    //  constructor con los atributos de la clase ListaCasas

    public ListaCasas(int size) {
        this.lista = new Casa[size];
        this.contador = contador = 0;
    }

    //con getter y setter creamos los metodos

    public Casa[] getLista() {
        return lista;
    }

    public void setLista(Casa[] lista) {
        this.lista = lista;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    // he hecho un toString con todos los atributos y he creado un bucle for para cada uno de ellos, para poder extraer una lista de casa atributo.

    public String toString() {
        String informacion = "Direcciones:";
        for (int i = 0; i < contador; i++) {
            informacion += lista[i].getDireccion();
        }
        informacion += "Códigos Postales:";
        for (int a = 0; a < contador; a++) {
            informacion += "Código Postal: " + lista[a].getCp();
        }
        informacion += "Habitaciones:";
        for (int e = 0; e < contador; e++) {
            informacion += "Número de Habitaciones: " + lista[e].getHabitaciones();
        }
        informacion += "\n\nSuperficie habitable:";
        for (int u = 0; u < contador; u++) {
            informacion += "Metros Cuadrados: " + lista[u].getMetrosCuadrados() + " metrosCuadrados";
        }
        return informacion;


    }

    public void add(Casa casa) {
    }
}
