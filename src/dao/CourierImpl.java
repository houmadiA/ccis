package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import model.Courier;

public class CourierImpl extends HibernateDaoSupport implements CourierDao {

	@Override
	public void add(Courier courier) {
		getHibernateTemplate().save(courier);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(getById(id));
		
	}

	@Override
	public Courier getById(Integer id) {
		return getHibernateTemplate().load(Courier.class, id);
	}

	@Override
	public void update(Courier courier) {
		getHibernateTemplate().update(courier);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Courier> getAll() {
		return (List<Courier>) getHibernateTemplate().find("from Courier");
	}

}
