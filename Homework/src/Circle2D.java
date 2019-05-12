public class Circle2D {
public double x,y,radius;
public void getX(){
	System.out.println(x);
}
public void getY(){
	System.out.println(y);
}
public void getRadius(){
	System.out.println(radius);
}
public Circle2D () {
	this(0,0,1);
}
public Circle2D(double x,double y,double radius){
	this.x=x;
	this.y=y;
	this.radius=radius;
}
public double getArea(){
	return  Math.PI*(radius*radius);
}
public double  getPerimeter(){
	return 2*(Math.PI)*radius;
}
public boolean contain(double x,double y)	{
	double checkx1,checkx2,checky1,checky2;
	checkx1=this.x+radius;
	checkx2=this.x-radius;
	checky1=this.y+radius;
	checky2=this.y-radius;
	boolean check;
	if(x<checkx1&&x>checkx2&&y<checky1&&y>checky2){
		check=true;
	}
	else{
		check=false;
	}
	return check;
}
public boolean contain(Circle2D circle){
	double d=Math.sqrt((Math.pow(circle.x-this.x,2))+((Math.pow(circle.y-this.y, 2))));
	boolean check;
	if(d<=(this.radius-circle.radius)){
		check = true;
	}
	else{
		check=false;
	}
		return check;
}
public boolean overlaps(Circle2D circle){
	double d=Math.sqrt((Math.pow(circle.x-this.x,2))+((Math.pow(circle.y-this.y, 2))));
	double checkoverlaps = d-(circle.radius+this.radius);
	boolean check;
	if(checkoverlaps>d){
		check= true;
	}
	else{
		check=false;
	}
	return check;
}
public double asd(Circle2D circle){
	double d =Math.sqrt((Math.pow(circle.x-this.x,2))+((Math.pow(circle.y-this.y, 2))));
	return  d;
}
public double qwe(Circle2D circle){
	double d =Math.sqrt((Math.pow(circle.x-this.x,2))+((Math.pow(circle.y-this.y, 2))));
	double checkoverlaps = d-(circle.radius+this.radius);
	return checkoverlaps;
}
}


