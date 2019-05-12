public class SquareDemo {
public static void main (String[]args){
	GeometricObject s[] = new GeometricObject[5];
	
	for(int i=0;i<s.length;i++){
	s[i]= new Square();
	((Square) s[i]).howToColor();
	
	int za = 2;
	za+=za+=za+=za;
	System.out.println(za);
	}	}	}