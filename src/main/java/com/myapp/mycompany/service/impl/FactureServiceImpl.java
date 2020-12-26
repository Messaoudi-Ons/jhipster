package com.myapp.mycompany.service.impl;

import com.myapp.mycompany.service.FactureService;
import com.myapp.mycompany.domain.Facture;
import com.myapp.mycompany.repository.FactureRepository;
import com.myapp.mycompany.service.dto.FactureDTO;
import com.myapp.mycompany.service.mapper.FactureMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Facture}.
 */
@Service
@Transactional
public class FactureServiceImpl implements FactureService {

    private final Logger log = LoggerFactory.getLogger(FactureServiceImpl.class);

    private final FactureRepository factureRepository;

    private final FactureMapper factureMapper;

    public FactureServiceImpl(FactureRepository factureRepository, FactureMapper factureMapper) {
        this.factureRepository = factureRepository;
        this.factureMapper = factureMapper;
    }

    @Override
    public FactureDTO save(FactureDTO factureDTO) {
        log.debug("Request to save Facture : {}", factureDTO);
        Facture facture = factureMapper.toEntity(factureDTO);
        facture = factureRepository.save(facture);
        return factureMapper.toDto(facture);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<FactureDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Factures");
        return factureRepository.findAll(pageable)
            .map(factureMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<FactureDTO> findOne(Long id) {
        log.debug("Request to get Facture : {}", id);
        return factureRepository.findById(id)
            .map(factureMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Facture : {}", id);
        factureRepository.deleteById(id);
    }
}
