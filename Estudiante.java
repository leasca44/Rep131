package com.mycompany.ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private double promedio;

    public Estudiante(String nombre, String apellido, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", promedio=" + promedio +
               '}';
    }
}