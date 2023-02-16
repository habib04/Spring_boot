package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private Long numMoniteur; // Clé primaire
    private String nomM;
    private String prenomM;

    private Date dateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;
}
