/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo10;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodge
 */
public class Especiales extends Movimiento {

    private int puntosPoder;
    private int puntosPrecision;

    public Especiales() {
    }

    public Especiales(int puntosPoder, int puntosPrecision, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.puntosPoder = puntosPoder;
        this.puntosPrecision = puntosPrecision;
    }

    public int getPuntosPoder() {
        return puntosPoder;
    }

    public void setPuntosPoder(int puntosPoder) {
        this.puntosPoder = puntosPoder;
    }

    public int getPuntosPrecision() {
        return puntosPrecision;
    }

    public void setPuntosPrecision(int puntosPrecision) {
        this.puntosPrecision = puntosPrecision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int Ataque(Pokemon p1, Pokemon p2) {
        Random r = new Random();
        int random1 = 1 + r.nextInt(50);
        int random = 100 + r.nextInt(500);
        int suma = p1.puntosEspecial + p2.puntosEspecial;
        int resta = 0;
        if (suma == random) {

            resta = random1 * 2;

        } else {
            resta = random1;

        }
        return resta;

    }

}
