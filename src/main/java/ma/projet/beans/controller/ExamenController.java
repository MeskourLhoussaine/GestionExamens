package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Examen;
import ma.projet.beans.service.ExamenService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/examens")
@AllArgsConstructor
public class ExamenController {
	private ExamenService examenService;

	@GetMapping(value = "/{id}")
	public Examen findById(@PathParam(value = "id") int id) {
		return examenService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Examen> findAll() {
		return examenService.findAll();
	}
	@PostMapping(value =  "/save")
	public Examen save(@RequestBody  Examen object) {
		return examenService.save(object);
	}
	 @DeleteMapping(value = "/delete")
	public void delete(@RequestBody  Examen object) {
		examenService.delete(object);
	}
	 @PostMapping(value =  "/update")
	public Examen update(@RequestBody  Examen p) {
		return examenService.save(p);
	}
	 @DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		examenService.delete(id);
	}
}
