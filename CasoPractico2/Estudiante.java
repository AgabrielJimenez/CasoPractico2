/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author SIMAN
 */
public class Estudiante {
   private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaInscripcion;
    private String curso;
    private double costo;

    public Estudiante(String nombre, String apellido, int edad, LocalDate fechaInscripcion, String curso, double costo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaInscripcion = fechaInscripcion;
        this.curso = curso;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String toString() {
        return String.format("%s %s, %d años, inscrito en %s, costo %.2f", nombre, apellido, edad, curso, costo);
    }
}

