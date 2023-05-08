package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projet.beans.iservice.IModule;
import ma.projet.beans.repository.ModuleRepository;
@Service
@Transactional
@AllArgsConstructor
public class ModuleService implements IModule{
    private ModuleRepository moduleRepository;
	@Override
	public Module save(Module object) {
		// TODO Auto-generated method stub
		return moduleRepository.save(object);
	}

	@Override
	public void delete(Module object) {
		// TODO Auto-generated method stub
		moduleRepository.delete(object);
	}

	@Override
	public Module findById(int id) {
		// TODO Auto-generated method stub
		return moduleRepository.findById(id);
	}

	@Override
	public List<Module> findAll() {
		// TODO Auto-generated method stub
		return moduleRepository.findAll();
	}

	@Override
	public Module update(Module p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
