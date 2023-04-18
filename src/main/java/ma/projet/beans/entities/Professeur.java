package ma.projet.beans.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "professeurs")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
//classe profeseurE
public class Professeur extends User{
	@Column(nullable = false, length = 25)
	private String specialite;

	@OneToMany(mappedBy = "professeur")
	@JsonIgnore
	private List<Matiere> matieres;


}
