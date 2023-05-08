package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Filiere;
import ma.projet.beans.iservice.IFiliere;
import ma.projet.beans.repository.FilierRepository;
@Service
@Transactional
@AllArgsConstructor
public class FilierService implements IFiliere {
   private FilierRepository filierRepository;
	@Override
	public Filiere save(Filiere object) {
		// TODO Auto-generated method stub
		return filierRepository.save(object);
	}

	@Override
	public void delete(Filiere object) {
		// TODO Auto-generated method stub
		filierRepository.delete(object);
	}

	@Override
	public Filiere findById(int id) {
		// TODO Auto-generated method stub
		return filierRepository.findById(id);
	}

	@Override
	public List<Filiere> findAll() {
		// TODO Auto-generated method stub
		return filierRepository.findAll();
	}

	@Override
	public Filiere update(Filiere p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
