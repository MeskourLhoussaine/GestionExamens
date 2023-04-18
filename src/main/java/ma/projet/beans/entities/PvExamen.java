package ma.projet.beans.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class PvExamen {
    private int id;
    private String Num_Apo;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;

}
