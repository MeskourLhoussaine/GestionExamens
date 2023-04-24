package ma.projet.beans.iservice;

import ma.projet.beans.entities.Salle;
import ma.projet.beans.idao.IDao;

import java.util.List;

public interface ISalle extends IDao<Salle>{
    List<Salle> findSalleByType(String type);
}
