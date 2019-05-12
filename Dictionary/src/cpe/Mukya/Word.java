package cpe.Mukya;

public class Word {

	public String word;
	public String definition;
	public int key;

	// Reference to next Word made in the WordList

	public Word next;

	public Word(String word, String definition) {

		this.word = word;
		this.definition = definition;

	}

	public String toString() {

		return word + " mean : " + definition;

	}

}
