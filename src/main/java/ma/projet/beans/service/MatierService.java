package ma.projet.beans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.Matiere;
import ma.projet.beans.iservice.IMatiere;
import ma.projet.beans.repository.MatiereRepository;


@Service

public class MatierService implements IMatiere {
	@Autowired
   private MatiereRepository matiereRepository;
	@Override
	public Matiere save(Matiere object) {
		// TODO Auto-generated method stub
		return matiereRepository.save(object);
	}

	@Override
	public void delete(Matiere object) {
		// TODO Auto-generated method stub
		matiereRepository.delete(object);
	}

	@Override
	public Matiere findById(int id) {
		// TODO Auto-generated method stub
		return matiereRepository.findById(id);
	}

	@Override
	public List<Matiere> findAll() {
		// TODO Auto-generated method stub
		return matiereRepository.findAll();
	}

	@Override
	public Matiere update(Matiere p) {
		// TODO Auto-generated method stub
		return this.matiereRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.matiereRepository.deleteById(id);
		
	}

}
