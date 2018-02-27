/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.ObservadorDAO;
import Modelo.Observador;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LabingXEON
 */
public class Pureba {
    public static void main(String[] args) {
        try {
            ObservadorDAO o=new ObservadorDAO();
            ArrayList<Observador> obs=o.getAllObservadores();
            for(Observador ob:obs){
                System.out.println(ob.getId_estudiante()+" "+ob.getId_profesor()+", "+ob.getCalificaciones()+", "+ob.getDetalles());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pureba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Pureba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pureba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pureba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
