package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.Examen;
import ma.projet.beans.entities.Filiere;

public interface FilierRepository extends JpaRepository<Filiere , Integer> {
	public Filiere findById(int id);

}
