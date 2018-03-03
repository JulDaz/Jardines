/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ProfesorCurso;
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
public class ProfesorCursoDAO {
    private Connection connection;

    public ProfesorCursoDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }
    
    /**
     * @param idPro= documento profesor
     * @return retorna la lista de cursos a los que pertenece un profesor
     * @throws SQLException
     * @throws URISyntaxException 
     */
    public ArrayList<ProfesorCurso> getAllProCur(int idPro) throws SQLException, URISyntaxException {
        ArrayList<ProfesorCurso> procur = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from profesorCurso where cedula="+idPro);
        while (rs.next()) {
            ProfesorCurso c = new ProfesorCurso();
            c.setIdCurso(rs.getInt("idcurso"));
            c.setIdProfesor(idPro);
            procur.add(c);
        }
        return procur;
    }
}
