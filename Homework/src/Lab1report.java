public class Lab1report {
	public static void main (String [] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(7);

		c1.getArea();
		c1.getPerimeter();
		c1.display();
		c2.getArea();
		c2.getPerimeter();
		c2.display();
		c3.getArea();
		c3.getPerimeter();
		c3.display();
	}
}
