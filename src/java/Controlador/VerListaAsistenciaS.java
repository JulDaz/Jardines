/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.AsistenciaDAO;
import Dao.CursoDAO;
import Dao.FechaDAO;
import Dao.ProfesorCursoDAO;
import Modelo.Curso;
import Modelo.Fecha;
import Modelo.ProfesorCurso;
import Util.ConsultaAsistencia;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gibran
 */
public class VerListaAsistenciaS extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            int op = Integer.parseInt(request.getParameter("op"));
            if (op == 0) {
                int pi;
                pi = 544856;
                ProfesorCursoDAO pc = new ProfesorCursoDAO();
                ArrayList<ProfesorCurso> pcm = pc.getAllProCur(pi);
                ArrayList<Curso> cursos = new ArrayList<>();
                CursoDAO c = new CursoDAO();
                for (ProfesorCurso profesorcurso : pcm) {
                    cursos.add(c.getCursoById(profesorcurso.getIdCurso()));
                }
                Gson g = new Gson();
                String pasareEsto = g.toJson(cursos);
                out.print(pasareEsto);
            }
            if (op == 1) {
                FechaDAO dao = new FechaDAO();
                ArrayList<Fecha> fechas = dao.allFechas();
                Gson g = new Gson();
                String pasareEsto = g.toJson(fechas);
                out.print(pasareEsto);
            }

            if (op == 2) {
                int idCurso = 1;
                AsistenciaDAO dao = new AsistenciaDAO();
                ArrayList<ConsultaAsistencia> asistencias = dao.getAsistenciaFecha(idCurso , 1);
          
                Gson g = new Gson();
                String pasareEsto = g.toJson(asistencias);
                out.print(pasareEsto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(AsistenciaS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaS.class.getName()).log(Level.SEVERE, null, ex);

        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
    }
}
