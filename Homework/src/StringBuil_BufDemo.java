import java.util.*;
public class StringBuil_BufDemo {
	public static void main(String[] args) {
		String str = "Java";
		String str2 = "Java is very easy";
		String str3 = "Welcome to Thailand, the land of smile. Thailand is the best place to visit at the summer season.";
		Scanner input = new Scanner (str2);
			//1
			for(int i=0;i<str.length();i++){
				System.out.println(str.charAt(i));
			}
		System.out.println("**********************************************************");
			//2
			for(int i =0;input.hasNext()==true;i++){
			System.out.println(input.next());
			}
		System.out.println("**********************************************************");
			//3
		System.out.println(str3.replace("Thailand", "THATLAND"));
		System.out.println("**********************************************************");
			//4
		//StringBuffer
		StringBuffer strbuf = new StringBuffer ("BOBOLA");
		
		System.out.println(strbuf.append('C'));
		System.out.println(strbuf.delete(1,2));
		System.out.println(strbuf.capacity());
		System.out.println(strbuf.indexOf("L"));
		System.out.println("**********************************************************");	
		
		//StringBuilder
		
		StringBuilder strbuild = new StringBuilder("Putang ina mo");
		
		System.out.println(strbuild.codePointAt(0)); //Returns the character (Unicode code point) at the specified index.
		System.out.println(strbuild.insert(0,'A'+" "));
		System.out.println(strbuild.length());
		System.out.println(strbuild.reverse()); //Causes this character sequence to be replaced by the reverse of the sequence.
		}}


		
	


