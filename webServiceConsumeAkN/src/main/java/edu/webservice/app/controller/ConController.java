package edu.webservice.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import edu.webservice.app.model.Student;
import edu.webservice.app.servicei.StudentServiceI;

@RestController
public class ConController 
{
	@Autowired
	RestTemplate rt;	//reference variable is method name from main class
	
	@Autowired
	StudentServiceI ssi;

	@GetMapping("/getAllStuData/{address}/{subject}")
	public List<Student> getAllData(@PathVariable String address, @PathVariable String subject)
	{
		String url="http://localhost:9095/getAllData"+address+subject;
		
		List<Student> al=rt.getForObject(url, List.class);
		
		return al;
	}
	
//	@PostMapping("/addstuDataCon")
//	public String saveData(@RequestBody Student s)
//	{
//		
//		Student st=ssi.saveStudentData(s);
//		
//		String url= "http://localhost:9090/addStuData";
//		
//		String msg=rt.postForObject(url, st, String.class);
//		
//		return "ok";
//	}
	
	@PostMapping("/addStuDataCon")
	public Student saveData(@RequestBody Student s)
	{
		ssi.saveStudentData(s);
		
		//String url= "http://localhost:9090/addStuData";	//produce Akurdi
		
		String url1="http://localhost:9095/addStuData";	//produce Karvenagar
		
			Student st1=	rt.postForObject(url1, s, Student.class);

	//	Student st=rt.postForObject(url, s, Student.class);
		
		return st1;
		
	}
	
}
