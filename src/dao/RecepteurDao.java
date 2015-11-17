package dao;

import java.util.List;

import model.Recepteur;

public interface RecepteurDao {
	public void add(Recepteur recepteur);

	public void delete(Integer id);

	public Recepteur getById(Integer id);

	public void update(Recepteur recepteur);

	public List<Recepteur> getAll();
}
