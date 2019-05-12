package cpe.Mukya;

import java.util.Scanner;

public class test {
	public static void main(String[]args){
		

			 Scanner input = new Scanner(System.in);
			 String[][] a = {
					{ "ace", "Very good" },
					{ "act", "Take action" },
					{ "add", "Join (something) to something else" },
					{ "age", "Grow old" },
					{ "ago", "Before the present" },
					{ "aid", "Help, assist, or support" },
					{ "aim", "Point or direct" },
					{ "air", "Invisible gaseous substance" },
					{ "all", "Used to refer to the whole quantity" },
					{ "amp",
							"Unit of measure for the strength of an electrical current" },
					{ "and", "Used to connect words" }, { "ant", "A small insect" },
					{ "any", "Used to refer to one or some of a thing" },
					{ "ape", "A large primate" },
					{ "apt", "Appropriate or suitable in the circumstances" },
					{ "arc", "A part of the circumference of a curve" },
					{ "are", "Unit of measure, equal to 100 square meters" },
					{ "ark", "The ship built by Noah" },
					{ "arm", "Two upper limbs of the human body" },
					{ "art", "Expression or application of human creative skill" },
					{ "ash", "Powdery residue left after the burning" },
					{ "ask", "Say something in order to obtain information" },
					{ "asp", "Small southern European viper" },
					{ "ass", "Hoofed mammal" },
					{ "ate", "To put (food) into the mouth and swallow it" },
					{ "atm", "Unit of pressure" },
					{ "awe", "A feeling of reverential respect" },
					{ "axe", "Edge tool with a heavy bladed head" },
					{ "aye", "An affirmative answer" }};
			
			hashtableword wordHashTable = new hashtableword(31,a);

			


			wordHashTable.displayTheArray();
			

		}
	}