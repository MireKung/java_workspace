package report;

public class Square extends GeometricObject implements getArea{
	private double side;
	Square(){}
	Square(double side){
		this.side=side;
	}
	public void getSide(){
		System.out.println(side);
	}
	public double setSide(double side){
		return this.side=side;
	}
	public double getArea(){
		return (side*side);
	}
}
