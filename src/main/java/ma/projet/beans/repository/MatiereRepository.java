package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere,Integer> {
   public Matiere findById(int id);
}
