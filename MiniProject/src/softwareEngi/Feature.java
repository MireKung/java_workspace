package softwareEngi;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import softwareEngi.useCase;
public class Feature {
	public static void main(String[]args) {
		useCase a = new useCase("of Squence Diagram","14404"); //example of the program
		Scanner input = new Scanner(System.in);
		System.out.println("SoftwareEngineer final project test by Mukya 5907101012");
		char ch= ' ';
		 
		do{  //make the program repeatable with do while loop
			String n1 = JOptionPane.showInputDialog("กรุณาเลือกสิ่งที่ต้องการจะทำ"+
													"\n 1 : บันทึก  \n 2: ค้นคืน");
			int choice = Integer.parseInt(n1);
			
		if(choice==1) { //add another uml to the program
			
				String n2 = JOptionPane.showInputDialog("กรุณาใส่ชื่อ ความสัมพันธ์ความเกี่ยวข้องทางคุณลักษณะ ");
				String newUml = n2;
				String n3 = JOptionPane.showInputDialog("กรุณาใส่ ดัชนี");
				String newIndex = n3;
				useCase b = new useCase(newUml,newIndex);
		}
		else if(choice==2) {// execute another uml from the program
			String n4 = JOptionPane.showInputDialog("กรุณาใส่คุณลักษณะที่ต้องการค้นคืน");
				JOptionPane.showMessageDialog(null, " "+a.toString());
				}
		else { //wrong input
			String n5 = JOptionPane.showInputDialog("ใส่ตัวเลือกไม่ถูกต้อง");
		}
		String guess = JOptionPane.showInputDialog("\nDo you want to continue ? (y or n)");
		ch= guess.charAt(0);
		  } while (ch == 'Y'|| ch == 'y');    //end of do while loop
}
	}