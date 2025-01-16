package edu.webservice.appservicei;

import edu.webservice.app.model.StudentData;

public interface StudentServicei {

	public StudentData addAllStuData(StudentData s);

	public Iterable getAllStudentData(String subject,String address);

}
