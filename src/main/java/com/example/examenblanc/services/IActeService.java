package com.example.examenblanc.services;

import com.example.examenblanc.entities.Acte;
import com.example.examenblanc.entities.FamilleActe;

import java.util.List;

public interface IActeService {
    Acte addActe(Acte acte);

    Acte updateActe (Acte acte);

    Acte retrieveActe (Long id );

    List<Acte> retreiveActs () ;

    void deleteActe(Long id );

    public void calculerNombreActesParPathologie();

    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte);


}
