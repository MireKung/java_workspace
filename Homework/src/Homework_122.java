import java.util.*;
public class Homework_122 {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		/*int [] employee = {240,236,238,232,240};
			for(int i =0;i<employee.length;i++){
				employee [i] *= 50;
				System.out.println("salary of person "+(i+1)+" = "+employee [i]);
			}
		*/   //ข้อ1
		
		/*int [] stud = new int [10];
		int x =0;
		int y = 0;
		int z=0;
			for(int i = 0;i<stud.length;i++){
				System.out.println("Please enter point for stud number"+(i+1));
				stud [i] = input.nextInt();}
			for(int i =0;i<stud.length;i++){	
			System.out.println("stud num"+(i+1)+" = "+stud[i]);
			}
			for(int i =0;i<stud.length;i++){
				if(stud[i]>=x){
				x = stud[i];
				}else 
					continue;
			}
			for(int i=0;i<stud.length;i++){
				y=stud[0];
				if(stud[i]<=y)
					y = stud[i];
					else
						continue;
			}
			for(int i =0;i<stud.length;i++){
				z += stud[i];
			}
			System.out.println("hightest point is "+x);
			System.out.println("lowest point is "+y);
			System.out.println("avg point is "+(z/stud.length));
		*/ //ข้อ2
	
		int [][] x = new int [3][3];
		int [][] y = new int [3][3];
		
		int [][] z = addMatrix(x,y);
		System.out.println();
	}
	public static int [] [] addMatrix(int [][] a, int [][] b){
			int [][]c = new int [3][3];
			for(int i=0;i<c.length;i++)
				for(int j=0;j<c[i].length;j++){
					c[i][j]= a[i][j]+b[i][j];
					System.out.println("c ["+i+"] ["+j+"] = "+c[i][j]);
				}
				
	return c;
	}

}

