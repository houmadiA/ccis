package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import model.Service;

public class ServiceImpl extends HibernateDaoSupport implements ServiceDao {

	@Override
	public void add(Service service) {
		getHibernateTemplate().save(service);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(getById(id));
		
	}

	@Override
	public Service getById(Integer id) {
		return getHibernateTemplate().load(Service.class, id);
	}

	@Override
	public void update(Service service) {
		getHibernateTemplate().update(service);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Service> getAll() {
		return (List<Service>) getHibernateTemplate().find("from Service");
	}


}
