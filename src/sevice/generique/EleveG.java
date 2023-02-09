package sevice.generique;

import java.util.ArrayList;
import java.util.List;

import domaine.Eleve;

public class EleveG implements IMetier<Eleve, Integer> {

	List<Eleve> listEleve = new ArrayList<>();
	
	@Override
	public List<Eleve> liste() {
		// TODO Auto-generated method stub
		return listEleve;
	}

	@Override
	public void creer(Eleve o) {
		listEleve.add(o);
		
	}

	@Override
	public void supprimer(Eleve o) {
		listEleve.remove(o);
		
	}

	@Override
	public void modifier(Eleve o) {
		Eleve o2 = getById(o.getId());
		int index = listEleve.indexOf(o2);
		
		listEleve.set(index, o);// TODO Auto-generated method stub

		
	}

	@Override
	public Eleve getById(Integer id) {
		for(Eleve o : listEleve) {
			if(o.getId()== id) {
				return o;
			}
		}
		return null;
	}

}
