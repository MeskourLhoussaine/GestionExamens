package ma.projet.beans.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 25)
	private String nom;
	@Column(nullable = false, length = 25)
	private String prenom;
	@Column(nullable = false, unique = true, length = 30)
	private String email;
	@Column(nullable = false, length = 25)
	private String password;
	@ManyToOne
	@JsonIgnore
	private Admin admin;

}
