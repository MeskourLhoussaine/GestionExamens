package ma.projet.beans.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "passerExamens")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class PasserExamen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date dateDebut;
    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date dateFin;
    @ManyToOne
    @JsonIgnore
    private Etudiant etudiant;
    @OneToOne
    @JoinColumn(name = "examen_id", referencedColumnName = "id")
    private Examen examen;




}
