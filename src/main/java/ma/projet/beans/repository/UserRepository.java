package ma.projet.beans.repository;

import ma.projet.beans.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer>{
    public User findById(int id);
}
