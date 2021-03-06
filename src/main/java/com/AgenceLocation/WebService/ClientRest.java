/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AgenceLocation.WebService;

import com.AgenceLocation.Service.facad.ClientService;
import com.AgenceLocation.bean.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aaoub
 */
@RestController
@RequestMapping("/AgenceLocation/client")
public class ClientRest {
    @Autowired
    ClientService clientService;
    
    @PutMapping("/cin/{cin}/ncin/{ncin}/nom/{nom}/prenom/{prenom}/sexe/{sexe}/adress/{adress}/")
    public int updateClient(@PathVariable String cin,@PathVariable String ncin,@PathVariable String nom,@PathVariable String prenom,@PathVariable String sexe,@PathVariable String adress) {
        return clientService.updateClient(cin, ncin, nom, prenom, sexe, adress);
    }
    
    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return clientService.deleteByCin(cin);
    }

    @PostMapping("/")
    public int save (@RequestBody Client client) {
        return clientService.save(client);
    } 
    
    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }
    
    @GetMapping("/findAll/")
    public List<Client> findAll() {
        return clientService.findAll();
    }
    
    
    
}
