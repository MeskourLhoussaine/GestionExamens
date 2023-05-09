package ma.projet.beans.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Examen;
import ma.projet.beans.iservice.IExamen;
import ma.projet.beans.repository.ExamenRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
public class ExamenService implements IExamen {
private ExamenRepository examenRepository;
    @Override
    public Examen save(Examen object) {
        return this.examenRepository.save(object);
    }

    @Override
    public void delete(Examen object) {
   this.examenRepository.delete(object);
    }

    @Override
    public Examen findById(int id) {
        return this.examenRepository.findById(id);
    }

    @Override
    public List<Examen> findAll() {
        return this.examenRepository.findAll();
    }

	@Override
	public Examen update(Examen p) {
		// TODO Auto-generated method stub
		return this.examenRepository.save(p);
	}

	@Override
	public void delete(int id) {
		this.examenRepository.deleteById(id);
		
	}
}
