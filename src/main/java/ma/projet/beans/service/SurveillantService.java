package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Surveillant;
import ma.projet.beans.iservice.ISurveillant;
import ma.projet.beans.repository.SurveillantRepository;
@Service
@Transactional
@AllArgsConstructor
public class SurveillantService implements ISurveillant {
   private SurveillantRepository surveillantRepository;
	@Override
	public Surveillant save(Surveillant object) {
		// TODO Auto-generated method stub
		return this.surveillantRepository.save(object);
	}

	@Override
	public void delete(Surveillant object) {
		// TODO Auto-generated method stub
		this.surveillantRepository.delete(object);
	}

	@Override
	public Surveillant findById(int id) {
		// TODO Auto-generated method stub
		return this.surveillantRepository.findById(id);
	}

	@Override
	public List<Surveillant> findAll() {
		// TODO Auto-generated method stub
		return this.surveillantRepository.findAll();
	}

	@Override
	public Surveillant update(Surveillant p) {
		// TODO Auto-generated method stub
		return this.surveillantRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.surveillantRepository.deleteById(id);
		
	}

}
