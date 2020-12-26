package com.myapp.mycompany.service.mapper;


import com.myapp.mycompany.domain.*;
import com.myapp.mycompany.service.dto.FactureDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Facture} and its DTO {@link FactureDTO}.
 */
@Mapper(componentModel = "spring", uses = {ProduitMapper.class})
public interface FactureMapper extends EntityMapper<FactureDTO, Facture> {

    @Mapping(source = "produit.id", target = "produitId")
    FactureDTO toDto(Facture facture);

    @Mapping(source = "produitId", target = "produit")
    Facture toEntity(FactureDTO factureDTO);

    default Facture fromId(Long id) {
        if (id == null) {
            return null;
        }
        Facture facture = new Facture();
        facture.setId(id);
        return facture;
    }
}
