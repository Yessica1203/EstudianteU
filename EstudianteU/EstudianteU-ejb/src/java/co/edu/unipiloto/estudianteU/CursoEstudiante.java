/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yesica
 */
@Entity
@Table(name = "CURSO_ESTUDIANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CursoEstudiante.findAll", query = "SELECT c FROM CursoEstudiante c"),
    @NamedQuery(name = "CursoEstudiante.findByIdCurso", query = "SELECT c FROM CursoEstudiante c WHERE c.cursoEstudiantePK.idCurso = :idCurso"),
    @NamedQuery(name = "CursoEstudiante.findByIdEstudisnte", query = "SELECT c FROM CursoEstudiante c WHERE c.cursoEstudiantePK.idEstudisnte = :idEstudisnte"),
    @NamedQuery(name = "CursoEstudiante.findByNota", query = "SELECT c FROM CursoEstudiante c WHERE c.nota = :nota")})
public class CursoEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CursoEstudiantePK cursoEstudiantePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOTA")
    private Double nota;

    public CursoEstudiante() {
    }

    public CursoEstudiante(CursoEstudiantePK cursoEstudiantePK) {
        this.cursoEstudiantePK = cursoEstudiantePK;
    }
    public CursoEstudiante(CursoEstudiantePK cursoEstudiantePK, Double nota) {
        this.cursoEstudiantePK = cursoEstudiantePK;
        this.nota=nota;
    }

    public CursoEstudiante(int idCurso, Boolean idEstudisnte) {
        this.cursoEstudiantePK = new CursoEstudiantePK(idCurso, idEstudisnte);
    }

    public CursoEstudiantePK getCursoEstudiantePK() {
        return cursoEstudiantePK;
    }

    public void setCursoEstudiantePK(CursoEstudiantePK cursoEstudiantePK) {
        this.cursoEstudiantePK = cursoEstudiantePK;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoEstudiantePK != null ? cursoEstudiantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoEstudiante)) {
            return false;
        }
        CursoEstudiante other = (CursoEstudiante) object;
        if ((this.cursoEstudiantePK == null && other.cursoEstudiantePK != null) || (this.cursoEstudiantePK != null && !this.cursoEstudiantePK.equals(other.cursoEstudiantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.estudianteU.CursoEstudiante[ cursoEstudiantePK=" + cursoEstudiantePK + " ]";
    }
    
}
