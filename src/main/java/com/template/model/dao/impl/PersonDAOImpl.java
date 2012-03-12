package com.template.model.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.template.model.dao.CustomHibernateDaoSupport;
import com.template.model.dao.PersonDAO;
import com.template.model.domain.Person;

@Repository("personDAO")
public class PersonDAOImpl extends CustomHibernateDaoSupport implements
		PersonDAO {

	public void save(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(person);
	}

	public void update(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(person);
	}

	public void delete(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(person);
	}

	public Person findById(Integer id) {
		// TODO Auto-generated method stub
		List list =  getHibernateTemplate().find(
				"from Person where id=?", id);
		return (list.size() > 1 ?(Person)list.get(0) : null );
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find(
				"from Person");
	}

}
