package ma.projet.beans.service;

import java.util.List;

import ma.projet.beans.entities.Fraude;
import ma.projet.beans.iservice.IFraud;
import ma.projet.beans.repository.FraudeRepository;

public class FraudeService implements IFraud{
    private FraudeRepository fraudeRepository;
	@Override
	public Fraude save(Fraude object) {
		// TODO Auto-generated method stub
		return fraudeRepository.save(object);
	}

	@Override
	public void delete(Fraude object) {
		// TODO Auto-generated method stub
		fraudeRepository.delete(object);
	}

	@Override
	public Fraude findById(int id) {
		// TODO Auto-generated method stub
		return fraudeRepository.findById(id);
	}

	@Override
	public List<Fraude> findAll() {
		// TODO Auto-generated method stub
		return fraudeRepository.findAll();
	}

	@Override
	public Fraude update(Fraude p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
