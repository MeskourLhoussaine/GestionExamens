package ma.projet.beans.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "etudiants")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)

public class Etudiant extends User{
	@Column(nullable = false, length = 25,unique = true)
	private int Num_Apo;
	@Column(nullable = false, length = 25,unique = true)
	private String Cne;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date date;
	@ManyToOne
	@JsonIgnore
	private Filiere filiere;
	@ManyToOne
	@JsonIgnore
	private Fraude fraude;
	@OneToMany(mappedBy = "etudiant")
	@JsonIgnore
	private List<PvExamen>pvExamen;





}
