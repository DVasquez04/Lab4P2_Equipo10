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
public class Fisicos extends Movimiento {

    private int puntosPoder;
    private int puntosPrecision;

    public Fisicos() {
    }

    public Fisicos(int puntosPoder, int puntosPrecision, String nombre, String descripcion) {
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
        int random = 1 + r.nextInt(50);
        if (p1.getPuntosAtaque() > p2.getPuntosDefensa()) {
            int resta = random * 2;
            try {
                p2.setPuntosVida(p2.getPuntosVida() - resta);
            } catch (Exception ex) {
                try {
                    p2.setPuntosVida(0);
                } catch (Exception ex1) {
                    Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (p1.getPuntosAtaque() < p2.getPuntosDefensa()) {
            int resta = (int) (random * 0.5);
            try {
                p2.setPuntosVida(p2.getPuntosVida() - resta);
            } catch (Exception ex) {
                try {
                    p2.setPuntosVida(0);
                } catch (Exception ex1) {
                    Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (p1.getPuntosAtaque() < p2.getPuntosDefensa()) {
            int resta = random;
            try {
                p2.setPuntosVida(p2.getPuntosVida() - resta);
            } catch (Exception ex) {
                try {
                    p2.setPuntosVida(0);
                } catch (Exception ex1) {
                    Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(Fisicos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return p2.getPuntosVida();
    }

}
