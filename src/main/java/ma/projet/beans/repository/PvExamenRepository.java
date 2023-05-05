package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.PvExamen;

public interface PvExamenRepository extends JpaRepository <PvExamen,Integer>{
	public PvExamen findById(int id);

}
