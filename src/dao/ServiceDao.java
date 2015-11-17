package dao;

import java.util.List;

import model.Service;

public interface ServiceDao {
	public void add(Service service);

	public void delete(Integer id);

	public Service getById(Integer id);

	public void update(Service service);

	public List<Service> getAll();
}
