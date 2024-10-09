package com.example.examenblanc.services;

import com.example.examenblanc.entities.Pathologie;
import com.example.examenblanc.entities.Patient;
import com.example.examenblanc.repositories.PathologieRepository;
import com.example.examenblanc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements IPatientService{
    PatientRepository patientRepository;
    PathologieRepository pathologieRepository;
    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath) {
        Pathologie pathologie=pathologieRepository.findByCodePath(codePath);
        p.getPathologies().add(pathologie);
        return patientRepository.save(p);

    }
}
