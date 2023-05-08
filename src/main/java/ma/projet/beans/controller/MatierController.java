package ma.projet.beans.controller;


import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Matiere;
import ma.projet.beans.service.MatierService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/matieres")
@AllArgsConstructor
public class MatierController {
    private MatierService matierService;
    @GetMapping(value = "/")
    public List<Matiere> findAll() {
        return matierService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Matiere findById(@PathParam(value = "id")int id) {
        return matierService.findById(id);
    }
}
