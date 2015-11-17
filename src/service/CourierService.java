package service;

import java.util.List;

import model.Courier;

public interface CourierService {
	public void add(Courier courier);

	public void delete(Integer id);

	public Courier getById(Integer id);

	public void update(Courier courier);

	public List<Courier> getAll();
}
