
public class ChildernBook extends Book {
	int age;
	ChildernBook(double regularPrice, String publisher , int yearPublished , int age){
	super(regularPrice, null, publisher,yearPublished);
	this.age=age;
}
public double computeSalePrice(){
	return (super.getRegularPrice())-(super.getRegularPrice()*0.3);
	}}