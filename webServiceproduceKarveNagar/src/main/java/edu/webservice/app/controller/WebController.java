package edu.webservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.webservice.app.model.StudentData;
import edu.webservice.appservicei.StudentServicei;

@RestController
public class WebController 
{


	@Autowired
	StudentServicei ssi;
	
	@PostMapping("/addStuData")
	public StudentData addData(@RequestBody StudentData s)
	{
		System.out.println("addData method in conttroller");
		
		StudentData st=ssi.addAllStuData(s);
		
			return st;
		
	}
	
//	@GetMapping("/getAllStuData/{subject}")
//	public List<StudentData> getAllData(@PathVariable String subject)
//	{
//		List<StudentData> al=ssi.getAllStuData(subject);
//		
//		return al;
//		
//	}
	
	@GetMapping("/getAllData/{subject}/{address}")
	public Iterable getAllData(@PathVariable String subject, @PathVariable String address )
	{
		Iterable ir=ssi.getAllStudentData(subject,address);
		
		return ir;
		
	}
}
