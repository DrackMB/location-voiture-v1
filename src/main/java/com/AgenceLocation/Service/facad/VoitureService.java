/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.Service.facad;

//import com.AgenceLocation.bean.Agence;
import com.AgenceLocation.bean.Voiture;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public interface VoitureService {

    int save(Voiture voiture);

    List<Voiture> findAll();

    Voiture findByMatricule(String matricule);

    List<Voiture> findByCode(String code);

    Voiture findByCategorieLibelleAndAgenceNom(String libelle, String nom);

    Voiture findByCategorielibelle(String libelle, String code);

    int deleteByMatricule(String matricule);

    List<Voiture> findByTransmitionLibelle(String libelle);

    List<Voiture> findByCarburantLibelle(String libelle);
    
    int updateVoiture(String matricule,double moyenNote,int prixinitial);
    
  
    Voiture findByCategorieLibelle(String libelle);
    

}
