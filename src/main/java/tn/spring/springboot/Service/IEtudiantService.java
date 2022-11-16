package tn.spring.springboot.Service;

import tn.spring.springboot.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    void deleteEtudiant(Long idEtudiant);

    Etudiant retrieveEtudiant(Long idEtudiant, Etudiant e);

    Etudiant updateEtudiant(Etudiant e);


}