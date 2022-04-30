/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estudianteU;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yesica
 */
@Entity
@Table(name = "CURSOU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursou.findAll", query = "SELECT c FROM Cursou c"),
    @NamedQuery(name = "Cursou.findByCursoid", query = "SELECT c FROM Cursou c WHERE c.cursoid = :cursoid"),
    @NamedQuery(name = "Cursou.findByNombrecurso", query = "SELECT c FROM Cursou c WHERE c.nombrecurso = :nombrecurso"),
    @NamedQuery(name = "Cursou.findByNumcreditos", query = "SELECT c FROM Cursou c WHERE c.numcreditos = :numcreditos"),
    @NamedQuery(name = "Cursou.findBySemestre", query = "SELECT c FROM Cursou c WHERE c.semestre = :semestre"),
    @NamedQuery(name = "Cursou.findByNumestudadmitidos", query = "SELECT c FROM Cursou c WHERE c.numestudadmitidos = :numestudadmitidos")})
public class Cursou implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURSOID")
    private Integer cursoid;
    @Size(max = 50)
    @Column(name = "NOMBRECURSO")
    private String nombrecurso;
    @Column(name = "NUMCREDITOS")
    private Integer numcreditos;
    @Column(name = "SEMESTRE")
    private Integer semestre;
    @Column(name = "NUMESTUDADMITIDOS")
    private Integer numestudadmitidos;

    public Cursou() {
    }

    public Cursou(Integer cursoid) {
        this.cursoid = cursoid;
    }

    public Integer getCursoid() {
        return cursoid;
    }

    public void setCursoid(Integer cursoid) {
        this.cursoid = cursoid;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public Integer getNumcreditos() {
        return numcreditos;
    }

    public void setNumcreditos(Integer numcreditos) {
        this.numcreditos = numcreditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getNumestudadmitidos() {
        return numestudadmitidos;
    }

    public void setNumestudadmitidos(Integer numestudadmitidos) {
        this.numestudadmitidos = numestudadmitidos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoid != null ? cursoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursou)) {
            return false;
        }
        Cursou other = (Cursou) object;
        if ((this.cursoid == null && other.cursoid != null) || (this.cursoid != null && !this.cursoid.equals(other.cursoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.estudianteU.Cursou[ cursoid=" + cursoid + " ]";
    }
    
}
