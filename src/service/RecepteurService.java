package service;

import java.util.List;

import model.Recepteur;

public interface RecepteurService {
	public void add(Recepteur recepteur);

	public void delete(Integer id);

	public Recepteur getById(Integer id);

	public void update(Recepteur recepteur);

	public List<Recepteur> getAll();
}
