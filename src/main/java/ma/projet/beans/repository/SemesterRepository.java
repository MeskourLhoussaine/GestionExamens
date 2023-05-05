package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.Semester;

public interface SemesterRepository extends JpaRepository<Semester,Integer>{
	public Semester findById(int id);

}
