package service;

import java.util.List;

import model.Departement;

public interface DepartementService {
	public void add(Departement departement);

	public void delete(Integer id);

	public Departement getById(Integer id);

	public void update(Departement departement);

	public List<Departement> getAll();
}
