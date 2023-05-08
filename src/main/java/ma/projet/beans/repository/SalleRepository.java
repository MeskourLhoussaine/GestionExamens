package ma.projet.beans.repository;

import ma.projet.beans.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Integer > {
    public Salle findById(int id);
    List<Salle> findSalleByType(String type);

}
