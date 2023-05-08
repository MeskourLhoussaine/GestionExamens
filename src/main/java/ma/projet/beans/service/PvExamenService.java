package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Examen;
import ma.projet.beans.entities.PvExamen;
import ma.projet.beans.iservice.IExamen;
import ma.projet.beans.iservice.IPvExamen;
import ma.projet.beans.repository.AdminRepository;
import ma.projet.beans.repository.PvExamenRepository;
@Service
@Transactional
@AllArgsConstructor
public class PvExamenService implements IPvExamen{
     private PvExamenRepository pvExamenRepository;

	@Override
	public PvExamen save(PvExamen object) {
		// TODO Auto-generated method stub
		return pvExamenRepository.save(object);
	}

	@Override
	public void delete(PvExamen object) {
		// TODO Auto-generated method stub
		pvExamenRepository.delete(object);
	}

	@Override
	public PvExamen findById(int id) {
		// TODO Auto-generated method stub
		return pvExamenRepository.findById(id);
	}

	@Override
	public List<PvExamen> findAll() {
		// TODO Auto-generated method stub
		return pvExamenRepository.findAll();
	}
	

	

}