/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo10;

import java.util.ArrayList;

/**
 *
 * @author Diego Vasquez
 */
public class Entrenador {
    private String Nombre;
    private int Edad;
    private int PokeDolares;
    private Pokemon[] Equipo = new Pokemon[6];
    private ArrayList<Pokemon> Caja = new ArrayList();

    public Entrenador() {
    }

    public Entrenador(String Nombre, int Edad, int PokeDolares) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.PokeDolares = PokeDolares;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getPokeDolares() {
        return PokeDolares;
    }

    public void setPokeDolares(int PokeDolares) {
        this.PokeDolares = PokeDolares;
    }

    public Pokemon[] getEquipo() {
        return Equipo;
    }

    public void setEquipo(Pokemon[] Equipo) {
        this.Equipo = Equipo;
    }

    public ArrayList<Pokemon> getCaja() {
        return Caja;
    }

    public void setCaja(ArrayList<Pokemon> Caja) {
        this.Caja = Caja;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", PokeDolares=" + PokeDolares + ", Equipo=" + Equipo + ", Caja=" + Caja + '}';
    }
    
}
