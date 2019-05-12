package testcase;

public class testcase {
	public static void main(String[]args) {
		
		String J="aA";
		String S="aAAAAAAAA";
		
		
	    char[] j = J.toCharArray();
	    char[] s = S.toCharArray();
	    int jewel=0;
	    
	    for (int i = 0; i < J.length(); i++){

	        	
	     if(j[i]==s[i]){
	    	 
	         jewel++;
	     }	       
	   }

	
	    System.out.println(jewel);
	}}
