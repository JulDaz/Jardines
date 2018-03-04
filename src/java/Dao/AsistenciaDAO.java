/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Util.ConsultaAsistencia;
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
public class AsistenciaDAO {
    
    private Connection connection;

    public AsistenciaDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }
    
    public ArrayList<ConsultaAsistencia> getAsistenciaFecha(int idCurso,int idFecha) throws SQLException{
        ArrayList<ConsultaAsistencia> asis=new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select estudiante.nombre,asistencia.vino from asistencia,estudiante where asistencia.idCurso="+idCurso+" and asistencia.idfecha="+idFecha+" and asistencia.idestudiante= estudiante.documento");
        while (rs.next()) {
            ConsultaAsistencia ca=new ConsultaAsistencia();
            ca.setNombre(rs.getString("nombre"));
            ca.setVino(rs.getInt("vino"));
            asis.add(ca);
        }
        return asis;
    }
    
}
