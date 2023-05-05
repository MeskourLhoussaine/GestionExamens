package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module,Integer> {
	public Module findById(int id);

}
