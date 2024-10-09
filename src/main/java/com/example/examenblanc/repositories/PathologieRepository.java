package com.example.examenblanc.repositories;

import com.example.examenblanc.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PathologieRepository extends JpaRepository<Pathologie,Long> {

  Pathologie findByCodePath(String code) ;


}
