/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU.session;

import co.edu.unipiloto.estudianteU.Estudianteu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yesica
 */
@Local
public interface EstudianteuFacadeLocal {

    void create(Estudianteu estudianteu);

    void edit(Estudianteu estudianteu);

    void remove(Estudianteu estudianteu);

    Estudianteu find(Object id);

    List<Estudianteu> findAll();

    List<Estudianteu> findRange(int[] range);

    int count();
    
}
