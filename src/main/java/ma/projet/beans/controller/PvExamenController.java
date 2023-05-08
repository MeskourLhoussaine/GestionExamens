package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.PvExamen;
import ma.projet.beans.service.PvExamenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/pvExamens")
@AllArgsConstructor
public class PvExamenController {
    private PvExamenService pvExamenService;
    @GetMapping(value = "/{id}")
    public PvExamen findById(@PathParam(value = "id")int id) {
        return pvExamenService.findById(id);
    }
    @GetMapping(value = "/")
    public List<PvExamen> findAll() {
        return pvExamenService.findAll();
    }
}
