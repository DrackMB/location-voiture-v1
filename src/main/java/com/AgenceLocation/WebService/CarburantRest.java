/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.WebService;


import com.AgenceLocation.Service.impl.*;
import com.AgenceLocation.Repository.CarburantRepository;
import com.AgenceLocation.Service.facad.CarburantService;
import com.AgenceLocation.bean.Carburant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author dell
 */
@RestController
@RequestMapping("/carburant")
public class CarburantRest {
    @Autowired
    CarburantService carburantService;
    @PostMapping("/")
    public int save(Carburant carburant) {
        return carburantService.save(carburant);
    }
    
    
    
}