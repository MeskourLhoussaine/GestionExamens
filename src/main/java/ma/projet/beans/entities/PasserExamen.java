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
@Table(name = "passerExamens")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class PasserExamen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateFin;
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Etudiant>etudiants;
    @OneToOne
    @JoinColumn(name = "examen_id", referencedColumnName = "id")
    private Examen examen;




}
