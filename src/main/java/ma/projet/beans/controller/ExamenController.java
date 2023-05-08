package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Examen;
import ma.projet.beans.service.ExamenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/examens")
@AllArgsConstructor
public class ExamenController {
    private ExamenService examenService;
    @GetMapping(value = "/{id}")
    public Examen findById(@PathParam(value = "id")int id) {
        return examenService.findById(id);
    }

    public List<Examen> findAll() {
        return examenService.findAll();
    }
}
