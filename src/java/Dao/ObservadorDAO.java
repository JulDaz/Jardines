/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Estudiante;
import Modelo.Observador;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class ObservadorDAO {

    private Connection connection;

    public ObservadorDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public ArrayList<Estudiante> getEstudiantesByIDCurso(int id_curso) throws SQLException, URISyntaxException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from estudiante where id_curso=" + id_curso);
        while (rs.next()) {
            Estudiante c = new Estudiante();
            c.setId_estudiante(rs.getInt("id_estudiante"));
            c.setNombre_estudiante(rs.getString("nombre_estudiante"));
            c.setContacto_estudiante(rs.getString("contacto_estudiante"));
            c.setId_curso(rs.getInt("id_curso"));
            estudiantes.add(c);
        }
        return estudiantes;
    }

    public ArrayList<Observador> getObservadorByID(int id_estudiante) throws SQLException, URISyntaxException {
        ArrayList<Observador> notasObs = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from observador where id_estudiante=" + id_estudiante);
        while (rs.next()) {
            Observador c = new Observador();
            c.setId_estudiante(rs.getInt("id_estudiante"));
            c.setId_profesor(rs.getInt("id_profesor"));
            c.setCalificaciones(rs.getInt("calificacion"));
            c.setDetalles(rs.getString("detalles"));
            notasObs.add(c);
        }
        return notasObs;
    }

    public ArrayList<Observador> getAllObservadores() throws SQLException, URISyntaxException {
        ArrayList<Observador> notasObs = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from observador");
        while (rs.next()) {
            Observador c = new Observador();
            c.setId_estudiante(rs.getInt("id_estudiante"));
            c.setId_profesor(rs.getInt("id_profesor"));
            c.setCalificaciones(rs.getInt("calificacion"));
            c.setDetalles(rs.getString("detalles"));
            notasObs.add(c);
        }
        return notasObs;
    }
}
