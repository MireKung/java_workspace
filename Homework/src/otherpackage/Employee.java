package otherpackage;

public class Employee extends Person{
	String compName,salary;
	
	Employee(){}
	Employee(String compName,String salary){
		this.compName=compName;
		this.salary=salary;
	}
public String toString(){
	return "This class name Employee"+
			"\nMy company name is : "+compName+
			"\nMy salary is : "+salary+" per month"+
			"\nMy firstname is : "+firstName+
			"\nMy lastname is : "+lastName+
			"\nMy address is : "+address+
			"\nMy number is : "+number+
			"\nMy email is : "+email;
} ;
	}
