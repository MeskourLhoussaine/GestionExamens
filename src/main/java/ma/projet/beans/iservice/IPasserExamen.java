package ma.projet.beans.iservice;

import ma.projet.beans.entities.Examen;
import ma.projet.beans.entities.PasserExamen;
import ma.projet.beans.idao.IDao;

import java.util.List;

public interface IPasserExamen extends IDao<PasserExamen> {
    List<PasserExamen> findByExamen(Examen exam);
}
