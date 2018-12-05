package com.company;
// creamos una clase casa cpn los atributos
// codigo postal int cp (numero entero)
// int habitaciones ( numero entero)
// double metrosCuaddrados ( suelen ser numeros grandes y/o con decimales)
//string direccion ( para guardar el nombre de la calle)

import java.util.Objects;

public class Casa {
    protected String direccion;
    protected int habitaciones;
    protected double metrosCuadrados;
    protected int cp;

    public Casa(String direccion, int habitaciones, double metrosCuadrados, int cp) {
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.cp = cp;
    }

    // creamos el constructor de todos los atributos de la clase

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    // crear los metodos con getter and setter para que puedan ser heredados por clases derivadas

    // con toString sobreescribimos los metodos de la clase
    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", habitaciones=" + habitaciones +
                ", metrosCuadrados=" + metrosCuadrados +
                ", cp=" + cp +
                '}';
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return habitaciones == casa.habitaciones &&
                Double.compare(casa.metrosCuadrados, metrosCuadrados) == 0 &&
                cp == casa.cp &&
                Objects.equals(direccion, casa.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, habitaciones, metrosCuadrados, cp);
    }
}
