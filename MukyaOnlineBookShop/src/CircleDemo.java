public class CircleDemo {
	public static void main(String[] args) {
	CompareableCircle c1 = new CompareableCircle(6);
	CompareableCircle c2 = new CompareableCircle(5);
	System.out.println(c1.compareTo(c2));
	}
}