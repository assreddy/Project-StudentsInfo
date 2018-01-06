package com.google.school.controllers;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.google.school.model.*;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 */

@Transactional
public interface StudentRepository extends CrudRepository<Student, Integer> {
	/**
	 * Return the user having the passed email or null if no user is found
	 */

	public Student findByRollNo(int  rollNo);
}
