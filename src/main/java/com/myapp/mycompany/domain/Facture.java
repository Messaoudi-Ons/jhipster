package com.myapp.mycompany.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A Facture.
 */
@Entity
@Table(name = "facture")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "montant")
    private Long montant;

    @NotNull
    @Column(name = "modepayement", nullable = false)
    private String modepayement;

    @ManyToOne
    @JsonIgnoreProperties(value = "factures", allowSetters = true)
    private Produit produit;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontant() {
        return montant;
    }

    public Facture montant(Long montant) {
        this.montant = montant;
        return this;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public String getModepayement() {
        return modepayement;
    }

    public Facture modepayement(String modepayement) {
        this.modepayement = modepayement;
        return this;
    }

    public void setModepayement(String modepayement) {
        this.modepayement = modepayement;
    }

    public Produit getProduit() {
        return produit;
    }

    public Facture produit(Produit produit) {
        this.produit = produit;
        return this;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Facture)) {
            return false;
        }
        return id != null && id.equals(((Facture) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Facture{" +
            "id=" + getId() +
            ", montant=" + getMontant() +
            ", modepayement='" + getModepayement() + "'" +
            "}";
    }
}
