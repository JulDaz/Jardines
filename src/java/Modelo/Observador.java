/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LabingXEON
 */
public class Observador {
    private int idObs;
    private int calificacion;
    private String detalles;
    private int idEstudiante;

    public Observador() {
    }

    public Observador(int idObs, int calificacion, String detalles, int idEstudiante) {
        this.idObs = idObs;
        this.calificacion = calificacion;
        this.detalles = detalles;
        this.idEstudiante = idEstudiante;
    }

    public int getIdObs() {
        return idObs;
    }

    public void setIdObs(int idObs) {
        this.idObs = idObs;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    
    
}