package com.example.examenblanc.repositories;

import com.example.examenblanc.entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository  extends JpaRepository<Acte,Long> {
@Query("SELECT p.idPath, COUNT(a) FROM Pathologie p JOIN p.Actes a GROUP BY p.idPath")

     int calculerNombreActesParPathologie();


    Acte findByCodeActe(String codeA) ;

}
