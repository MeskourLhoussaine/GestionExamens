package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Departement;
import ma.projet.beans.iservice.IDepartement;

import ma.projet.beans.repository.DepartementRepository;

@Service
@Transactional
@AllArgsConstructor

public class DepartementService implements IDepartement{
	
    private DepartementRepository departementRepository;
	@Override
	public Departement save(Departement object) {
		// TODO Auto-generated method stub
		return departementRepository.save(object);
	}

	@Override
	public void delete(Departement object) {
		// TODO Auto-generated method stub
		departementRepository.delete(object);
	}

	@Override
	public Departement findById(int id) {
		// TODO Auto-generated method stub
		return departementRepository.findById(id);
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}

	@Override
	public Departement update(Departement p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
