/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.Repository;

import com.AgenceLocation.bean.Categorie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
  Categorie findByLibelle(String libelle);
  List<Categorie>findByMarqueLibelle(String libelle);
  
}
