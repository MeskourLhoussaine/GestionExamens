package ma.projet.beans.repository;

import ma.projet.beans.entities.Modile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModileRepository extends JpaRepository<Modile,Integer> {
	public Modile findById(int id);

}
