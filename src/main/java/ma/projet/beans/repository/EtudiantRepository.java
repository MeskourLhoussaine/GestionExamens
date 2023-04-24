package ma.projet.beans.repository;

import ma.projet.beans.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    public Etudiant findById(int id);
public Etudiant findEtudiantByNum_Apo(int Num_Apo);


}
