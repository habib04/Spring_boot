package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur; // Clé primaire
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

    @ManyToMany(mappedBy="skieurs", cascade = CascadeType.ALL)
    private Set<piste> pistes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="skieurs")
    private Set<Inscription> inscriptions;
    @OneToOne
    private Abonnement abonnement;
}
