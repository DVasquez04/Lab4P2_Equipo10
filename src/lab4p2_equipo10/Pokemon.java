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
    protected Movimiento[] movimientos = new Movimiento[4];
    protected int puntosVida;
    protected int puntosAtaque;
    protected int puntosDefensa;
    protected int puntosEspecial;
    protected int puntosVelocidad;
    protected String estado;

    public Pokemon() {
    }

    public Pokemon(String especie, int nivel, int experiencia, int subir_experiencia, int puntosVida, int puntosAtaque, int puntosDefensa, int puntosEspecial, int puntosVelocidad, String estado) throws Exception {
        this.especie = especie;
        if (nivel > 1) {
            this.nivel = nivel;
        } else {
            throw new Exception();
        }
        if (experiencia > 1) {
            this.experiencia = experiencia;
        } else {
            throw new Exception();
        }

        if (subir_experiencia > 1) {
            this.subir_experiencia = subir_experiencia;
        } else {
            throw new Exception();
        }
        if (puntosVida >= 1) {
            this.puntosVida = puntosVida;
        } else {
            throw new Exception();
        }
        if (puntosAtaque > 1) {
            this.puntosAtaque = puntosAtaque;
        } else {
            throw new Exception();
        }
        if (puntosDefensa > 1) {
            this.puntosDefensa = puntosDefensa;
        } else {
            throw new Exception();
        }
        if (puntosEspecial > 1) {
            this.puntosEspecial = puntosEspecial;
        } else {
            throw new Exception();
        }
        if (puntosEspecial > 1) {
            this.puntosVelocidad = puntosVelocidad;
        } else {
            throw new Exception();
        }

        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) throws Exception {
        if (nivel > 1) {
            this.nivel = nivel;
        } else {
            throw new Exception();
        }
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) throws Exception {
        if (experiencia > 1) {
            this.experiencia = experiencia;
        } else {
            throw new Exception();
        }

    }

    public int getSubir_experiencia() {
        return subir_experiencia;
    }

    public void setSubir_experiencia(int subir_experiencia) throws Exception {
        if (subir_experiencia > 1) {
            this.subir_experiencia = subir_experiencia;
        } else {
            throw new Exception();
        }

    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) throws Exception {
        if (puntosVida >= 0) {
            this.puntosVida = puntosVida;
        } else {
            throw new Exception();
        }

    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) throws Exception {
        if (puntosAtaque > 1) {
            this.puntosAtaque = puntosAtaque;
        } else {
            throw new Exception();
        }

    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) throws Exception {
        if (puntosDefensa > 1) {
            this.puntosDefensa = puntosDefensa;
        } else {
            throw new Exception();
        }

    }

    public int getPuntosEspecial() {
        return puntosEspecial;
    }

    public void setPuntosEspecial(int puntosEspecial) throws Exception {
        if (puntosEspecial > 1) {
            this.puntosEspecial = puntosEspecial;
        } else {
            throw new Exception();
        }

    }

    public int getPuntosVelocidad() {
        return puntosVelocidad;
    }

    public void setPuntosVelocidad(int puntosVelocidad) throws Exception {
        if (puntosEspecial > 1) {
            this.puntosVelocidad = puntosVelocidad;
        } else {
            throw new Exception();
        }

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
