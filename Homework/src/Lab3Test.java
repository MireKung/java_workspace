public class Lab3Test {
	public static void main(String[] args) {
		Point point1 = new Point(5,3);
		Point point2 = new Point(4,2);
		Point point3 = new Point(8,5);
		//2
		System.out.println(point1.distance(point1,point2));
		System.out.println(point2.distance(point1,point3));
		System.out.println(point3.distance(point2,point3));
		
		System.out.println(point1.distance(point1.x,point1.y,point2.x,point2.y));
		System.out.println(point2.distance(point1.x,point1.y,point3.x,point3.y));
		System.out.println(point3.distance(point2.x,point2.y,point3.x,point3.y));
		
		//3
		Point point4 =point3.copy(point1);
		System.out.println(point4.x);
		System.out.println(point4.y);
		point4.movePoint(5,6);
		System.out.println(point4.x);
		System.out.println(point4.y);

		System.out.println(point2.distance(point3,point4));
		System.out.println(point2.distance(point3.x,point3.y,point4.x,point4.y));
	}
	}
