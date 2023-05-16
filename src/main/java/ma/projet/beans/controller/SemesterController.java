package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Semester;
import ma.projet.beans.service.SemesterService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/semesteres")
@AllArgsConstructor
public class SemesterController {
	private SemesterService semesterService;

	@GetMapping(value = "/findById")
	public Semester findById(@PathParam(value = "id") int id) {
		return semesterService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Semester> findAll() {
		return semesterService.findAll();
	}

	@PostMapping(value = "/save")
	public Semester save(@RequestBody Semester object) {
		return semesterService.save(object);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Semester object) {
		semesterService.delete(object);
	}

	@PostMapping(value = "/update")
	public Semester update(@RequestBody Semester p) {
		return semesterService.save(p);
	}

	@DeleteMapping(value = "/deletByid")
	public void delete(@PathParam(value = "id") int id) {
		semesterService.delete(id);
	}
}
