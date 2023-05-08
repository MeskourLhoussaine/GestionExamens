package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Departement;
import ma.projet.beans.service.DepartementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/departements")
@AllArgsConstructor
public class DepartementController {
    private DepartementService departementService;
    @GetMapping(value = "/{id}")
    public Departement findById(@PathParam(value = "id")int id) {
        return departementService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Departement> findAll() {
        return departementService.findAll();
    }
}
