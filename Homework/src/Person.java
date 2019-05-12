

public class Person {
	public String name,phone;
	Person(){}
	public Person(String newName){
		name=newName;
	}
	public Person(String newName,String newPhone){
		name=newName;
		phone=newPhone;
	}
	public void printName(){
		System.out.println(name);
	}
	public void printPhone(){
		System.out.println(phone);
	}
}
