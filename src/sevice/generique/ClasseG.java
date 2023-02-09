package sevice.generique;

import java.util.ArrayList;
import java.util.List;

import domaine.Classe;

public class ClasseG implements IMetier<Classe, Integer> {

	List<Classe> listClasse = new ArrayList<>();
	
	@Override
	public List<Classe> liste() {
		// TODO Auto-generated method stub
		return listClasse;
	}

	@Override
	public void creer(Classe o) {
		listClasse.add(o);
		
	}

	@Override
	public void supprimer(Classe o) {
		listClasse.remove(o);
		
	}

	@Override
	public void modifier(Classe o) {
		Classe o2 = getById(o.getId());
		int index = listClasse.indexOf(o2);
		
		listClasse.set(index, o);
		
	}

	@Override
	public Classe getById(Integer id) {
		for(Classe o : listClasse) {
			if(o.getId()== id) {
				return o;
			}
		}
		return null;
	}

}
