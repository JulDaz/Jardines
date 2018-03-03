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
public class CursoMateria {
    private int idCM;
    private int idCurso;
    private int idMateria;

    public CursoMateria() {
    }

    public CursoMateria(int idCM, int idCurso, int idMateria) {
        this.idCM = idCM;
        this.idCurso = idCurso;
        this.idMateria = idMateria;
    }

    public int getIdCM() {
        return idCM;
    }

    public void setIdCM(int idCM) {
        this.idCM = idCM;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    
}
