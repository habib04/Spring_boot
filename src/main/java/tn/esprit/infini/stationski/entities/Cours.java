package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCours")
    private Long numCours; // Clé primaire
    private Integer niveau;
    private Float prix;
    @Enumerated(EnumType.STRING)
    private Support support;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    private Integer creneau;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> inscriptions;
}
