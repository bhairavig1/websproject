package edu.webservice.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.webservice.app.model.Student;
import edu.webservice.app.repository.StudentRepository;
import edu.webservice.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentRepository sri;
	
	@Override
	public Student saveStudentData(Student s)
	{
		Student st=sri.save(s);
		
			return st;
	}

	
	
}
