package com.template.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.template.model.dao.PersonDAO;
import com.template.model.domain.Person;
import com.template.model.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
	public void save(Person person) {
		// TODO Auto-generated method stub
		personDAO.save(person);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
	public void update(Person person) {
		// TODO Auto-generated method stub
		personDAO.update(person);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
	public void delete(Person person) {
		// TODO Auto-generated method stub
		personDAO.delete(person);
	}

	public Person findById(Integer id) {
		// TODO Auto-generated method stub
		return personDAO.findById(id);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personDAO.findAll();
	}

}
