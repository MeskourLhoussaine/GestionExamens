package ma.projet.beans.service;

import java.util.List;

import ma.projet.beans.entities.PasserExamen;
import ma.projet.beans.iservice.IPasserExamen;
import ma.projet.beans.repository.PasserExamenRepository;
import ma.projet.beans.repository.PvExamenRepository;

public class PasseExamenService implements IPasserExamen {
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

}
