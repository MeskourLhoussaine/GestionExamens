package ma.projet.beans.controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Semester;
import ma.projet.beans.service.SemesterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/semesteres")
@AllArgsConstructor
public class SemesterController {
    private SemesterService semesterService;
    @GetMapping(value = "/{id}")
    public Semester findById(@PathParam(value = "id")int id) {
        return semesterService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Semester> findAll() {
        return semesterService.findAll();
    }
}
