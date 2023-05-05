package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.PasserExamen;

public interface PasserExamenRepository extends JpaRepository<PasserExamen,Integer>{
	public PasserExamen findById(int id);

}
