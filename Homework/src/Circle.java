public class Circle {
	double radius;

	Circle(){}
	Circle(double newRadius){
	radius=newRadius;
	}
	double getArea(){
	return Math.PI*(radius*radius);
	}
	double getPerimeter(){
	return 2*(Math.PI)*radius;
	}
	void display(){
	System.out.println(radius+"\n"+getArea()+"\n"+getPerimeter());
	}
}
