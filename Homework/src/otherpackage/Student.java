package otherpackage;
import java.util.Scanner;
public class Student extends Person{
	Scanner input = new Scanner(System.in);
	 final String status;
	public Student(){
		System.out.println("Please enter freshman, sophomore, junior or senior");
		status = input.nextLine();
		}
	public String toString(){
		return "This class name Student"+
				"\nMy status on student is : "+status+
				"\nMy firstname is : "+firstName+
				"\nMy lastname is : "+lastName+
				"\nMy address is : "+address+
				"\nMy number is : "+number+
				"\nMy email is : "+email;
	}
}