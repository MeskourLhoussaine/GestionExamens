package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ma.projet.beans.entities.Departement;

public interface DepartementRepository  extends JpaRepository<Departement , Integer>{
	public Departement findById(int id);
}
