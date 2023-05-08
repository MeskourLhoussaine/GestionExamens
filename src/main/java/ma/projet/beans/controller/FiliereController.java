package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Filiere;
import ma.projet.beans.service.FilierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/filieres")
@AllArgsConstructor
public class FiliereController {
    private FilierService filierService;
    @GetMapping(value = "/{id}")
    public Filiere findById(@PathParam(value = "id")int id) {
        return filierService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Filiere> findAll() {
        return filierService.findAll();
    }
}
