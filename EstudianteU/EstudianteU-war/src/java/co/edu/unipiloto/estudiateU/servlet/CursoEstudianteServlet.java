/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudiateU.servlet;

import co.edu.unipiloto.estudianteU.CursoEstudiante;
import co.edu.unipiloto.estudianteU.session.CursoEstudianteFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yesica
 */
@WebServlet(name = "CursoEstudianteServlet", urlPatterns = {"/CursoEstudianteServlet"})
public class CursoEstudianteServlet extends HttpServlet {

    @EJB
    private CursoEstudianteFacadeLocal cursoEstudianteFacade;
    

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

        String idCurso = request.getParameter("idCurso");
        Integer curId = new Integer(0);
        if (idCurso != null && !idCurso.equals("")) {
            curId = Integer.parseInt(idCurso);
        }
        String idEstudiante = request.getParameter("idEstudiante");
        Integer curE = new Integer(0);
        if (idEstudiante != null && !idEstudiante.equals("")) {
            curE = Integer.parseInt(idEstudiante);
        }
        String nota = request.getParameter("nota");
        Integer cen = new Integer(0);
        if (nota != null && !nota.equals("")) {
            cen = Integer.parseInt(nota);
        }
         CursoEstudiante est = new CursoEstudiante();  
         String accion = request.getParameter("action");
            if (accion.equals("Add")){
                 // est.setCursoEstudiantePK(cursoEstudiantePK);
                 // est.setNota(nota);
                  cursoEstudianteFacade.create(est);
            }
           request.setAttribute("curStu", est);
           request.setAttribute("allCurStudent", cursoEstudianteFacade.findAll());
           request.getRequestDispatcher("CursoEstudianteInfo.jsp").forward(request, response);
            
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
