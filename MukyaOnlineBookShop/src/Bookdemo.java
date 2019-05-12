public class Bookdemo {
	public static void main (String[]args){
		//1
		Product p [] = new Product[6];
		//2
	p[0]= new Book(250.0,"Basic Java Programming","UTCC Publishing",2006);
	p[1]= new Book(400.0,"Advanced Java Programming","Long Publishing",2010);
	p[2]= new Book(250.0,"Principles of Objected-oriented Programming","Star Publishing",2010);
	p[3]= new ChildernBook(90.0,"ABC Publishing",2015,6);
	((Book) p[3]).setTitle("Java Programming for Kids");
	p[4]= new ChildernBook(100,"ABC Publishing",2014,3);
	((Book) p[4]).setTitle("Computer for Kindergarden");
	p[5]= new Cartoon(50,"KFC Publishing",2002,"Nobi Nobita");
		//3
	double y = 0;
	for(int i=0;i<p.length ;i++){
		 y+=p[i].computeSalePrice();
	}
	System.out.println("Price for these book = "+y);
	 }
}