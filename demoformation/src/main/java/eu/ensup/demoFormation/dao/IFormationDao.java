package eu.ensup.demoFormation.dao;

import java.util.List;

import eu.ensup.demoFormation.domaine.Formation;

public interface IFormationDao {

	// CRUD

	public boolean create(Formation pFormation);

	public Formation read(long idFormation);

	public List<Formation> getAll();

	public Formation update(Formation pFormation, long idFormation);

	public boolean delete(long idFormation);
}
