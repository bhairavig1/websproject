package edu.webservice.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.webservice.app.model.StudentData;
import edu.webservice.app.repository.StudentRepository;
import edu.webservice.appservicei.StudentServicei;

@Service
public class StudentServiceimpl implements StudentServicei
{
	@Autowired
	StudentRepository sri;
	
	@Override
	public StudentData addAllStuData(StudentData s) 
	{
		StudentData sd=sri.save(s);
		
		return sd;
	}

	@Override
	public Iterable getAllStudentData(String subject,String address) 
	{
		Iterable ii=sri.findAllBySubjectAndAddress(subject,address);
		
		return ii;
	}

}
