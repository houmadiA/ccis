package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import model.Recepteur;

public class RecepteurImpl extends HibernateDaoSupport implements RecepteurDao {

	@Override
	public void add(Recepteur recepteur) {
		getHibernateTemplate().save(recepteur);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(getById(id));
		
	}

	@Override
	public Recepteur getById(Integer id) {
		return getHibernateTemplate().load(Recepteur.class, id);
	}

	@Override
	public void update(Recepteur recepteur) {
		getHibernateTemplate().update(recepteur);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recepteur> getAll() {
		return (List<Recepteur>) getHibernateTemplate().find("from Recepteur");
	}

}
