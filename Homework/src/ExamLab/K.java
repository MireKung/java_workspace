package ExamLab;

public class K extends J {
	private J value; // J name value
	public K(int x ,int y){
		
		super(x); //put x in value in J class
				  //cause super of K is J class
				//and it's make "Made J : " +x 
		value = new J(y); //just use constructor of J
		//That have system.out.print
		//and so it's become "Made J : "+y
	}
	public static void main(String[]args){
		K k = new K(5,10);
	}
}
/*public class J {
private int value;
public J(int x){
	value =x;
	System.out.println("Made J : "+value);
}
}*/
