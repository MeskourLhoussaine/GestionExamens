package ma.projet.beans.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "semesters")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 25)
    private String nom_s;
    @OneToMany(mappedBy = "semester")
    @JsonIgnore
    private List<Module>modules;
   @OneToMany(mappedBy = "semester")
    @JsonIgnore
    private List<Filiere> filieres;

}
