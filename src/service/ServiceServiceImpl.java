package service;

import java.util.List;

import dao.ServiceDao;
import model.Service;

public class ServiceServiceImpl implements ServiceService {

	// DI via spring
	private ServiceDao serviceDao;

	@Override
	public void add(Service service) {
		serviceDao.add(service);

	}

	@Override
	public void delete(Integer id) {
		serviceDao.delete(id);

	}

	@Override
	public Service getById(Integer id) {
		return serviceDao.getById(id);
	}

	@Override
	public void update(Service service) {
		serviceDao.update(service);

	}

	@Override
	public List<Service> getAll() {
		return serviceDao.getAll();
	}

	public ServiceDao getServiceDao() {
		return serviceDao;
	}

	public void setServiceDao(ServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}

}
