package tn.spring.springboot.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Repository.EtudiantRepository;
import tn.spring.springboot.Entity.Etudiant;

import java.util.List;

@Service
@Slf4j  //activer le service  |
public class EtudiantService implements IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRespository;

    //Afficher tout les etudiants
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> es = etudiantRespository.findAll();
        for (Etudiant e : es) {
            log.info("Etudiant:" + e);
        }
        return es;
    }

    //Ajouter Etudiant

    public Etudiant addEtudiant(Etudiant e) {
        etudiantRespository.save(e);
        return e;
    }

    //Supprimer Etudiant
    @Override
    public void deleteEtudiant(Long idEtudiant) {

        etudiantRespository.deleteById(idEtudiant);
    }

    //Afficher Etudiant

    public Etudiant retrieveEtudiant(Long idEtudiant, Etudiant e) {
        etudiantRespository.findById(idEtudiant).orElse(null); //orElse(pour eviter l'exception
        return e;
    }

    //Modifier Etudiant

    public Etudiant updateEtudiant(Etudiant e) {
        etudiantRespository.save(e);
        return e;


    }
}