package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Professeur;
import ma.projet.beans.service.ProfesseurService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/professeures")
@AllArgsConstructor
public class ProfesseurController {
	private ProfesseurService professeurService;

	@GetMapping(value = "/{id}")
	public Professeur findById(@PathParam(value = "id") int id) {
		return professeurService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Professeur> findAll() {
		return professeurService.findAll();
	}
	@PostMapping(value = "/save")
	public Professeur save(@RequestBody Professeur object) {
		return professeurService.save(object);
	}
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Professeur object) {
		professeurService.delete(object);
	}
	@PostMapping(value = "/update")
	public Professeur update(@RequestBody Professeur p) {
		return professeurService.save(p);
	}
	@DeleteMapping(value = "/deletById")
	public void delete(@PathParam(value = "id") int id) {
		professeurService.delete(id);
	}
}
