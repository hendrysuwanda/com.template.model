package com.template.model.service;

import java.util.List;

import com.template.model.domain.Person;

public interface PersonService {

	void save(Person person);
	void update(Person person);
	void delete(Person person);
	Person findById(Integer id);
	List<Person> findAll();
}
