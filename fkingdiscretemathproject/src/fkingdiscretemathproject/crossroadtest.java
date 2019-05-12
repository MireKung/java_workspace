package fkingdiscretemathproject;
import java.util.*;
public class crossroadtest {
	
	public static int random60 (){
		double randomdouble = 1+(Math.random()*60);
		int x=(int)randomdouble;
		return x;
	}

	public static int random2 (){
		double randomdouble = 1+(Math.random()*2);
		int x=(int)(1+(Math.random()*2));;
		return x;
	}
	
	public static void main(String[]args) {
		
		
		for(int i =0 ; i<10 ; i++) {
		int b= random2();
		int a = random2();
		
		System.out.println(a);
		System.out.println(b);
		}
		
		
	}
}
