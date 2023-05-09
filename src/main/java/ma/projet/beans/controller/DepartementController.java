package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Departement;
import ma.projet.beans.service.DepartementService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/departements")
@AllArgsConstructor
public class DepartementController {
	private DepartementService departementService;

	@GetMapping(value = "/{id}")
	public Departement findById(@PathParam(value = "id") int id) {
		return departementService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Departement> findAll() {
		return departementService.findAll();
	}
	   @PostMapping(value =  "/save")
	public Departement save(@RequestBody Departement object) {
		return departementService.save(object);
	}
	   @DeleteMapping(value = "/delete")
	public void delete(@RequestBody Departement object) {
		departementService.delete(object);
	}
	   @PostMapping(value =  "/update")
	public Departement update(@RequestBody  Departement p) {
		return departementService.save(p);
	}
	   @DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		departementService.delete(id);
	}
}
