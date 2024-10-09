package com.example.examenblanc.controllers;

import com.example.examenblanc.entities.FamilleActe;
import com.example.examenblanc.services.IActeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
 class ActeController {
    IActeService  acteService ;

    @PutMapping("/ajouterFamilleActeEtActeAssocie")
     FamilleActe ajouterFamilleActeEtActeAssocie(@RequestBody FamilleActe facte){
        return acteService.ajouterFamilleActeEtActeAssocie(facte);

    }
}
