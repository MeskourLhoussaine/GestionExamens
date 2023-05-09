package ma.projet.beans.repository;

import ma.projet.beans.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.PasserExamen;

import java.util.List;

public interface PasserExamenRepository extends JpaRepository<PasserExamen,Integer>{
	public PasserExamen findById(int id);
	List<PasserExamen> findByExamen(Examen exam);

}
