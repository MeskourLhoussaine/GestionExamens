package ma.projet.beans.controller;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Fraude;
import ma.projet.beans.service.FraudeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/fraudes")
@AllArgsConstructor
public class FraudeController {
private FraudeService fraudeService;


    @GetMapping(value = "/{id}")
    public Fraude findById(@PathParam(value = "id")int id) {
        return fraudeService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Fraude> findAll() {
        return fraudeService.findAll();
    }


}
