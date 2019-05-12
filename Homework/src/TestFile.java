import java.io.*;
import java.util.*;
public class TestFile {
	public static void main (String [] args) throws IOException{
		File file1 = new File("Pundakung1.txt");
		File file2 = new File("Pundakung2.txt");
		Scanner input = new Scanner(file1);
		PrintWriter write = new PrintWriter(file2);
		int i = 0;
		
		while(input.hasNext()==true){
		System.out.println(input.nextLine().toUpperCase());
		}
		write.close();
		
	}
}
