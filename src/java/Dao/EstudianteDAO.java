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
import java.sql.PreparedStatement;
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

    public void addEstudiante(Estudiante est) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into estudiante values (?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, est.getIdEstudiante());
        preparedStatement.setString(2, est.getNombre());
        preparedStatement.setString(3, est.getCelularContacto());
        preparedStatement.setString(4, est.getDireccion());
        preparedStatement.setString(5, est.getFechaNacimiento());
        preparedStatement.setString(6, est.getRh());
        preparedStatement.setString(7, est.getTipoSangre());
        preparedStatement.setInt(8, est.getIdCurso());
        preparedStatement.executeUpdate();
    }
}
