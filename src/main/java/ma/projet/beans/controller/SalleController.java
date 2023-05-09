package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Salle;
import ma.projet.beans.service.SalleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/salles")
@AllArgsConstructor
public class SalleController {
    private SalleService  salleService;
    @GetMapping(value = "/{id}")
    public Salle findById(@PathParam(value = "id")int id) {
        return salleService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Salle> findAll() {
        return salleService.findAll();
    }
    @GetMapping(value = "/type")
    public List<Salle> findSalleByType(@RequestBody String type) {
        return salleService.findSalleByType(type);
    }
    @PostMapping(value = "/save")
	public Salle save(@RequestBody Salle object) {
		return salleService.save(object);
	}
    @DeleteMapping(value = "/delete")
	public void delete(@RequestBody Salle object) {
		salleService.delete(object);
	}
	@PostMapping(value = "/update")
	public Salle update(@RequestBody Salle p) {
		return salleService.save(p);
	}
	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		salleService.delete(id);
	}
}
