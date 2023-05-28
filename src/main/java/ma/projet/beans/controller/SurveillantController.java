package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.entities.Surveillant;
import ma.projet.beans.service.SurveillantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/surveillans")


public class SurveillantController {
	@Autowired
	private SurveillantService surveillantService;

	@GetMapping(value = "/{id}")
	public Surveillant findById(@PathParam(value = "id") int id) {
		return surveillantService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Surveillant> findAll() {
		return this.surveillantService.findAll();
	}
	@PostMapping(value = "/save")
	public Surveillant save(@RequestBody Surveillant object) {
		return surveillantService.save(object);
	}

	@DeleteMapping(value = "/delete")
	public void delete( @RequestBody Surveillant object) {
		surveillantService.delete(object);
	}
	@PostMapping(value = "/update")
	public Surveillant update(@RequestBody Surveillant p) {
		return surveillantService.save(p);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id")int id) {
		surveillantService.delete(id);
	}
	
	
}
