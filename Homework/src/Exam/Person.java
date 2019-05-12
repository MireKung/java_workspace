package Exam;

public abstract class Person {
	private String name;
	private int age;
	private String occupation;
	
	protected Person(){	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAge(){
		return "Please enter your age";
	}
	public abstract String getOccupation(); //abstact can't do method describe
}
