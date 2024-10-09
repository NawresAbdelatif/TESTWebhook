package com.example.examenblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pathologie implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idPath ;
    @Column(unique = true)
    String codePath ;
    String libelle ;
    String description ;
    boolean archive=false ;
    @ManyToMany
     Set<Acte>Actes;

}
