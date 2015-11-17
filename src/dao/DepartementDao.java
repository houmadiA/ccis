package dao;

import java.util.List;

import model.Departement;

public interface DepartementDao {
	public void add(Departement departement);

	public void delete(Integer id);

	public Departement getById(Integer id);

	public void update(Departement departement);

	public List<Departement> getAll();
}
