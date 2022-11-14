package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Service.IEtudiantservice;

import java.util.List;

@RestController
@RequestMapping("/etudiant")


public class EtudiantRestController {
    @Autowired
    IEtudiantservice etudiantservice;


    @GetMapping("/affichertout")

    List<Etudiant> affichertout(){
        List<Etudiant> l= Etudiantservice.retrievedALLEtudiants();
        return l;

}
}
