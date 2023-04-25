package ma.projet.beans.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Admin;
import ma.projet.beans.iservice.IAdmin;
import ma.projet.beans.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AdminService implements IAdmin {
    private AdminRepository adminRepository;
    @Override
    public Admin save(Admin object) {
        return this.adminRepository.save(object);
    }

    @Override
    public void delete(Admin object) {
        this.adminRepository.delete(object);

    }

    @Override
    public Admin findById(int id) {
        return this.adminRepository.findById(id);
    }

    @Override
    public List<Admin> findAll() {
        return this.adminRepository.findAll();
    }
}
