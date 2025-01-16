package edu.webservice.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.webservice.app.model.Student;
import edu.webservice.app.repository.StudentRepository;
import edu.webservice.app.servicei.StudentServiceI;

@Service
public class StudentServiceimpl implements StudentServiceI
{
	@Autowired
	StudentRepository sri;

	@Override
	public Student addAllStuData(Student s) 
	{
		Student st=sri.save(s);
		
		return st;
	}

	@Override
	public List<Student> getAllStuData(String subject,String address) 
	{
		List<Student> al=sri.findAllBySubjectAndAddress(subject,address);
			
		return al;
		
	}

}
