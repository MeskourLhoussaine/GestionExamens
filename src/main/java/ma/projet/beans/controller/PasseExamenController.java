package ma.projet.beans.controller;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.PasserExamen;
import ma.projet.beans.service.PasseExamenService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/passeExamens")
@AllArgsConstructor
public class PasseExamenController {
    private PasseExamenService passeExamenService;


    @GetMapping(value = "/")
    public List<PasserExamen> findAll() {
        return passeExamenService.findAll();
    }
    @GetMapping(value = "/{id}")
    public PasserExamen findById(@PathParam(value = "id")int id) {
        return passeExamenService.findById(id);
    }


}
