/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudiateU.servlet;

import co.edu.unipiloto.estudianteU.Estudianteu;
import co.edu.unipiloto.estudianteU.session.EstudianteuFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yesica
 */
public class EstudianteUServlet extends HttpServlet {

    @EJB
    private EstudianteuFacadeLocal estudianteuFacade;

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
        
        String id = request.getParameter("studentId");
            Integer stId = new Integer (0);
                if (id != null && !id.equals("")){
                    stId =Integer.parseInt(id);
                }
            String nombre = request.getParameter("firstName");
            String apellido  = request.getParameter("lastName");
            String semestre = request.getParameter("yearLevel");
            Integer stSem = new Integer (0);
                if (semestre != null && !semestre.equals("")){
                    stSem =Integer.parseInt(semestre);
                }
                
            Estudianteu est = new Estudianteu ();  
            
            String accion = request.getParameter("action");
            if (accion.equals("Add")){
                  est.setEstudianteid(stId);
                  est.setNombre(nombre);
                  est.setApellido(apellido);
                  est.setSemestre(stSem); 
                  estudianteuFacade.create(est);
            }
                request.setAttribute("student", est);
                request.setAttribute("allStudents", estudianteuFacade.findAll());
                request.getRequestDispatcher("estudentUinfo.jsp").forward(request, response);
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
