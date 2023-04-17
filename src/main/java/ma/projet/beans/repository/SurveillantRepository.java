package ma.projet.beans.repository;

import ma.projet.beans.entities.Surveillant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveillantRepository extends JpaRepository<Surveillant,Integer> {
public Surveillant findById(int id);
}
