/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Yassine.SIMOU
 */
@Entity
public class ChemicalComponentLayer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Layer layer;
    @ManyToOne
    private ChemicalComponent chemicalComponent;
    private BigDecimal teneur;

    public ChemicalComponentLayer() {
    }

    public ChemicalComponentLayer(Long id) {
        this.id = id;
    }

    public ChemicalComponentLayer(Layer layer, ChemicalComponent chemicalComponent, BigDecimal teneur) {
        this.layer = layer;
        this.chemicalComponent = chemicalComponent;
        this.teneur = teneur;
    }

    public ChemicalComponentLayer(Long id, Layer layer, ChemicalComponent chemicalComponent, BigDecimal teneur) {
        this.id = id;
        this.layer = layer;
        this.chemicalComponent = chemicalComponent;
        this.teneur = teneur;
    }

    public Layer getLayer() {
        if(layer==null){
            layer = new Layer();
        }
        return layer;
    }

    public void setLayer(Layer layer) {
        this.layer = layer;
    }

    public ChemicalComponent getChemicalComponent() {
        if(chemicalComponent==null){
            chemicalComponent = new ChemicalComponent();
        }
        return chemicalComponent;
    }

    public void setChemicalComponent(ChemicalComponent chemicalComponent) {
        this.chemicalComponent = chemicalComponent;
    }

    public BigDecimal getTeneur() {
        return teneur;
    }

    public void setTeneur(BigDecimal teneur) {
        this.teneur = teneur;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof ChemicalComponentLayer)) {
            return false;
        }
        ChemicalComponentLayer other = (ChemicalComponentLayer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChemicalComponentLayer{" + "id=" + id + ", layer=" + getLayer().getNom() + ", chemicalComponent=" + getChemicalComponent().getId() + ", teneur=" + teneur + '}';
    }

    
}
