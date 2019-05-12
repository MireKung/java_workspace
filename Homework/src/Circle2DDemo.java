public class Circle2DDemo {
	public static void main(String[] args) {
		//1
		System.out.println("***********************************  1  ***********************************");
		Circle2D c1 = new Circle2D(2,2,5.5);		
		System.out.println("Area : "+c1.getArea());
		System.out.println("Perimeter : "+c1.getPerimeter());
		System.out.println("3,5 contain with c1 : "+c1.contain(3,5));
		System.out.println("5,6 contain with c1 : "+c1.contain(5,6));
		//2
		System.out.println("***********************************  2  ***********************************");
		Circle2D arrayC [] = new Circle2D[3];
		arrayC[0]=new Circle2D(3,1,1);
		arrayC[1]=new Circle2D(4,4,2);
		arrayC[2]=new Circle2D(10,10,4);
		System.out.println("arrayC[0] contain with c1 : "+c1.contain(arrayC[0]));
		System.out.println("arrayC[1] contain with c1 : "+c1.contain(arrayC[1]));
		System.out.println("arrayC[2] contain with c1 : "+c1.contain(arrayC[2]));
		System.out.println("arrayC[0] overlaps with c1 : "+c1.overlaps(arrayC[0]));
		System.out.println("arrayC[1] overlaps with c1 : "+c1.overlaps(arrayC[1]));
		System.out.println("arrayC[2] overlaps with c1 : "+c1.overlaps(arrayC[2]));

	}
}
