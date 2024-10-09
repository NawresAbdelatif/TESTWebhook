package com.example.examenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idPatient ;

    @Enumerated(EnumType.STRING)
    TypePieceIdentitie typePieceIdentitie ;
    String IdentifiantPieceIdentitie ;
    Date dateEmission ;
    String nomP;
    String prenomP ;
    @JsonIgnore
    @ManyToMany
    private List<Pathologie> pathologies=new ArrayList<>();

}
