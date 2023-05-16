package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Matiere;
import ma.projet.beans.service.MatierService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/matieres")
@AllArgsConstructor
public class MatierController {
	private MatierService matierService;

	@GetMapping(value = "/")
	public List<Matiere> findAll() {
		return matierService.findAll();
	}

	@GetMapping(value = "/findById")
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

	@DeleteMapping(value = "/deletById")
	public void delete(@PathParam(value = "id") int id) {
		matierService.delete(id);
	}
}
