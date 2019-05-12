import java.util.Date;
public class Triangle {
	
	private double side1=1.0  //สูงตรงกลาง
			,side2=1.0, //ฐาน                                    //สามเหลี่ยมหน้าจั่ว
			side3 =1.0; //เอียง
	static int numberOfTriangle;
	Date date = new Date();	
	Triangle(){}
	
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	public double getArea(){
		double horon = (side1+side2+side3)/2;
		return Math.sqrt(horon*((horon-side1)*(horon-side2)*(horon-side3)));
	}
	public double getPerimeter(){
		return side1+side2+side3	;
	}
	public void display (){
		System.out.println("We run this program on : "+date+"\n Side 1 : "+side1+"\n Side 2 : "+side2
				+"\n Side 3 : "+side3+"\n Area of this triangle = "+getArea()+"\n Perimeter = "+getPerimeter());
	}
}
