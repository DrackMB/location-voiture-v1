/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.Service.impl;

import com.AgenceLocation.Repository.PaysRepository;
import com.AgenceLocation.Service.facad.PaysService;
import com.AgenceLocation.bean.Pays;
import java.util.List;
import javax.management.InstanceAlreadyExistsException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author OuMaima
 */
@Service

public class PaysServiceImpl implements PaysService {

    @Autowired
    private PaysRepository paysRepository;

    @Override
    public Pays findByNom(String nom) {

        return paysRepository.findByNom(nom);
    }

    @Override
    public int save(Pays pays) throws InstanceAlreadyExistsException {
        Pays foundedPays = findByNom(pays.getNom());
        if (foundedPays == null) {
            paysRepository.save(pays);
            return 1;
        } else {
            throw new InstanceAlreadyExistsException("exist");
        }
        
    }

    @Override
    public List<Pays> findAll() {
        return paysRepository.findAll();
    }

    @Override
    @Transactional
    public int deleteByNom(String nom) {

        Pays foundedPayses = findByNom(nom);
        if (foundedPayses != null) {
            paysRepository.deleteByNom(nom);
            return 1;
        }
 
        return -1;
    }

}
