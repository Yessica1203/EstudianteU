/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU.session;

import co.edu.unipiloto.estudianteU.CursoEstudiante;
import co.edu.unipiloto.estudianteU.CursoEstudiantePK;
import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yesica
 */
@Stateless
public class CursoEstudianteFacade extends AbstractFacade<CursoEstudiante> implements CursoEstudianteFacadeLocal {

    @PersistenceContext(unitName = "EstudianteUPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoEstudianteFacade() {
        super(CursoEstudiante.class);
    }

    @Override
    public boolean insertarCursoEstudiante(int idCurso, Boolean idEstudisnte,   double nota) {
        CursoEstudiantePK pk = new CursoEstudiantePK(idCurso, idEstudisnte);
        if (consultarCursoEstudiante(pk)!=null ){
            return false;
        }else{
            CursoEstudiante cp;
            cp = new CursoEstudiante(pk,Double.valueOf(nota));
            em.persist(cp);
            return true;
        }
    }

    @Override
    public CursoEstudiante consultarCursoEstudiante(CursoEstudiantePK pk) {
        return em.find(CursoEstudiante.class, pk);
        }

    
    
}
