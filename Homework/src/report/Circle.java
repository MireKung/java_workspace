package report;

public class Circle extends GeometricObject implements getArea{
	private double radius;
	
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,int  za,int za1){
		this.radius=radius;
		this.za=za;
		super.za1=za1;
	}
	public void getRadius(){
		System.out.println(radius);
	}
	public double setRadius(){
		return this.radius=radius;
	}
	public double getArea(){
		return Math.PI*(radius*radius);
	}
	void setZa(int za){
		this.za=za;
	}
	void setZa1(int za1){
		super.za1=za1;
	}
	
}
