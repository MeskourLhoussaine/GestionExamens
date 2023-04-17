package ma.projet.beans.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "etudiants")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Etudiant extends User{
	@Column(nullable = false, length = 25,unique = true)
	private int Num_Apo;
	@Column(nullable = false, length = 25,unique = true)
	private String Cne;
	@Column(nullable = false, length = 25)
	private String filier;
	@Column(nullable = false, length = 25)
	private String semester;
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date date;
	
	
	
}
