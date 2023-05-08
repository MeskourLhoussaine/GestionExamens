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
		return this.moduleRepository.save(object);
	}

	@Override
	public void delete(Module object) {
		this.moduleRepository.delete(object);

	}

	@Override
	public Module findById(int id) {
		return this.moduleRepository.findById(id);
	}

	@Override
	public List<Module> findAll() {
		return this.moduleRepository.findAll();
	}

	@Override
	public Module update(Module p) {
		return this.moduleRepository.save(p);
	}

	@Override
	public void delete(int id) {
     this.moduleRepository.deleteById(id);
	}
}
