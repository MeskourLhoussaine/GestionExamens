package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Modile;
import ma.projet.beans.service.ModileService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/modiles")
@AllArgsConstructor
public class ModileController {
	private ModileService modileService;

	@GetMapping(value = "/findById")
	public Modile findById(@PathParam(value = "id") int id) {
		return modileService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Modile> findAll() {
		return modileService.findAll();
	}

	@PostMapping(value = "/save")
	public Modile save(@RequestBody Modile object) {
		return modileService.save(object);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Modile object) {
		modileService.delete(object);
	}

	@PostMapping(value = "/update")
	public Modile update(@RequestBody Modile p) {
		return modileService.save(p);
	}

	@DeleteMapping(value = "/deleteById")
	public void delete(@PathParam(value = "id") int id) {
		modileService.delete(id);
	}
}
