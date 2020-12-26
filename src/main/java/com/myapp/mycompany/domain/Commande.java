package com.myapp.mycompany.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Commande.
 */
@Entity
@Table(name = "commande")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "commande", nullable = false)
    private String commande;

    @Column(name = "date_com")
    private LocalDate dateCom;

    @ManyToOne
    @JsonIgnoreProperties(value = "commandes", allowSetters = true)
    private Produit produit;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommande() {
        return commande;
    }

    public Commande commande(String commande) {
        this.commande = commande;
        return this;
    }

    public void setCommande(String commande) {
        this.commande = commande;
    }

    public LocalDate getDateCom() {
        return dateCom;
    }

    public Commande dateCom(LocalDate dateCom) {
        this.dateCom = dateCom;
        return this;
    }

    public void setDateCom(LocalDate dateCom) {
        this.dateCom = dateCom;
    }

    public Produit getProduit() {
        return produit;
    }

    public Commande produit(Produit produit) {
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
        if (!(o instanceof Commande)) {
            return false;
        }
        return id != null && id.equals(((Commande) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Commande{" +
            "id=" + getId() +
            ", commande='" + getCommande() + "'" +
            ", dateCom='" + getDateCom() + "'" +
            "}";
    }
}
