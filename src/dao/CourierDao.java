package dao;

import java.util.List;

import model.Courier;

public interface CourierDao {
	public void add(Courier courier);

	public void delete(Integer id);

	public Courier getById(Integer id);

	public void update(Courier courier);

	public List<Courier> getAll();
}
