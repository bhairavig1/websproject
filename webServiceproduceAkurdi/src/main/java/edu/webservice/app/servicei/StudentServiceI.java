package edu.webservice.app.servicei;

import java.util.List;

import edu.webservice.app.model.Student;

public interface StudentServiceI {

	public Student addAllStuData(Student s);

	public List<Student> getAllStuData(String subject,String address);

}