package Exam;

public class RoboDog implements Dog,Robot{
	boolean onOff;
	String name;
	int version;
	RoboDog(){}
	RoboDog(String name,int version){
		this.name=name;
		this.version=version;
	}
	public void statusOnOff() {
		System.out.println(onOff);
	}
	public void sayHi() {
		System.out.println("HI I'M DOGGO");
	}
	public void SayBye() {
		System.out.println("Bye");
	}
	public void bark() {
		System.out.println("I'M BARKING HONG HONG");
	}
	public void Run() {
		System.out.println("I'M RUNNINGGGG");
	}

	public void crouch() {
		System.out.println("I'M CROUCHING YOU CAN'T SEE ME HEEHEE");	
	}
}