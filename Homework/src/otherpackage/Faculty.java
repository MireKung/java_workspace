package otherpackage;

public class Faculty extends Employee{
	String workTime,jobs,position;
	
	Faculty(){}
	Faculty(String workTime,String jobs,String position){
		this.workTime=workTime;
		this.jobs=jobs;
		this.position=position;
	}
	public String toString(){
		return "This class name Faculty"+
				"\nMy work time is on : "+workTime+
				"\nMy jobs is : "+jobs+
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