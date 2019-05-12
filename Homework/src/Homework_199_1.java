import java.util.Scanner;
public class Homework_199_1 {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int a,n,d;
		System.out.println("enter value of a");
		a = input.nextInt();
		System.out.println("enter value of n");
		 n = input.nextInt();
		 System.out.println("enter value of d");
		 d = input.nextInt();
		 for(int i=1;i<=n;i++){
		 if(i!=n)
		System.out.print((a+((i-1)*d))+",");
		 else
		System.out.print((a+((i-1)*d)));
		 }
}}
