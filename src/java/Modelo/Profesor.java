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
public class Profesor {
    private int idProfesor;
    private String nombre;
    private int tipoU;
    private String correo;
    private String celular;
    private String direccion;
    private String estudios;
    private String experiencia;
    private String fechaNacimiento;
    private String tipoSangre;
    private String rh;
    private String usuario;
    private String password;

    public Profesor() {
    }

    public Profesor(int idProfesor, String nombre, int tipoU, String correo, String celular, String direccion, String estudios, String experiencia, String fechaNacimiento, String tipoSangre, String rh, String usuario, String password) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.tipoU = tipoU;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.estudios = estudios;
        this.experiencia = experiencia;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.rh = rh;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoU() {
        return tipoU;
    }

    public void setTipoU(int tipoU) {
        this.tipoU = tipoU;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
