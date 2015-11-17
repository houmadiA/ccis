package dao;

import java.util.List;

import model.Distinataire;

public interface DistinataireDao {
	public void add(Distinataire distinataire);

	public void delete(Integer id);

	public Distinataire getById(Integer id);

	public void update(Distinataire distinataire);

	public List<Distinataire> getAll();
}
