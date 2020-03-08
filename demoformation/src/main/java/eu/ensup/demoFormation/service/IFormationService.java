package eu.ensup.demoFormation.service;

import java.util.List;

import eu.ensup.demoFormation.domaine.Formation;

public interface IFormationService {

	public boolean creationFormation(Formation pFormation);

	public Formation lireFormation(long idFormation);

	public List<Formation> lireTouteFormation();

	public Formation modifierFormation(Formation pFormation, long idFormation);

	public boolean supprimerFormation(long idFormation);
}
