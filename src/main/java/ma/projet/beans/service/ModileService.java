package ma.projet.beans.service;

import java.util.List;

import ma.projet.beans.entities.Modile;
import ma.projet.beans.repository.ModileRepository;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.iservice.IModule;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor

public class ModileService implements IModule {

	private ModileRepository modileRepository;

	@Override
	public Modile save(Modile object) {
		return this.modileRepository.save(object);
	}

	@Override
	public void delete(Modile object) {

	}

	@Override
	public Modile findById(int id) {
		return this.modileRepository.findById(id);
	}

	@Override
	public List<Modile> findAll() {
		return this.modileRepository.findAll();
	}

	@Override
	public Modile update(Modile p) {
		return this.modileRepository.save(p);
	}

	@Override
	public void delete(int id) {
		this.modileRepository.deleteById(id);
	}
}
