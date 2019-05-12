package Exam;

public class Student extends Person {
private String depName;
private String schName;
public Student(){}
public Student(String dept,String sch){
	depName=dept;
	schName=sch;
}
public String getDept(){
	return depName;
}
public String getSch(){
	return schName;
}
public String getOccupation(){
	return "Please enter your Occupation"; //that's not make sense lol
}
}
