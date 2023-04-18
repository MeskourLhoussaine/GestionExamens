package ma.projet.beans.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "examens")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Examen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String nomModule;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date heure;
    private String duree;
	@ManyToOne
	@JsonIgnore
	private Salle salle;
	@OneToMany(mappedBy = "examen")
	@JsonIgnore
	private List<PvExamen>pvExamens;

	@OneToMany(mappedBy = "examen")
	@JsonIgnore
	private List<Fraude> fraudes;
	@OneToOne(mappedBy = "examen",cascade = CascadeType.ALL)
	private PasserExamen passerExamen;



}
