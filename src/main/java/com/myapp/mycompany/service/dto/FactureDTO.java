package com.myapp.mycompany.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.myapp.mycompany.domain.Facture} entity.
 */
public class FactureDTO implements Serializable {
    
    private Long id;

    private Long montant;

    @NotNull
    private String modepayement;


    private Long produitId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public String getModepayement() {
        return modepayement;
    }

    public void setModepayement(String modepayement) {
        this.modepayement = modepayement;
    }

    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FactureDTO)) {
            return false;
        }

        return id != null && id.equals(((FactureDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FactureDTO{" +
            "id=" + getId() +
            ", montant=" + getMontant() +
            ", modepayement='" + getModepayement() + "'" +
            ", produitId=" + getProduitId() +
            "}";
    }
}
