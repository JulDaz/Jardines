/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author FiJus
 */
public class Asistencia {
    private int idCurso;
    private int idEstudiante;
    private int idFecha;
    private int vino;

    public Asistencia() {
    }

    public Asistencia(int idCurso, int idEstudiante, int idFecha, int vino) {
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
        this.idFecha = idFecha;
        this.vino = vino;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
    }

    public int getVino() {
        return vino;
    }

    public void setVino(int vino) {
        this.vino = vino;
    }
    
    
}
