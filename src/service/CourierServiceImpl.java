package service;

import java.util.List;

import dao.CourierDao;
import model.Courier;

public class CourierServiceImpl implements CourierService {

	// DI via spring
	private CourierDao courierDao;

	@Override
	public void add(Courier courier) {
		courierDao.add(courier);

	}

	@Override
	public void delete(Integer id) {
		courierDao.delete(id);

	}

	@Override
	public Courier getById(Integer id) {
		return courierDao.getById(id);
	}

	@Override
	public void update(Courier courier) {
		courierDao.update(courier);

	}

	@Override
	public List<Courier> getAll() {
		return courierDao.getAll();
	}

	public CourierDao getCourierDao() {
		return courierDao;
	}

	public void setCourierDao(CourierDao courierDao) {
		this.courierDao = courierDao;
	}

}
