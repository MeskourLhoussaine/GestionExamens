package ma.projet.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.beans.entities.Fraude;

public interface FraudeRepository extends JpaRepository <Fraude,Integer> {
  public Fraude findById(int id);
}
