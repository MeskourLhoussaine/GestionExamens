package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Fraude;
import ma.projet.beans.service.FraudeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/fraudes")

public class FraudeController {
	@Autowired
	private FraudeService fraudeService;

	@GetMapping(value = "/{id}")
	public Fraude findById(@PathParam(value = "id") int id) {
		return fraudeService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Fraude> findAll() {
		return fraudeService.findAll();
	}
	 @PostMapping(value =  "/save")
	public Fraude save(@RequestBody Fraude object) {
		return fraudeService.save(object);
	}
	 @DeleteMapping(value = "/delete")
	public void delete(Fraude object) {
		fraudeService.delete(object);
	}
	 @PostMapping(value =  "/update")
	public Fraude update(@RequestBody Fraude p) {
		return fraudeService.save(p);
	}
	 @DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		fraudeService.delete(id);
	}

}
