package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant,Long> {
    //Set<Etudiant> findAllByNom(String n) ;


    //Afficher les etudiants
    // @Query(value = "select e from Etudiant e where e.Contrats.idContrat")

    // Etudiant findEtudiantByContrats(int idContrat)


}