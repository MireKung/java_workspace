public class Point {
	public int x,y;
	Point(){
		x=0;
		y=0;
	}
	Point(int newx,int newy){
		x=newx;
		y=newy;
	}
	Point(Point p){
		x=p.x;
		y=p.y;
	}
	void movePoint(int newx,int newy){
		x+=newx;
		y+=newy;	
	}
	Point copy(Point p){
		Point copyP = p;
		return copyP;
	}
	double distance(Point p1,Point p2){
		return Math.sqrt((Math.pow(p2.x-p1.x,2))+(Math.pow(p2.y-p1.y, 2)));	
	}
	double distance(int x1,int y1,int x2,int y2){
		return Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1, 2)));
	}
	public String toString(){
		return "x = "+x+" y = "+y;
	}


}