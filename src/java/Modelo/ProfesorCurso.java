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
public class ProfesorCurso {
    private int idProfesor;
    private int idCurso;

    public ProfesorCurso() {
    }

    public ProfesorCurso(int idProfesor, int idCurso) {
        this.idProfesor = idProfesor;
        this.idCurso = idCurso;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
}
