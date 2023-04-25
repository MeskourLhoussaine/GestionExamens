package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Etudiants")
@AllArgsConstructor
public class EtudiantController {
    private EtudiantService etudiantService;
    @PostMapping(value = { "/save", "/update" })
    public Etudiant save(Etudiant object) {
        return etudiantService.save(object);
    }
    @DeleteMapping(value = "/delete")
    public void delete(Etudiant object) {
        etudiantService.delete(object);
    }
    @GetMapping(value = "/findById")
    public Etudiant findById(@PathParam(value = "id")int id) {
        return etudiantService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

}
