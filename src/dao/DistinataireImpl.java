package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import model.Distinataire;

public class DistinataireImpl extends HibernateDaoSupport implements DistinataireDao {

	@Override
	public void add(Distinataire distinataire) {
		getHibernateTemplate().save(distinataire);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(getById(id));
		
	}

	@Override
	public Distinataire getById(Integer id) {
		return getHibernateTemplate().load(Distinataire.class, id);
	}

	@Override
	public void update(Distinataire distinataire) {
		getHibernateTemplate().update(distinataire);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distinataire> getAll() {
		return (List<Distinataire>) getHibernateTemplate().find("from Distinataire");
	}


}
