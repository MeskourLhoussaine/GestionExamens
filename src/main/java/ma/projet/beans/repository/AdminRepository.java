package ma.projet.beans.repository;

import ma.projet.beans.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin , Integer> {
    public Admin findBy(int id);

}
