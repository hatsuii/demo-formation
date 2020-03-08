package eu.ensup.demoFormation.service;

import java.util.List;

import eu.ensup.demoFormation.dao.FormationDao;
import eu.ensup.demoFormation.domaine.Formation;

public class FormationService implements IFormationService {

	private FormationDao formationdao;

	public FormationService() {
		formationdao = new FormationDao();
	}

	public boolean creationFormation(Formation pFormation) {
		return formationdao.create(pFormation);
	}

	public Formation lireFormation(long idFormation) {
		return formationdao.read(idFormation);
	}

	public List<Formation> lireTouteFormation() {

		return formationdao.getAll();
	}

	public Formation modifierFormation(Formation pFormation, long idFormation) {
		return formationdao.update(pFormation, idFormation);
	}

	public boolean supprimerFormation(long idFormation) {
		return formationdao.delete(idFormation);
	}

	public void closeemf() {
		formationdao.closeEM();
	}


}
