package edu.webservice.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.webservice.app.model.StudentData;

@Repository
public interface StudentRepository extends CrudRepository<StudentData, Integer>
{

	public Iterable findAllBySubjectAndAddress(String subject,String address);

}
