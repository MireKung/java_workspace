import java.util.Scanner;
public class Homework199 {
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int y = 0;
		String me = "";
		
		for(int p=0;p<5;p++)	{
		System.out.println("Press any number between 1-20");
		y = input.nextInt();
			for(int i=0;i<y;i++){
				System.out.print("*");
				me += "*";
			}
			System.out.print("\n");
			me+="\n";
		
	}	
		
		System.out.println("\n"+me);
	}
	
}