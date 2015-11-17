package service;

import java.util.List;

import dao.RecepteurDao;
import model.Recepteur;

public class RecepteurServiceImpl implements RecepteurService {

	// DI via spring
	private RecepteurDao recepteurDao;

	@Override
	public void add(Recepteur recepteur) {
		recepteurDao.add(recepteur);

	}

	@Override
	public void delete(Integer id) {
		recepteurDao.delete(id);

	}

	@Override
	public Recepteur getById(Integer id) {
		return recepteurDao.getById(id);
	}

	@Override
	public void update(Recepteur recepteur) {
		recepteurDao.update(recepteur);

	}

	@Override
	public List<Recepteur> getAll() {
		return recepteurDao.getAll();
	}

	public RecepteurDao getRecepteurDao() {
		return recepteurDao;
	}

	public void setRecepteurDao(RecepteurDao recepteurDao) {
		this.recepteurDao = recepteurDao;
	}

}
