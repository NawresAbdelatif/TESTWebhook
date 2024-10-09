package com.example.examenblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FamilleActe implements Serializable{



        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        long idFA ;
        String codeFA ;
        String libelle ;
        String description ;
        @OneToMany(mappedBy = "familleActe" , cascade = CascadeType.ALL)
        private List<Acte> Actes=new ArrayList<>() ;

}
