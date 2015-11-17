package service;

import java.util.List;

import dao.DepartementDao;
import model.Departement;

public class DepartementServiceImpl implements DepartementService {

	// DI via spring
	private DepartementDao departementDao;

	@Override
	public void add(Departement departement) {
		departementDao.add(departement);

	}

	@Override
	public void delete(Integer id) {
		departementDao.delete(id);

	}

	@Override
	public Departement getById(Integer id) {
		return departementDao.getById(id);
	}

	@Override
	public void update(Departement departement) {
		departementDao.update(departement);

	}

	@Override
	public List<Departement> getAll() {
		return departementDao.getAll();
	}

	public DepartementDao getDepartementDao() {
		return departementDao;
	}

	public void setDepartementDao(DepartementDao departementDao) {
		this.departementDao = departementDao;
	}

}
