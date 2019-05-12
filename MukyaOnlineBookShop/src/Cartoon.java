
public class Cartoon extends Book {	
	public String characterName;
public Cartoon(double regularPrice, String publisher,
		int yearPublished, String charcterName) {
	super(regularPrice,null,publisher,yearPublished);
	this.characterName=characterName;
}
public double compitealePrice(){
	return (super.getRegularPrice()*0.4);
}
public String characterName(){
	return characterName;
	}}