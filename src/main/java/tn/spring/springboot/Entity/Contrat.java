package tn.spring.springboot.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrat")
    public int idContrat;

    @Temporal (TemporalType.DATE)
    public Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    public Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;

    @ManyToOne
    Etudiant etudiant;



    public Contrat() {
    }

    public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat, Specialite specialite, Boolean archive) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.specialite = specialite;
        this.archive = archive;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}