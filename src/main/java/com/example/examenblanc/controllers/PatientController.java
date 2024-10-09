package com.example.examenblanc.controllers;

import com.example.examenblanc.entities.Patient;
import com.example.examenblanc.repositories.PatientRepository;
import com.example.examenblanc.services.IPatientService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    IPatientService patientService ;

    public PatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/ajouterPatientEtAffecterAPathologie/{codePath}")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient p, @PathVariable String codePath){
        return patientService.ajouterPatientEtAffecterAPathologie(p,codePath);
    }

}
