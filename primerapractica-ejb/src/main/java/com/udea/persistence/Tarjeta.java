/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alito
 */
@Entity
@Table(name = "tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")
    , @NamedQuery(name = "Tarjeta.findByNumtar", query = "SELECT t FROM Tarjeta t WHERE t.numtar = :numtar")
    , @NamedQuery(name = "Tarjeta.findByCvv", query = "SELECT t FROM Tarjeta t WHERE t.cvv = :cvv")
    , @NamedQuery(name = "Tarjeta.findByNombretipo", query = "SELECT t FROM Tarjeta t WHERE t.nombretipo = :nombretipo")
    , @NamedQuery(name = "Tarjeta.findByFechaven", query = "SELECT t FROM Tarjeta t WHERE t.fechaven = :fechaven")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numtar")
    private Integer numtar;
    @Size(max = 3)
    @Column(name = "cvv")
    private String cvv;
    @Size(max = 50)
    @Column(name = "Nombretipo")
    private String nombretipo;
    @Column(name = "fechaven")
    @Temporal(TemporalType.DATE)
    private Date fechaven;
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    @ManyToOne
    private Cliente cedula;

    public Tarjeta() {
    }

    public Tarjeta(Integer numtar) {
        this.numtar = numtar;
    }

    public Integer getNumtar() {
        return numtar;
    }

    public void setNumtar(Integer numtar) {
        this.numtar = numtar;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNombretipo() {
        return nombretipo;
    }

    public void setNombretipo(String nombretipo) {
        this.nombretipo = nombretipo;
    }

    public Date getFechaven() {
        return fechaven;
    }

    public void setFechaven(Date fechaven) {
        this.fechaven = fechaven;
    }

    public Cliente getCedula() {
        return cedula;
    }

    public void setCedula(Cliente cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numtar != null ? numtar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.numtar == null && other.numtar != null) || (this.numtar != null && !this.numtar.equals(other.numtar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.persistence.Tarjeta[ numtar=" + numtar + " ]";
    }
    
}
