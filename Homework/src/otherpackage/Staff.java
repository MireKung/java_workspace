package otherpackage;

public class Staff extends Employee{
	String position;
	Staff(){}
	Staff(String position){
		this.position=position;
	}
	public String toString(){
		return "This class name Staff"+
				"\nMy position is : "+position+
				"\nMy company name is : "+compName+
				"\nMy salary is : "+salary+" per month"+
				"\nMy firstname is : "+firstName+
				"\nMy lastname is : "+lastName+
				"\nMy address is : "+address+
				"\nMy number is : "+number+
				"\nMy email is : "+email;
	}
}