package ExamLab;

public class Count {
	private int count;
	
	public Count(){
		count = 0;
	}
	public Count(int count){
		this.count=count;
	}
	public void increment(){
		count++;
	}
	public void decrement(){
		count--;
	}
	public int getCount(){
		return count;
	}
	public void display(){
		System.out.println("count = " + count);
	}
}
