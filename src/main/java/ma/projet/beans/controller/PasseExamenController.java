package ma.projet.beans.controller;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Examen;
import ma.projet.beans.entities.PasserExamen;
import ma.projet.beans.service.PasseExamenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/passeExamens")

public class PasseExamenController {
	@Autowired
    private PasseExamenService passeExamenService;


    @GetMapping(value = "/")
    public List<PasserExamen> findAll() {
        return passeExamenService.findAll();
    }
    @GetMapping(value = "/{id}")
    public PasserExamen findById(@PathParam(value = "id")int id) {
        return passeExamenService.findById(id);
    }

    @GetMapping("/exam")
    public List<PasserExamen> findByExamen(@RequestBody Examen exam) {
        return passeExamenService.findByExamen(exam);
    }
    @PostMapping(value = "/save")
	public PasserExamen save(@RequestBody PasserExamen object) {
		return passeExamenService.save(object);
	}
    @DeleteMapping(value = "/delete")
	public void delete(@RequestBody PasserExamen object) {
		passeExamenService.delete(object);
	}
	@PostMapping(value = "/update")
	public PasserExamen update( @RequestBody PasserExamen p) {
		return passeExamenService.save(p);
	}
	@DeleteMapping(value = "/{id}")
	public void delete(@PathParam(value = "id") int id) {
		passeExamenService.delete(id);
	}
}
