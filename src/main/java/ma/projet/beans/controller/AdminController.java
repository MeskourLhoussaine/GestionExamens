package ma.projet.beans.controller;


import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Admin;
import ma.projet.beans.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admine")
@AllArgsConstructor
public class AdminController {
private AdminService adminService;
    @PostMapping(value = { "/save", "/update" })
    public Admin save(Admin object) {
        return adminService.save(object);
    }
    @DeleteMapping(value = "/delete")
    public void delete(Admin object) {
        adminService.delete(object);
    }
    @GetMapping(value = "/findById")
    public Admin findById(@PathParam(value = "id")int id) {
        return adminService.findById(id);
    }
    @GetMapping(value = "/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }
}
