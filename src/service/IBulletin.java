package service;

import java.util.List;

import domaine.Bulletin;
import domaine.Eleve;

public interface IBulletin {

	List<Bulletin> listeBulletin() ;
	void creerBulletin(Bulletin bulletin);
	void supprimerBulletin(Bulletin bulletin);
	void modifierBulletin(Bulletin bulletin);
	Bulletin getBulletinById(int id);
	Bulletin getBulletinByEleve(String matricule);
}
