package tn.esprit.infini.stationski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table( name = "Piste")
    public class piste implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idPiste")
        private Integer idPiste; // Clé primaire
        private Long numPiste;
        private String nomPiste;
        @Enumerated(EnumType.STRING)
        private Couleur couleur;
        private Integer longeur;
        private Integer pente;
        @ManyToMany(cascade = CascadeType.ALL)
        private Set<Skieur> skieurs;

// Constructeur et accesseurs (getters) et mutateurs (setters)
    }

