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

    public void addEstudiante(int idEstudiante, String nombre, int celularContacto, String direccion, String fechaNacimiento, String rh, String tipoSangre, int idCurso) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into estudiante(documento,nombre,celularcontacto,direccion,fechanacimiento,rh,tiposangre,idcurso) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, idEstudiante);
        preparedStatement.setString(2, nombre);
        preparedStatement.setInt(3, celularContacto);
        preparedStatement.setString(4, direccion);
        preparedStatement.setString(5, fechaNacimiento);
        preparedStatement.setString(6, rh);
        preparedStatement.setString(7, tipoSangre);
        preparedStatement.setInt(8, idCurso);
        preparedStatement.executeUpdate();
    }
}
