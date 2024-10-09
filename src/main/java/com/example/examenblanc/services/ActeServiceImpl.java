package com.example.examenblanc.services;

import com.example.examenblanc.entities.Acte;
import com.example.examenblanc.entities.FamilleActe;
import com.example.examenblanc.repositories.ActeRepository;
import com.example.examenblanc.repositories.FamilleActeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@AllArgsConstructor
@Service
@Slf4j
public class ActeServiceImpl implements IActeService{
    ActeRepository acteRepository ;
    FamilleActeRepository familleActeRepository ;
    @Override
    public Acte addActe(Acte acte) {
        return null;
    }

    @Override
    public Acte updateActe(Acte acte) {
        return null;
    }

    @Override
    public Acte retrieveActe(Long id) {
        return null;
    }

    @Override
    public List<Acte> retreiveActs() {
        return null;
    }

    @Override
    public void deleteActe(Long id) {

    }

   @Override
  // @Scheduled(cron = "*/30 * * * * *")
   @Scheduled(fixedRate =30000)
  public void calculerNombreActesParPathologie() {
       log.info(String.valueOf(acteRepository.calculerNombreActesParPathologie()));

   }

    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {

// car l'acte est le parent donc on doit faire l'affectation
        familleActeRepository.save(facte);
       List<Acte> actes = facte.getActes();
       actes.forEach(acte->acte.setFamilleActe(facte));
        acteRepository.saveAll(actes);
        return facte ;


    }
}
