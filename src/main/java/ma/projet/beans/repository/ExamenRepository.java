package ma.projet.beans.repository;

import ma.projet.beans.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Integer> {
    public Examen findById(int id);

}
