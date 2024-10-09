package com.example.examenblanc.services;

import com.example.examenblanc.entities.Patient;

public interface IPatientService {
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);

}
