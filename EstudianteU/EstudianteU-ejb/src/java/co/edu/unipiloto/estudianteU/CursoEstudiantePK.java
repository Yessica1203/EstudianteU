/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yesica
 */
@Embeddable
public class CursoEstudiantePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CURSO")
    private int idCurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTUDISNTE")
    private Boolean idEstudisnte;

    public CursoEstudiantePK() {
    }

    public CursoEstudiantePK(int idCurso, Boolean idEstudisnte) {
        this.idCurso = idCurso;
        this.idEstudisnte = idEstudisnte;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Boolean getIdEstudisnte() {
        return idEstudisnte;
    }

    public void setIdEstudisnte(Boolean idEstudisnte) {
        this.idEstudisnte = idEstudisnte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCurso;
        hash += (idEstudisnte != null ? idEstudisnte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoEstudiantePK)) {
            return false;
        }
        CursoEstudiantePK other = (CursoEstudiantePK) object;
        if (this.idCurso != other.idCurso) {
            return false;
        }
        if ((this.idEstudisnte == null && other.idEstudisnte != null) || (this.idEstudisnte != null && !this.idEstudisnte.equals(other.idEstudisnte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.estudianteU.CursoEstudiantePK[ idCurso=" + idCurso + ", idEstudisnte=" + idEstudisnte + " ]";
    }
    
}
