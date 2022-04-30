/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudiateU.servlet;
//Servlet de Curso 
import co.edu.unipiloto.estudianteU.Cursou;
import co.edu.unipiloto.estudianteU.session.CursouFacadeLocal;
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
public class CursoUServlet extends HttpServlet {

    @EJB
    private CursouFacadeLocal cursouFacade;

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
        String id = request.getParameter("cursoid");
            Integer curId = new Integer (0);
                if (id != null && !id.equals("")){
                    curId =Integer.parseInt(id);
                }
        String nomCurso = request.getParameter("nombrecurso");
        String numCreditos  = request.getParameter("numcreditos");
            Integer curNumCred = new Integer (0);
                if (numCreditos != null && !numCreditos.equals("")){
                    curNumCred =Integer.parseInt(numCreditos);
                }
        String semestre = request.getParameter("semestre");
            Integer curSem = new Integer (0);
                if (semestre != null && !semestre.equals("")){
                    curSem =Integer.parseInt(semestre);
                }
        String numEstudAd  = request.getParameter("numestudadmitidos");
            Integer curNumE = new Integer (0);
                if (numEstudAd != null && !numEstudAd.equals("")){
                    curNumE =Integer.parseInt(numEstudAd);
                }
                
            Cursou curs = new Cursou ();    
            String accion = request.getParameter("action");
            if (accion.equals("Add")){
                curs.setCursoid(curId);
                  curs.setNombrecurso(nomCurso);
                  curs.setNumcreditos(curNumCred);
                  curs.setSemestre(curSem);
                  curs.setNumestudadmitidos(curNumE);
                  cursouFacade.create(curs);
            }    
                request.setAttribute("curso", curs);
                request.setAttribute("allCursos", cursouFacade.findAll());
                request.getRequestDispatcher("CursoUinfo.jsp").forward(request, response);
        
        
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
