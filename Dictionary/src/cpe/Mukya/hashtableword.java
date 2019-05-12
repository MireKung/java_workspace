package cpe.Mukya;
import java.util.*;
public class hashtableword {
	WordList[] theArray;
	int arraySize;
	int itemsInArray = 0;

	
	
	
	public hashtableword(){}
	
	public hashtableword(int size,String[][] dataBaseWord) {

		arraySize = size;

		theArray = new WordList[size];

		// Fill the array with WordLists

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = new WordList();

		}

		addTheArray(dataBaseWord);

	}
	
	public void insert(Word newWord) {

		String wordHash = newWord.word;

		// Calculate the hashkey for the Word

		int hashKey = stringHashFunction(wordHash);

		// Add the new word to the array and set
		// the key for the word

		theArray[hashKey].insert(newWord, hashKey);
	}	
	
	public void addTheArray(String[][] dataBaseWord) {

		for (int i = 0; i < dataBaseWord.length; i++) {

			String word = dataBaseWord[i][0];
			String definition = dataBaseWord[i][1];

			// Create the Word with the word name and
			// definition

			Word newWord = new Word(word, definition);

			// Add the Word to theArray

			insert(newWord);

		}

	}
	public int stringHashFunction(String wordToHash) {

		int hashKeyValue = 0;

		for (int i = 0; i < wordToHash.length(); i++) {

			// 'a' has the character code of 97 so subtract
			// to make our letters start at 1

			int charCode = wordToHash.charAt(i) - 96;

			int hKVTemp = hashKeyValue;

			// Calculate the hash key using the 26 letters
			// plus blank

			hashKeyValue = (hashKeyValue * 27 + charCode) % arraySize;

			

		}
		

		return hashKeyValue;

	}

	public Word find(String wordToFind) {

		// Calculate the hash key for the word

		int hashKey = stringHashFunction(wordToFind);

		// NEW

		Word word = theArray[hashKey].find(hashKey, wordToFind);

		return word;

	}

	public void displayTheArray() {

		for (int i = 0; i < arraySize; i++) {

			System.out.println("\ntheArray Index " + i);

			theArray[i].displayWordList();
		}
	}
}