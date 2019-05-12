
public class Circle {
double radius;
Circle(){}
Circle(double radius){
	this.radius=radius;
}
public double getArea(){
	 return Math.PI*(radius*radius);
}
}