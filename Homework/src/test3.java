import java.util.Scanner;
public class test3 {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int x,y,z,tempmax=0,temp=0;
		System.out.println("Please enter first number");
		x =input.nextInt();
		System.out.println("Please enter second number");
		y =input.nextInt();
		System.out.println("Please enter third number");
		z =input.nextInt();
		int []a = {x,y,z};
		for(int i =0;i<a.length;i++){
			for(int j =0;j<a.length;j++){
			if(a[i]>a[j]){
				tempmax=a[i];
			}
			}
			}
		for(int i=0 ;i<a.length;i++){
			if(tempmax==a[i]){
				temp++;
			}
		}
	if(temp<=1){
		System.out.println(tempmax);
	}else{
		System.out.println("assadsadsadas");
	}
		}		
			}
