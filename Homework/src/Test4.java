import java.util.*;
public class Test4 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int a,b,c,last,check=0;
		System.out.println("Enter First number");
		a=input.nextInt();
		System.out.println("Enter Second number");
		b=input.nextInt();		
		System.out.println("Enter Third number");
		c=input.nextInt();
		int [] x = {a,b,c};
		last=x[0];
		for(int i=0;i<x.length;i++){
			if(last<x[i]){
				last=x[i];
			}
		}
		for(int i=0;i<x.length;i++){
			if(last==x[i]){
				check++;
			}
			
		}
			if(check==1){
		System.out.println(last);
			}else{
			System.out.println("asdsadsadasadasd");
			}
	}
}
