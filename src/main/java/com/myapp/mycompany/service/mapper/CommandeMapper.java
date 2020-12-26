package com.myapp.mycompany.service.mapper;


import com.myapp.mycompany.domain.*;
import com.myapp.mycompany.service.dto.CommandeDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Commande} and its DTO {@link CommandeDTO}.
 */
@Mapper(componentModel = "spring", uses = {ProduitMapper.class})
public interface CommandeMapper extends EntityMapper<CommandeDTO, Commande> {

    @Mapping(source = "produit.id", target = "produitId")
    CommandeDTO toDto(Commande commande);

    @Mapping(source = "produitId", target = "produit")
    Commande toEntity(CommandeDTO commandeDTO);

    default Commande fromId(Long id) {
        if (id == null) {
            return null;
        }
        Commande commande = new Commande();
        commande.setId(id);
        return commande;
    }
}
