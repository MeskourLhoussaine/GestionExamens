package ma.projet.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.projet.beans.entities.User;
import ma.projet.beans.iservice.IUser;
import ma.projet.beans.repository.UserRepository;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor


public class UserService implements IUser{
     private UserRepository userRepository;
	@Override
	public User save(User object) {
		// TODO Auto-generated method stub
		return userRepository.save(object);
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		userRepository.delete(object);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User update(User p) {
		// TODO Auto-generated method stub
		return this.userRepository.save(p);
	}

	@Override
	public void delete(int id) {
		this.userRepository.deleteById(id);
		
	}

}
