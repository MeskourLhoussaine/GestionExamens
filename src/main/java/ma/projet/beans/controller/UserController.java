package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.User;
import ma.projet.beans.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
	private UserService userService;

	@PostMapping(value = { "/save" })
	public User save(User object) {
		return userService.update(object);
	}

	@DeleteMapping(value = "/delete")
	public void delete( User object) {
		userService.delete(object);
	}

	@GetMapping(value = "/findById")
	public User findById(@PathParam(value = "id") int id) {
		return userService.findById(id);
	}

	@GetMapping(value = "/")
	public List<User> findAll() {
		return userService.findAll();
	}

	@PostMapping(value =  "/update" )
	public User update(@RequestBody User p) {
		return userService.update(p);
	}
	
	@DeleteMapping(value = "/deletbyId")
	public void delete(@PathParam(value = "id") int id) {
		userService.delete(id);
	}
}
