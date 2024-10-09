package com.example.examenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idActe ;
    String codeActe ;
    int cotationActe ;
    float prixUnitaireActe ;
    String designactionActe ;

    @ManyToOne
    @JsonIgnore
     private FamilleActe familleActe;
    @ManyToMany(mappedBy = "Actes" )
    @JsonIgnore
    Set<Pathologie> pathologies ;


}
