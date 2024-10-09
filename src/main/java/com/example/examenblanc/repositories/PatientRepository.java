package com.example.examenblanc.repositories;

import com.example.examenblanc.entities.Acte;
import com.example.examenblanc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
