/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU.session;

import co.edu.unipiloto.estudianteU.CursoEstudiante;
import co.edu.unipiloto.estudianteU.CursoEstudiantePK;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yesica
 */
@Local
public interface CursoEstudianteFacadeLocal {

    void create(CursoEstudiante cursoEstudiante);

    void edit(CursoEstudiante cursoEstudiante);

    void remove(CursoEstudiante cursoEstudiante);

    CursoEstudiante find(Object id);

    List<CursoEstudiante> findAll();

    List<CursoEstudiante> findRange(int[] range);

    int count();
    
    boolean insertarCursoEstudiante(int idCurso, Boolean idEstudisnte, double nota) ;
    CursoEstudiante consultarCursoEstudiante(CursoEstudiantePK pk);
    
}
