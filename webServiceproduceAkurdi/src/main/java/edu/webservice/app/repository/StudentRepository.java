package edu.webservice.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.webservice.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{


	public List<Student> findAllBySubjectAndAddress(String subject,String address);

}
