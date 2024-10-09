package com.example.examenblanc.services;

import com.example.examenblanc.entities.Acte;
import com.example.examenblanc.entities.Pathologie;
import com.example.examenblanc.repositories.ActeRepository;
import com.example.examenblanc.repositories.PathologieRepository;
import com.example.examenblanc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class PathologieServiceImpl implements IPathologisService{
    PathologieRepository pathologieRepository ;
    ActeRepository acteRepository ;
    @Override
    public Pathologie ajouterPathologie(Pathologie path) {
        return pathologieRepository.save(path);
    }

    @Override
    public void affecterActeAPathologie(String codeActe, String codePathologie) {

            Pathologie pathologie = pathologieRepository.findByCodePath(codePathologie);
            if(!pathologie.isArchive()) {
            Acte acte = acteRepository.findByCodeActe(codeActe);
            pathologie.getActes().add(acte);
            pathologieRepository.save(pathologie);
        }

    }
}
