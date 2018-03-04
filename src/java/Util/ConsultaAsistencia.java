/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author FiJus
 */
public class ConsultaAsistencia {
    private String nombre;
    private int vino;

    public ConsultaAsistencia() {
    }

    public ConsultaAsistencia(String nombre, int vino) {
        this.nombre = nombre;
        this.vino = vino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVino() {
        return vino;
    }

    public void setVino(int vino) {
        this.vino = vino;
    }
    
    
}
