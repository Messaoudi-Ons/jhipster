package com.myapp.mycompany.service.dto;

import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.myapp.mycompany.domain.Commande} entity.
 */
public class CommandeDTO implements Serializable {
    
    private Long id;

    @NotNull
    private String commande;

    private LocalDate dateCom;


    private Long produitId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommande() {
        return commande;
    }

    public void setCommande(String commande) {
        this.commande = commande;
    }

    public LocalDate getDateCom() {
        return dateCom;
    }

    public void setDateCom(LocalDate dateCom) {
        this.dateCom = dateCom;
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
        if (!(o instanceof CommandeDTO)) {
            return false;
        }

        return id != null && id.equals(((CommandeDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CommandeDTO{" +
            "id=" + getId() +
            ", commande='" + getCommande() + "'" +
            ", dateCom='" + getDateCom() + "'" +
            ", produitId=" + getProduitId() +
            "}";
    }
}
