package com.example.examenblanc.services;

import com.example.examenblanc.entities.Acte;
import com.example.examenblanc.entities.Pathologie;

public interface IPathologisService {
    public Pathologie ajouterPathologie(Pathologie path);
    public void affecterActeAPathologie(String codeActe , String codePathologie);


}
