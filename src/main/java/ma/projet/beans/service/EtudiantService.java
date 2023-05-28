package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.iservice.IEtudiant;
import ma.projet.beans.repository.EtudiantRepository;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor

public class EtudiantService implements IEtudiant {

	private EtudiantRepository etudiantRepository; 
	
	@Override
	public Etudiant save(Etudiant object) {
		// TODO Auto-generated method stub
		return this.etudiantRepository.save(object);
	}

	@Override
	public void delete(Etudiant object) {
		// TODO Auto-generated method stub
		this.etudiantRepository.delete(object);
	}

	@Override
	public Etudiant findById(int id) {
		// TODO Auto-generated method stub
		return this.etudiantRepository.findById(id);
	}

	@Override
	public List<Etudiant> findAll() {
		// TODO Auto-generated method stub
		return this.etudiantRepository.findAll();
	}

	@Override
	public Etudiant update(Etudiant p) {
		// TODO Auto-generated method stub
		return this.etudiantRepository.save(p);
	}

	@Override
	public void delete(int id) {
		this.etudiantRepository.deleteById(id);
		
	}


}
