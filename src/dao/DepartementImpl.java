package dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import util.HibernateUtil;
import model.Departement;

public class DepartementImpl extends HibernateDaoSupport implements
		DepartementDao {

	@Override
	public void add(Departement departement) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(departement);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(Integer id) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Departement dep;
		dep = (Departement) session.load(Departement.class, id);
		session.delete(dep);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Departement getById(Integer id) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Departement dep = (Departement) session.load(Departement.class, id);
		session.getTransaction().commit();
		//session.close();
		return dep;
	}

	@Override
	public void update(Departement departement) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.update(departement);
		session.getTransaction().commit();
		session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departement> getAll() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		List<Departement> deps;
		deps = session.createQuery("from Departement").list();
		session.getTransaction().commit();
		//session.close();
		return deps;
	}

}
