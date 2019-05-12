package cpe.Mukya;
import java.util.*;
import java.*;
public class hashtable2 {
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;

	public static void main(String[] args) {

		hashtable2 theFunc = new hashtable2(61);

	
		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		
		
		
		theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

		theFunc.findKey("660");

		theFunc.displayTheStack();

	}
	
	

	

	public void hashFunction2(String[] stringsForArray, String[] theArray) {

		for (int n = 0; n < stringsForArray.length; n++) {

			String newElementVal = stringsForArray[n];

			
			int arrayIndex = Integer.parseInt(newElementVal) % arraySize;
			
			int stepDistance =  7-(Integer.parseInt(newElementVal)%7);
			
			System.out.println("Modulus Index= " + arrayIndex + " for value "
					+ newElementVal);

			while (theArray[arrayIndex] != "-1") {

				arrayIndex+=stepDistance;

				System.out.println("Collision Try " + arrayIndex + " Instead");


				arrayIndex %= arraySize;

			}

			theArray[arrayIndex] = newElementVal;

		}

	}

	public String findKey(String key) {

		int arrayIndexHash = Integer.parseInt(key) % arraySize;

		int stepDistance =  7-(Integer.parseInt(key)%7);
		
		while (theArray[arrayIndexHash] != "-1") {

			if (theArray[arrayIndexHash] == key) {

				System.out.println(key + " was found in index "
						+ arrayIndexHash);

				return theArray[arrayIndexHash];

			}
			arrayIndexHash+=stepDistance;
			arrayIndexHash %= arraySize;
		}
		return null;
	}

	hashtable2(int size) {

		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}

	public void displayTheStack() {

		int increment = 0;

		int numberOfRows = (arraySize / 10) + 1;

		for (int m = 0; m < numberOfRows; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (n >= arraySize)
					System.out.print("|      ");

				else if (theArray[n].equals("-1"))
					System.out.print("|      ");

				else
					System.out
							.print(String.format("| %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

		}

	}}
