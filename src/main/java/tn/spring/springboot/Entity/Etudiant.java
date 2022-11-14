package tn.spring.springboot.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    public Long idEtudiant;
    private  String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    public Etudiant(Long idEtudiant, String prenomE, String nomE) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
    }

    public Etudiant() {
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }
}