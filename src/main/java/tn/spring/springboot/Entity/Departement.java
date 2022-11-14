package tn.spring.springboot.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Departement")
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private int idDepart;
    private String nomDeart;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departement")
    private Set<Etudiant> etudiant;


    public Departement() {
    }

    public Departement(int idDepart, String nomDeart) {
        this.idDepart = idDepart;
        this.nomDeart = nomDeart;
    }

    public int getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomDeart() {
        return nomDeart;
    }

    public void setNomDeart(String nomDeart) {
        this.nomDeart = nomDeart;
    }
}