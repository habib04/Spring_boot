package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
    @Table( name = "Abonnement")
    public class Abonnement implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="numAbon")
        private Long numAbon; // Clé primaire
        private Date datedebut;
        private Date dateFin;
        @Enumerated(EnumType.STRING)
        private TypeAbonnement typeabonnemnt;
        private Float prixAbon;


    }
