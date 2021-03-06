/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.mx.cella.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduar
 */
@Entity
@Table(name = "solicitarprestamoalumno", schema = "cella")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitarprestamoalumno.findAll", query = "SELECT s FROM Solicitarprestamoalumno s")
    , @NamedQuery(name = "Solicitarprestamoalumno.findById", query = "SELECT s FROM Solicitarprestamoalumno s WHERE s.id = :id")
    , @NamedQuery(name = "Solicitarprestamoalumno.findByFechainicio", query = "SELECT s FROM Solicitarprestamoalumno s WHERE s.fechainicio = :fechainicio")})
public class Solicitarprestamoalumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @JoinColumn(name = "id_unidad_material", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Unidadmaterial idUnidadMaterial;

    public Solicitarprestamoalumno() {
    }

    public Solicitarprestamoalumno(Integer id) {
        this.id = id;
    }

    public Solicitarprestamoalumno(Integer id, Date fechainicio) {
        this.id = id;
        this.fechainicio = fechainicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Unidadmaterial getIdUnidadMaterial() {
        return idUnidadMaterial;
    }

    public void setIdUnidadMaterial(Unidadmaterial idUnidadMaterial) {
        this.idUnidadMaterial = idUnidadMaterial;
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
        if (!(object instanceof Solicitarprestamoalumno)) {
            return false;
        }
        Solicitarprestamoalumno other = (Solicitarprestamoalumno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unam.mx.cella.modelo.Solicitarprestamoalumno[ id=" + id + " ]";
    }
    
}
