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
public class Nota {
    private float nota;
    private int idEstudiante;
    private int idTema;
    private String detallesExtra;

    public Nota() {
    }

    public Nota(float nota, int idEstudiante, int idTema, String detallesExtra) {
        this.nota = nota;
        this.idEstudiante = idEstudiante;
        this.idTema = idTema;
        this.detallesExtra = detallesExtra;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getDetallesExtra() {
        return detallesExtra;
    }

    public void setDetallesExtra(String detallesExtra) {
        this.detallesExtra = detallesExtra;
    }
    
    
}
