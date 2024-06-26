package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Filiere;
import ma.projet.beans.service.FilierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/filieres")

public class FiliereController {
	@Autowired
	private FilierService filierService;

	@GetMapping(value = "/{id}")
	public Filiere findById(@PathParam(value = "id") int id) {
		return filierService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Filiere> findAll() {
		return filierService.findAll();
	}
	 @PostMapping(value =  "/save")
	public Filiere save(@RequestBody  Filiere object) {
		return filierService.save(object);
	}
	 @DeleteMapping(value = "/delete")
	public void delete( @RequestBody Filiere object) {
		filierService.delete(object);
	}
	 @PostMapping(value =  "/update")
	public Filiere update(@RequestBody  Filiere p) {
		return filierService.save(p);
	}
	 @DeleteMapping(value = "/{id}")
	public void delete(int id) {
		filierService.delete(id);
	}
}
