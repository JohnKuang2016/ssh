package cn.ssh2.demo.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import cn.ssh2.domain.Car;
import cn.ssh2.utils.BaseHibernateDaoSupport;

@Repository(value = "carDao")
public class CarDaoJdbc extends BaseHibernateDaoSupport implements ICarDao {
	public void save(Car c) {
		getHibernateTemplate().save(c);
	}

	public List<Car> query() {
		List<Car> list = getSessionFactory().getCurrentSession()
				.createCriteria(Car.class).setCacheable(true).list();
		return list;
	}
}
