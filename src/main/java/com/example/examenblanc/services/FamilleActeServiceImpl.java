package com.example.examenblanc.services;

import com.example.examenblanc.entities.FamilleActe;
import com.example.examenblanc.repositories.FamilleActeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FamilleActeServiceImpl implements IFamilleactService{
    FamilleActeRepository familleActeRepository ;
    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        return null;
    }
}
