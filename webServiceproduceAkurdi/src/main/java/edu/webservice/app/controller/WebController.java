package edu.webservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.webservice.app.model.Student;
import edu.webservice.app.servicei.StudentServiceI;

@RestController
public class WebController 
{
	@Autowired
	StudentServiceI ssi;
	
	
	@PostMapping("/addStuData")
	public Student addData(@RequestBody Student s)
	{
		System.out.println("addData method in conttroller");
		
		Student st=ssi.addAllStuData(s);
		
			return st;
		
	}
	
	@GetMapping("/getAllStuData/{subject}/{address}")
	public List<Student> getAllData(@PathVariable String subject,@PathVariable String address)
	{
		List<Student> al=ssi.getAllStuData(subject,address);
		
		return al;
		
				//if we use iterable we can only iterate data but cannot store it in database
				//but in List we can iterate as well as store data..
	}
	
	
	
	
}
