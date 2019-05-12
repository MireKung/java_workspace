package fkingdiscretemathproject;
import javax.swing.JOptionPane;

public class test123 {
	public static void main(String[]args) {

		int yak1=0;
		int yak2=0;
		int yak3=0;
		int yak4=0;
		int yak5=0;
		
		int mathRandom = (int)(1+(Math.random()*100));
		int mathRandom2 = (int)(1+(Math.random()*100));
		int mathRandom3 = (int)(1+(Math.random()*100));
		int mathRandom4 = (int)(1+(Math.random()*100));
		int mathRandom5 = (int)(1+(Math.random()*100));
		int mathRandom6 = (int)(1+(Math.random()*100));

		yak1 = mathRandom;
		yak2 = -yak1;
		yak3 = yak2-mathRandom2;
		yak4 = yak3-mathRandom3;
		yak5 = yak4-mathRandom4;
				

		char ch= ' ';
	
		while(true){

			String Word=JOptionPane.showInputDialog("traffic light 5 Yak operation"+
			"\n\"Press 1  to see 5 yak normal state\""+
			"\n\"Press 2  to See state after first light = 0\""+
			"\n\"Press 3  to see busy hour\"");			
			int choice = Integer.parseInt(Word);
			
			
			if(choice== 1) {
				
				String Word1 = JOptionPane.showInputDialog("Time on greenlight is random between 1-100 second"
				+"\n Yak 1 : "+yak1+"  second (green light)"
				+"\n Yak 2 : "+yak2+"  second (red light)"
				+"\n Yak 2 : will green for "+mathRandom2+"  second"
				+"\n Yak 3 : "+yak3+"  second (red light)"
				+"\n Yak 3 : will green for"+mathRandom3+"  second"
				+"\n Yak 4 : "+yak4+"  second (red light)"
				+"\n Yak 4 : will green for"+mathRandom4+"  second"
				+"\n Yak 5 : "+yak5+"  second (red light)"
				+"\n Yak 5 : will green for"+mathRandom5+"  second");
				
			}
			else if(choice ==2) {
				
				yak2= mathRandom2;
				yak3= -yak2;
				yak4= yak3-mathRandom3;
				yak5= yak4-mathRandom4;
				yak1 = yak5-mathRandom5;
				

				String Word2_2 = JOptionPane.showInputDialog("after yak 1 = 0 yak 2 will get green light"
						+"\n Yak 1 : "+yak1+"  second (red light)"
						+"\n Yak 1 : will green for"+mathRandom6+"  second"
						+"\n Yak 2 : "+yak2+"  second (green light)"
						+"\n Yak 3 : "+yak3+"  second (red light)"
						+"\n Yak 3 : will green for"+mathRandom3+"  second"
						+"\n Yak 4 : "+yak4+"  second (red light)"
						+"\n Yak 4 : will green for"+mathRandom4+"  second"
						+"\n Yak 5 : "+yak5+"  second (red light)"
						+"\n Yak 5 : will green for"+mathRandom5+"  second");
				
			}
			else if(choice==3) {
				
				int mathRandom7 = (int)(1+(Math.random()*40));
				
				
				String Word3 = JOptionPane.showInputDialog("Choose yak that gonna greenlight (1-5)");
				
				int  randomstate=Integer.parseInt(Word3);
				
				switch(randomstate) {
				case 1 : 
					String Word3_1 = JOptionPane.showInputDialog("you Choose 1 so yak 1 gonna get greenlight randomly between 1-40 second"
							+ "\n Yak 1 :"+mathRandom7+" is now green light"
							+ "\n Yak 2 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 3 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 4 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 5 : "+(-mathRandom7)+" is now red light");
					break;
				case 2 :
					String Word3_2 = JOptionPane.showInputDialog("you Choose 2 so yak 2 gonna get greenlight randomly between 1-40 second"
							+ "\n Yak 1 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 2 :"+(mathRandom7)+" is now green light"
							+ "\n Yak 3 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 4 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 5 :"+(-mathRandom7)+" is now red light");
					break;
				case 3 :
					String Word3_3 = JOptionPane.showInputDialog("you Choose 3 so yak 3 gonna get greenlight randomly between 1-40 second"
							+ "\n Yak 1 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 2 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 3 :"+(mathRandom7)+" is now green light"
							+ "\n Yak 4 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 5 :"+(-mathRandom7)+" is now red light");
					break;
				case 4 :
					String Word3_4 = JOptionPane.showInputDialog("you Choose 4 so yak 4 gonna get greenlight randomly between 1-40 second"
							+ "\n Yak 1 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 2 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 3 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 4 :"+(mathRandom7)+" is now  green light"
							+ "\n Yak 5 :"+(-mathRandom7)+" is now red light");
					break;
				case 5 :
					String Word3_5 = JOptionPane.showInputDialog("you Choose 5 so yak 5 gonna get greenlight randomly between 1-40 second second"
							+ "\n Yak 1 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 2 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 3 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 4 :"+(-mathRandom7)+" is now red light"
							+ "\n Yak 5 :"+(mathRandom7)+" is now   green light");
				}
				}
			
			
			String Word2=JOptionPane.showInputDialog("Continue ? (yes or no)");	
			
			ch= Word2.charAt(0);
				if(ch=='n'||ch=='N') {
					break;
				}
			  }  
	}
}
