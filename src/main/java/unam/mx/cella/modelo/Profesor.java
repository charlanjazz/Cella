/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.mx.cella.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eduar
 */
@MappedSuperclass
@Table(catalog = "cella", schema = "cella", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"correo"})})
@XmlRootElement
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String nombreusuario;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String correo;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String contrasena;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String nombre;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String apellidop;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String apellidom;
    @Lob
    private byte[] foto;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean edocuenta;
    @Basic(optional = false)
    @Column(nullable = false, length = 13)
    private String rfc;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String notrabajador;
    @OneToMany(mappedBy = "idProfesor")
    private List<Kit> kitList;

    public Profesor() {
    }

    public Profesor(Integer id) {
        this.id = id;
    }

    public Profesor(Integer id, String nombreusuario, String correo, String contrasena, String nombre, String apellidop, String apellidom, boolean edocuenta, String rfc, String notrabajador) {
        this.id = id;
        this.nombreusuario = nombreusuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.edocuenta = edocuenta;
        this.rfc = rfc;
        this.notrabajador = notrabajador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public boolean getEdocuenta() {
        return edocuenta;
    }

    public void setEdocuenta(boolean edocuenta) {
        this.edocuenta = edocuenta;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNotrabajador() {
        return notrabajador;
    }

    public void setNotrabajador(String notrabajador) {
        this.notrabajador = notrabajador;
    }

    @XmlTransient
    public List<Kit> getKitList() {
        return kitList;
    }

    public void setKitList(List<Kit> kitList) {
        this.kitList = kitList;
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
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unam.mx.cella.modelo.Profesor[ id=" + id + " ]";
    }
    
}