/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU.session;

import co.edu.unipiloto.estudianteU.Cursou;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yesica
 */
@Local
public interface CursouFacadeLocal {

    void create(Cursou cursou);

    void edit(Cursou cursou);

    void remove(Cursou cursou);

    Cursou find(Object id);

    List<Cursou> findAll();

    List<Cursou> findRange(int[] range);

    int count();
    
}
