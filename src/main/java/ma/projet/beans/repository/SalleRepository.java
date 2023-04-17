package ma.projet.beans.repository;

import ma.projet.beans.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, Integer > {
    public Salle findById(int id);

}
