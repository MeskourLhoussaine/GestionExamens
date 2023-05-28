package ma.projet.beans.service;

import java.util.List;

import ma.projet.beans.entities.Examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.PasserExamen;
import ma.projet.beans.iservice.IPasserExamen;
import ma.projet.beans.repository.PasserExamenRepository;

@Service


public class PasseExamenService implements IPasserExamen {
	@Autowired
    private PasserExamenRepository passerExamenRepository;
	@Override
	public PasserExamen save(PasserExamen object) {
		// TODO Auto-generated method stub
		return passerExamenRepository.save(object);
	}

	@Override
	public void delete(PasserExamen object) {
		// TODO Auto-generated method stub
		passerExamenRepository.delete(object);
	}

	@Override
	public PasserExamen findById(int id) {
		// TODO Auto-generated method stub
		return passerExamenRepository.findById(id);
	}

	@Override
	public List<PasserExamen> findAll() {
		// TODO Auto-generated method stub
		return passerExamenRepository.findAll();
	}

	@Override
	public PasserExamen update(PasserExamen p) {
		// TODO Auto-generated method stub
		return this.passerExamenRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.passerExamenRepository.deleteById(id);
		
	}


	@Override
	public List<PasserExamen>findByExamen(Examen exam) {
		return this.passerExamenRepository.findByExamen(exam);
	}
}
