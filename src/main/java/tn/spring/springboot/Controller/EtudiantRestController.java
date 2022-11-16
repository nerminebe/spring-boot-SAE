package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Service.IEtudiantService;
import tn.spring.springboot.Entity.Etudiant;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {
    @Autowired
    IEtudiantService etudiantService;
    //http://localhost:8020/esprit/etudiant/retrieveAll
    @GetMapping("/retrieveAll")
    List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> l = etudiantService.retrieveAllEtudiants();
        return l;
    }
    //http://localhost:8020/esprit/etudiant/addetudiant

    @PostMapping("/addetudiant")
    Etudiant addEtudiant (@RequestBody Etudiant e){
        return   etudiantService.addEtudiant(e);
    }
    //http://localhost:8020/esprit/etudiant/updateEtudiant
    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant e){
        return etudiantService.updateEtudiant(e);

    }
    //http://localhost:8020/esprit/etudiant/deleteEtudiant/{id_etudiant}
    @DeleteMapping("/deleteEtudiant/{id_etudiant}")
    void deleteEtudiant(@PathVariable("id_etudiant") long id){
        etudiantService.deleteEtudiant( id);
    }
}