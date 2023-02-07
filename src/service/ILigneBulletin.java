package service;

import java.util.List;

import domaine.Classe;
import domaine.LigneBulletin;

public interface ILigneBulletin {

	List<LigneBulletin> listLigneBulletin();
	void creerLigneBulletin(LigneBulletin ligneBulletin);
	void supprimerLigneBulletin(LigneBulletin ligneBulletin);
	void modifierLigneBulletin(LigneBulletin ligneBulletin);
	LigneBulletin getLigneBulletinById(int id);
}
