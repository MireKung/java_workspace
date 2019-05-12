
public class Homework_223 {
	public static void main (String[]args){
		int z = 1000;
		int y = revOrder (z);
	}
	public static int revOrder (int x){
		int x1 = (x%10000)/1000, x2 = (x%1000)/100, x3 = (x%100)/10
	, x4 = x%10;	
		System.out.print((x4)+""+(x3)+(x2)+(x1));
	return x;
		
	}
}
