
public class CompareableCircle 
extends Circle implements Comparable{
	double radius;
	CompareableCircle(){}
	CompareableCircle(double radius){
		super(radius);
	}
public String compareTo(CompareableCircle c1){
	String y;
	if(c1.getArea()<super.getArea()){
	y=("Circle 1 have more Area than Circle2 = "+((super.getArea()-c1.getArea())));
	}
	else if(c1.getArea()>super.getArea()){
	y=("Circle 2 have more Area than Circle1 = "+((c1.getArea()-super.getArea())));
		}
	else
		y=("2 Circle have equal Area");	
	
	return y;
	
}
}
