package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/etudiants")
@AllArgsConstructor
public class EtudiantController {
    private EtudiantService etudiantService;
    @PostMapping(value = "/save")
    public Etudiant save(@RequestBody Etudiant object) {
        return etudiantService.save(object);
    }
    @PostMapping(value = "/update")
    public Etudiant update(@RequestBody Etudiant p) {
        return etudiantService.update(p);
    }
    @GetMapping(value = "/{id}")
    public void delete(@PathParam(value = "id")int id) {
        etudiantService.delete(id);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Etudiant object) {
        etudiantService.delete(object);
    }
    @GetMapping(value = "/{id}")
    public Etudiant findById(@PathParam(value = "id")int id) {
        return etudiantService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

}
