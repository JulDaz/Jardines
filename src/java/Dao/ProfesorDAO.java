/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Profesor;
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
public class ProfesorDAO {

    private Connection connection;

    public ProfesorDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public Profesor getProfesorById(int idPro) throws SQLException, URISyntaxException {
        Profesor pro = new Profesor();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from profesor");
        while (rs.next()) {
            pro.setIdProfesor(rs.getInt("cedula"));
            pro.setNombre(rs.getString("nombre"));
            pro.setTipoU(rs.getInt("tipoU"));
            pro.setCorreo(rs.getString("correo"));
            pro.setCelular(rs.getString("celular"));
            pro.setDireccion(rs.getString("direccion"));
            pro.setEstudios(rs.getString("estudios"));
            pro.setExperiencia(rs.getString("experiencia"));
            pro.setFechaNacimiento(rs.getString("fechaNacimiento"));
            pro.setTipoSangre(rs.getString("tipoSangre"));
            pro.setRh(rs.getString("rh"));
            pro.setUsuario(rs.getString("usuario"));
        }
        return pro;
    }

    public ArrayList<Profesor> getallProfesores() throws SQLException {
        ArrayList<Profesor> profesores = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from profesor");
        while (rs.next()) {
            Profesor pro=new Profesor();
            pro.setIdProfesor(rs.getInt("cedula"));
            pro.setNombre(rs.getString("nombre"));
            pro.setTipoU(rs.getInt("tipoU"));
            pro.setCorreo(rs.getString("correo"));
            pro.setCelular(rs.getString("celular"));
            pro.setDireccion(rs.getString("direccion"));
            pro.setEstudios(rs.getString("estudios"));
            pro.setExperiencia(rs.getString("experiencia"));
            pro.setFechaNacimiento(rs.getString("fechaNacimiento"));
            pro.setTipoSangre(rs.getString("tipoSangre"));
            pro.setRh(rs.getString("rh"));
            pro.setUsuario(rs.getString("usuario"));
            pro.setPassword(rs.getString("password"));
            profesores.add(pro);
        }
        return profesores;
    }
}
