package ma.projet.beans.iservice;

import ma.projet.beans.entities.Etudiant;
import ma.projet.beans.idao.IDao;

public interface IEtudiant extends IDao<Etudiant> {
    public Etudiant findEtudiantByNum_Apo(int Num_Apo);
}
