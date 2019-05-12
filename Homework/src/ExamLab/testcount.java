package ExamLab;

public class testcount {
	public static void main(String[]args){
		Count c1 = new Count();
		Count c2 = new Count(c1.getCount()); //<<< 0 
		Count c3 = new Count();
		c1.increment();
		c2.decrement(); // = 4 ผิด
		//c1.count = 5; ไม่ได้เพราะเป็น private
		//c2.count = 2; เช่นกัน
		c1.display();
		c2.display();
		c3.display();
	}
}
