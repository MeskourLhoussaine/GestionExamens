package ma.projet.beans.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.Professeur;
import ma.projet.beans.iservice.IProfesseur;
import ma.projet.beans.repository.ProfesseurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ProfesseurService implements IProfesseur {
	@Autowired
    private ProfesseurRepository professeurRepository;
    @Override
    public Professeur save(Professeur object) {
        return this.professeurRepository.save(object);
    }

    @Override
    public void delete(Professeur object) {
  this.professeurRepository.delete(object);
    }

    @Override
    public Professeur findById(int id) {
        return this.professeurRepository.findById(id);
    }

    @Override
    public List<Professeur> findAll() {
        return this.professeurRepository.findAll();
    }

	@Override
	public Professeur update(Professeur p) {
		// TODO Auto-generated method stub
		return this.professeurRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.professeurRepository.deleteById(id);
		
	}
}
