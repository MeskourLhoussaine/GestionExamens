package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Admin;
import ma.projet.beans.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admine")

public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping(value = "/save")
	public Admin save(@RequestBody Admin object) {
		return adminService.save(object);
	}

	@PostMapping(value = "/update")
	public Admin update(@RequestBody Admin p) {
		return adminService.save(p);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Admin object) {
		adminService.delete(object);
	}

	@GetMapping(value = "/{id}")
	public Admin findById(@PathParam(value = "id") int id) {
		return adminService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Admin> findAll() {
		return adminService.findAll();
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id") int id) {
		adminService.delete(id);
	}
}
