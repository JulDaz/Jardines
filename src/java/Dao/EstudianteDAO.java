/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Estudiante;
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
 * @author FiJus
 */
public class EstudianteDAO {
    private Connection connection;

    public EstudianteDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }
    
    public ArrayList<Estudiante> getEstudiantesByIDCurso(int id_curso) throws SQLException, URISyntaxException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from estudiante where idcurso=" + id_curso);
        while (rs.next()) {
            Estudiante c = new Estudiante();
            c.setIdEstudiante(rs.getInt("documento"));            
            c.setNombre(rs.getString("nombre"));
            estudiantes.add(c);
        }
        return estudiantes;
    }
}
