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
			String n1 = JOptionPane.showInputDialog("��س����͡��觷���ͧ��èз�"+
													"\n 1 : �ѹ�֡  \n 2: �鹤׹");
			int choice = Integer.parseInt(n1);
			
		if(choice==1) { //add another uml to the program
			
				String n2 = JOptionPane.showInputDialog("��س������� ��������ѹ���������Ǣ�ͧ�ҧ�س�ѡɳ� ");
				String newUml = n2;
				String n3 = JOptionPane.showInputDialog("��س���� �Ѫ��");
				String newIndex = n3;
				useCase b = new useCase(newUml,newIndex);
		}
		else if(choice==2) {// execute another uml from the program
			String n4 = JOptionPane.showInputDialog("��س����س�ѡɳз���ͧ��ä鹤׹");
				JOptionPane.showMessageDialog(null, " "+a.toString());
				}
		else { //wrong input
			String n5 = JOptionPane.showInputDialog("��������͡���١��ͧ");
		}
		String guess = JOptionPane.showInputDialog("\nDo you want to continue ? (y or n)");
		ch= guess.charAt(0);
		  } while (ch == 'Y'|| ch == 'y');    //end of do while loop
}
	}