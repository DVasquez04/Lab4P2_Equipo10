/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo10;

/**
 *
 * @author rodge
 */
public class Pokemon {
    protected String especie;
    protected int nivel;
    protected int experiencia;
    protected int subir_experiencia;
    protected Movimiento[]  movimientos = new Movimiento[4];
    protected int puntosVida;
    protected int puntosAtaque;
    protected int puntosDefensa;
    protected int puntosEspecial;
    protected int puntosVelocidad;
    protected String estado;

    public Pokemon() {
    }

    public Pokemon(String especie, int nivel, int experiencia, int subir_experiencia, int puntosVida, int puntosAtaque, int puntosDefensa, int puntosEspecial, int puntosVelocidad, String estado) {
        this.especie = especie;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.subir_experiencia = subir_experiencia;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.puntosEspecial = puntosEspecial;
        this.puntosVelocidad = puntosVelocidad;
        this.estado = estado;
    }
    
}
