package service;

import java.util.List;

import model.Distinataire;
import dao.DistinataireDao;

public class DistinataireServiceImpl implements DistinataireService {

	//DI via spring
	private DistinataireDao distinataireDao;

	@Override
	public void add(Distinataire distinataire) {
		distinataireDao.add(distinataire);

	}

	@Override
	public void delete(Integer id) {
		distinataireDao.delete(id);

	}

	@Override
	public Distinataire getById(Integer id) {
		return distinataireDao.getById(id);
	}

	@Override
	public void update(Distinataire distinataire) {
		distinataireDao.update(distinataire);

	}

	@Override
	public List<Distinataire> getAll() {
		return distinataireDao.getAll();
	}

	public DistinataireDao getDistinataireDao() {
		return distinataireDao;
	}

	public void setDistinataireDao(DistinataireDao distinataireDao) {
		this.distinataireDao = distinataireDao;
	}

}
