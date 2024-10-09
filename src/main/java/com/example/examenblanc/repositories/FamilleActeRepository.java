package com.example.examenblanc.repositories;

import com.example.examenblanc.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe,Long> {
}
