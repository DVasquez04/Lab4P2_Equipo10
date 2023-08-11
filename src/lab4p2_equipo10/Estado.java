/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo10;

import java.util.Random;

/**
 *
 * @author rodge
 */
public class Estado extends Movimiento {
    private String estado;
    public Estado() {
        super();
    }

    public Estado(String estado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    public int Ataque() {
        Random r = new Random();
        int random = r.nextInt(1, 100);
        return random;
    }

}
