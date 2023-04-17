package ma.projet.beans.repository;

import ma.projet.beans.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {
    public Professeur findById(int id);
}
