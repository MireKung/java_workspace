import java.util.Scanner;
public class Homework_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("What do you want to do"
				+ "\nPress 1 to plus number "
				+ "\nPress 2 to minus number"
				+ "\nPress 3 to multiply number"
				+ "\nPress 4 to divide number");
		int x = input.nextInt ();
		if (x==0)
			System.out.println("0 is not in an option mate");
		else if  (x>4)
			System.out.println("PLEASE ENTER ONLY 1 OR 2 OR 3 OR 4 YOU CUNT");
		else		
			System.out.println("Enter your first number");
		double Fn = input.nextDouble();
		System.out.println("Enter you second number");
		double Sn = input.nextDouble();
	
		 if (x==1)
			System.out.println("your answer from "+Fn+" + "+Sn+" is "+(Fn+Sn));
		else if (x==2)
			System.out.println("your answer from "+Fn+" - "+Sn+" is "+(Fn-Sn));
		else if (x==3)
			System.out.println("your answer from "+Fn+" * "+Sn+" is "+(Fn*Sn));
		else if (Sn==0)
			System.out.println("Can't solve "+Fn+" / "+Sn);
		else
			System.out.println("your answer from "+Fn+" / "+Sn+" is "+(Fn/Sn));
		

	}

}
