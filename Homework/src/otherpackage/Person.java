package otherpackage;

public class Person {
protected String firstName,lastName,address,number,email;
	
	Person(){}
	Person(String firstName,String lastName,String address,String number,String email){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.number=number;
		this.email=email;
	}
	public String toString(){
		
		return "This class name Person"+
		"\nMy firstname is : "+firstName+
		"\nMy lastname is : "+lastName+
		"\nMy address is : "+address+
		"\nMy number is : "+number+
		"\nMy email is : "+email;
	}
}