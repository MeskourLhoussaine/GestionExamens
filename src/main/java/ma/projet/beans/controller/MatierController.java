package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Matiere;
import ma.projet.beans.service.MatierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/matieres")

public class MatierController {
	@Autowired
	private MatierService matierService;

	@GetMapping(value = "/")
	public List<Matiere> findAll() {
		return matierService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Matiere findById(@PathParam(value = "id") int id) {
		return matierService.findById(id);
	}

	@PostMapping(value = "/save")
	public Matiere save(@RequestBody Matiere object) {
		return matierService.save(object);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Matiere object) {
		matierService.delete(object);
	}

	@PostMapping(value = "/update")
	public Matiere update(@RequestBody Matiere p) {
		return matierService.update(p);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id") int id) {
		matierService.delete(id);
	}
}
