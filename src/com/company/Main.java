package com.company;

public class Main {

    public static void main(String[] args) {

        ListaCasas lista = new ListaCasas(4); // crear una nueva lista de casas y el tamaño de la lista que va a guuardar el array es de 4

        lista.add(new Casa("calle pintor madrazo, 28", 3,250,23700));
        lista.add(new Casa("avd Andalucia,53,7a", 4,150,23006));
        lista.add(new Casa("calle fuente del oso, 13", 5,375,23700));
        lista.add(new Casa("calle la mina, 28", 3,75,23700));

        System.out.println(lista.toString());  // muestro por pantalla con la extension lista.toString la lista completa con todops sus atributos
    }
}
