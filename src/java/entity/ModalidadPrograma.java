/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author IngenieroDesarrollo
 */
@Entity
@Table(name = "modalidad_programa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModalidadPrograma.findAll", query = "SELECT m FROM ModalidadPrograma m"),
    @NamedQuery(name = "ModalidadPrograma.findById", query = "SELECT m FROM ModalidadPrograma m WHERE m.id = :id"),
    @NamedQuery(name = "ModalidadPrograma.findByIdModalidad", query = "SELECT m FROM ModalidadPrograma m WHERE m.idModalidad = :idModalidad"),
    @NamedQuery(name = "ModalidadPrograma.findByDescripcion", query = "SELECT m FROM ModalidadPrograma m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "ModalidadPrograma.findByActivo", query = "SELECT m FROM ModalidadPrograma m WHERE m.activo = :activo")})
public class ModalidadPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_modalidad")
    private Integer idModalidad;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;
    @OneToMany(mappedBy = "rowidModalidad")
    private Collection<Programa> programaCollection;
@Transient
    private boolean editable;
    public ModalidadPrograma() {
    }
public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    public ModalidadPrograma(Integer id) {
        this.id = id;
    }

    public ModalidadPrograma(Integer id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @XmlTransient
    public Collection<Programa> getProgramaCollection() {
        return programaCollection;
    }

    public void setProgramaCollection(Collection<Programa> programaCollection) {
        this.programaCollection = programaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModalidadPrograma)) {
            return false;
        }
        ModalidadPrograma other = (ModalidadPrograma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ModalidadPrograma[ id=" + id + " ]";
    }
    
}
