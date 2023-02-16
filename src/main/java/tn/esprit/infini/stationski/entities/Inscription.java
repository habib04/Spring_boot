package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "cours")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscripetion")
    private Long numInscription; // Clé primaire
    private Integer numSemaine;

    @ManyToOne
    Skieur skieurs;
    @ManyToOne
    Cours cours;

}
