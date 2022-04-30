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
@Table(name = "ESTUDIANTEU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudianteu.findAll", query = "SELECT e FROM Estudianteu e"),
    @NamedQuery(name = "Estudianteu.findByEstudianteid", query = "SELECT e FROM Estudianteu e WHERE e.estudianteid = :estudianteid"),
    @NamedQuery(name = "Estudianteu.findByNombre", query = "SELECT e FROM Estudianteu e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estudianteu.findByApellido", query = "SELECT e FROM Estudianteu e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Estudianteu.findBySemestre", query = "SELECT e FROM Estudianteu e WHERE e.semestre = :semestre")})
public class Estudianteu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTUDIANTEID")
    private Integer estudianteid;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "SEMESTRE")
    private Integer semestre;

    public Estudianteu() {
    }

    public Estudianteu(Integer estudianteid) {
        this.estudianteid = estudianteid;
    }

    public Integer getEstudianteid() {
        return estudianteid;
    }

    public void setEstudianteid(Integer estudianteid) {
        this.estudianteid = estudianteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estudianteid != null ? estudianteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudianteu)) {
            return false;
        }
        Estudianteu other = (Estudianteu) object;
        if ((this.estudianteid == null && other.estudianteid != null) || (this.estudianteid != null && !this.estudianteid.equals(other.estudianteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.estudianteU.Estudianteu[ estudianteid=" + estudianteid + " ]";
    }
    
}
