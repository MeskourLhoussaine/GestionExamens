package ma.projet.beans.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "surveillants")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
public class Surveillant extends User{

    @ManyToOne
    @JsonIgnore
    private Admin admin;

    @ManyToOne
    @JsonIgnore
    private Salle salle;


}
