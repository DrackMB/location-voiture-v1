/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.Repository;

import com.AgenceLocation.bean.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author OuMaima
 */
@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

    public Pays findByNom(String nom);

    public int deleteByNom(String nom);

         
    

}
