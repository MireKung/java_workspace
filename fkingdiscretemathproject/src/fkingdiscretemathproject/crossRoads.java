package fkingdiscretemathproject;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 */
import java.util.*;
import javax.swing.JOptionPane;

public class crossRoads {
	
	public static int random60 (){
		double randomdouble = 1+(Math.random()*60);
		int x=(int)randomdouble;
		return x;
	}
	
	public static void main(String[]args) {
        
		int r6=0,r7=0,r8=0,r9=0,r10=0;		

		int ranInt = random60();
		int ranInt2 = random60(); 
		int ranInt3 = random60();
		int ranInt4 = random60();
		int ranInt5 = random60();
		int ranInt6 = random60();

		
		
		r6= ranInt;
		r7 = -r6;
		r8 = r7-ranInt2;
		r9 = r8-ranInt3;
		r10 = r9-ranInt4;
				
		
		Scanner input = new Scanner(System.in);
		char ch= ' ';
	
		do{

			String msg=JOptionPane.showInputDialog("five-way intersection operation"+
			"\n\"1 : See the normal State of five-way intersection operation\""+
			"\n\"2 : See the next State of the 1 :  (after first intersection become 0)\""+
			"\n\"3 : See the Busy hours(when everything become random)\"");			
			int choice = Integer.parseInt(msg);
			
			if(choice==1||choice==2||choice==3) {
			
			switch(choice) {
			
			case 1 : 
				String msgc1 = JOptionPane.showInputDialog("The waiting time is random so it could be anything between 1-60(or more) so i just random it"
				+"\n**NOTICE** this is a simple case just show how five-way intersection really work"
				+"\n 1: intersection is now at "+r6+" second left before comes to red light  -->(now at green light)"
				+"\n 2: intersection is now at "+r7+" second -->(redlight)wait untill first intersection comes to red (r1=0)"
				+"\n !!And it's gonna be greenlight for "+ranInt2+"second"
				+"\n 3: intersection is now at "+r8+" second -->(redlight)wait untill second intersection comes to red(r2=0)"
				+"\n !!And it's gonna be greenlight for "+ranInt3+"second"
				+"\n 4: intersection is now at "+r9+" second -->(redlight)wait untill third intersection comes to red(r3=0)"
				+"\n !!And it's gonna be greenlight for "+ranInt4+"second"
				+"\n 5: intersection is now at "+r10+" second -->(redlight)wait untill forth intersection comes to red(r4=0)"
				+"\n !!And it's gonna be greenlight for "+ranInt5+"second"
				+"\n **Press any button to return to Menu");
				break;
				
			case 2 :
				
				r7= ranInt2;
				r8= -r7;
				r9= r8-ranInt3;
				r10 = r9-ranInt4;
				r6 = r10-ranInt5;
				
				String msgc2 = JOptionPane.showInputDialog("After first intersection become 0 2 intersection will be greenlight"
						+ "\n and first intersection will = last intersection + the greenlight time of the last intersection"
						+"\n 2: intersection "+r7+"   second before coming to redlight (now at greenlight)"
						+"\n 3: intersection "+r8+"   second before coming to greelight (now at redlight)"
						+"\n and gonna be greelight for"+ranInt3
						+"\n 4: intersection "+r9+"  second before coming to greelight (now at redlight)"
						+"\n and gonna be greelight for"+ranInt4
						+"\n 5: intersection "+r10+"  second before coming to greelight (now at redlight)"
						+"\n and gonna be greelight for"+ranInt5
						+"\n 1: intersection "+r6+"  second before coming to greelight (now at redlight)");
				break;
				
			case 3 :
				double randomNumber7 = 1+(Math.random()*30);
				double randomNumber8 = 1+(Math.random()*5);
				int ranInt7 = (int)randomNumber7;
				int randomState=(int)randomNumber8;
				String msgc3 = JOptionPane.showInputDialog("busy hours is simply random the intersection "
						+ "that gonna get greenlight \nand other intersection have to wait until the greenlight become 0"
						+ "\nand then random the intersection that gonna be greenlight again");
				
				switch(randomState) {
				case 1 : 
					String msgc31 = JOptionPane.showInputDialog("we're randon and get : "+randomState+" \nso the intersection that gonna be greenlight"
							+ " is 1 : intersection \nthe time is between 1-30 second and also other intersection have to wait"
							+ "\n1 : intersection "+ranInt7+" State : green light"
							+ "\n2 : intersection "+(-ranInt7)+" State : red light"
							+ "\n3 : intersection "+(-ranInt7)+" State : red light"
							+ "\n4 : intersection "+(-ranInt7)+" State : red light"
							+ "\n5 : intersection "+(-ranInt7)+" State : red light");
					break;
				case 2 :
					String msgc32 = JOptionPane.showInputDialog("we're randon and get : "+randomState+" \nso the intersection that gonna be greenlight"
							+ " is 2 : intersection \nthe time is between 1-30 second and also other intersection have to wait"
							+ "\n1 : intersection "+(-ranInt7)+" State : red light"
							+ "\n2 : intersection "+(ranInt7)+" State :   green light"
							+ "\n3 : intersection "+(-ranInt7)+" State : red light"
							+ "\n4 : intersection "+(-ranInt7)+" State : red light"
							+ "\n5 : intersection "+(-ranInt7)+" State : red light");
					break;
				case 3 :
					String msgc33 = JOptionPane.showInputDialog("we're randon and get : "+randomState+" \nso the intersection that gonna be greenlight"
							+ " is 3 : intersection \nthe time is between 1-30 second and also other intersection have to wait"
							+ "\n1 : intersection "+(-ranInt7)+" State : red light"
							+ "\n2 : intersection "+(-ranInt7)+" State :  red light"
							+ "\n3 : intersection "+(ranInt7)+" State :  green light"
							+ "\n4 : intersection "+(-ranInt7)+" State : red light"
							+ "\n5 : intersection "+(-ranInt7)+" State : red light");
					break;
				case 4 :
					String msgc34 = JOptionPane.showInputDialog("we're randon and get : "+randomState+" \nso the intersection that gonna be greenlight"
							+ " is 4 : intersection \nthe time is between 1-30 second and also other intersection have to wait"
							+ "\n1 : intersection "+(-ranInt7)+" State : red light"
							+ "\n2 : intersection "+(-ranInt7)+" State :  red light"
							+ "\n3 : intersection "+(-ranInt7)+" State : red light"
							+ "\n4 : intersection "+(ranInt7)+" State :  green light"
							+ "\n5 : intersection "+(-ranInt7)+" State : red light");
					break;
				case 5 :
					String msgc35 = JOptionPane.showInputDialog("we're randon and get : "+randomState+" \nso the intersection that gonna be greenlight"
							+ " is 5 : intersection \nthe time is between 1-30 second and also other intersection have to wait"
							+ "\n1 : intersection "+(-ranInt7)+" State : red light"
							+ "\n2 : intersection "+(-ranInt7)+" State : red light"
							+ "\n3 : intersection "+(-ranInt7)+" State : red light"
							+ "\n4 : intersection "+(-ranInt7)+" State : red light"
							+ "\n5 : intersection "+(ranInt7)+" State :   green light");
					break;
				}
				break;
			}
			}
			else {
				String msg8=JOptionPane.showInputDialog("Wrong input try again");
			}
				
			
			String msg2=JOptionPane.showInputDialog("Do you want to continue ? (y or n)");	
			
			ch= msg2.charAt(0);
			
			  } while (ch == 'Y'|| ch == 'y');   
	}
}
