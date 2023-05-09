package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.entities.Semester;
import ma.projet.beans.iservice.ISemester;
import ma.projet.beans.repository.SemesterRepository;
@Service
@Transactional
@AllArgsConstructor
public class SemesterService implements ISemester {
   private SemesterRepository semesterRepository;
	@Override
	public Semester save(Semester object) {
		// TODO Auto-generated method stub
		return semesterRepository.save(object);
	}

	@Override
	public void delete(Semester object) {
		// TODO Auto-generated method stub
		semesterRepository.delete(object);
	}

	@Override
	public Semester findById(int id) {
		// TODO Auto-generated method stub
		return semesterRepository.findById(id);
	}

	@Override
	public List<Semester> findAll() {
		// TODO Auto-generated method stub
		return semesterRepository.findAll();
	}

	@Override
	public Semester update(Semester p) {
		// TODO Auto-generated method stub
		return this.semesterRepository.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.semesterRepository.deleteById(id);
		
	}

}
