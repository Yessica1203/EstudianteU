/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU.session;

import co.edu.unipiloto.estudianteU.Estudianteu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yesica
 */
@Stateless
public class EstudianteuFacade extends AbstractFacade<Estudianteu> implements EstudianteuFacadeLocal {

    @PersistenceContext(unitName = "EstudianteUPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteuFacade() {
        super(Estudianteu.class);
    }
    
}
