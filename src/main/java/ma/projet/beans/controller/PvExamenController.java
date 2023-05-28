package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.entities.PvExamen;
import ma.projet.beans.service.PvExamenService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/pvExamens")
@AllArgsConstructor
public class PvExamenController {
	private PvExamenService pvExamenService;

	@GetMapping(value = "/{id}")
	public PvExamen findById(@PathParam(value = "id") int id) {
		return pvExamenService.findById(id);
	}

	@GetMapping(value = "/")
	public List<PvExamen> findAll() {
		return pvExamenService.findAll();
	}
	@PostMapping(value = "/save")
	public PvExamen save(@RequestBody PvExamen object) {
		return pvExamenService.save(object);
	}
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody PvExamen object) {
		pvExamenService.delete(object);
	}
	@PostMapping(value = "/update")
	public PvExamen update(@RequestBody PvExamen p) {
		return pvExamenService.save(p);
	}
	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		pvExamenService.delete(id);
	}
	
}
