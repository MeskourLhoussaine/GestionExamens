package ma.projet.beans.controller;


import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Professeur;
import ma.projet.beans.service.ProfesseurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/professeures")
@AllArgsConstructor
public class ProfesseurController {
    private ProfesseurService professeurService;
    @GetMapping(value = "/{id}")
    public Professeur findById(@PathParam(value = "id")int id) {
        return professeurService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }
}
