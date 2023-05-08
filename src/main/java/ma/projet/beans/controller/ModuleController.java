package ma.projet.beans.controller;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.service.ModuleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/modules")
@AllArgsConstructor
public class ModuleController {
   private ModuleService moduleService;

    @GetMapping(value = "/{id}")
    public Module findById(@PathParam(value = "id")int id) {
        return moduleService.findById(id);
    }

    @GetMapping(value = "/")
    public List<Module> findAll() {
        return moduleService.findAll();
    }
}
