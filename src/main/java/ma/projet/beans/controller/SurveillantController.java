package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Surveillant;
import ma.projet.beans.service.SurveillantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/surveillans")
@AllArgsConstructor
public class SurveillantController {
    private SurveillantService surveillantService;
    @GetMapping(value = "/{id}")
    public Surveillant findById(@PathParam(value = "id")int id) {
        return surveillantService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Surveillant> findAll() {
        return surveillantService.findAll();
    }
}
