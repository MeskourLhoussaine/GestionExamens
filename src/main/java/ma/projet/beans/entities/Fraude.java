package ma.projet.beans.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Entity
@Table(name = "fraudes")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Fraude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 25)
    private String type;
    @OneToMany(mappedBy = "fraude")
    @JsonIgnore
    private List<Etudiant> etudiants;
    @ManyToOne
    @JsonIgnore
    private Examen examen;
}
