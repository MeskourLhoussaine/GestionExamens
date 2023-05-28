package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.Salle;
import ma.projet.beans.iservice.ISalle;
import ma.projet.beans.repository.SalleRepository;
@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor

public class SalleService  implements ISalle{
    private SalleRepository salleRepository;
	@Override
	public Salle save(Salle object) {
		// TODO Auto-generated method stub
		return salleRepository.save(null);
	}

	@Override
	public void delete(Salle object) {
		// TODO Auto-generated method stub
		salleRepository.delete(object);
	}

	@Override
	public Salle findById(int id) {
		// TODO Auto-generated method stub
		return salleRepository.findById(id);
	}

	@Override
	public List<Salle> findAll() {
		// TODO Auto-generated method stub
		return salleRepository.findAll();
	}

	@Override
	public List<Salle> findSalleByType(String type) {
		// TODO Auto-generated method stub
		return salleRepository.findSalleByType(type);
	}

	@Override
	public Salle update(Salle p) {
		// TODO Auto-generated method stub
		return this.salleRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.salleRepository.deleteById(id);
		
	}

}
