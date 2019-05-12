package ExamLab;

class P {
	private int value;
	public P(int x){
		value = x;
		System.out.println("Made a P : "+value);
	}									//this is where " Made a P : come from
	public int getValue(){				//^
		return value;					//^
	}									//^
}
class Q{
	private P p;
	public Q(int x){
		p = new P(x);			//<<<<<<<<<<<<
	}								    	//^
	protected P getValue(){        		    //^
		return p; //<< and p lek refer to     ^
	}
}
public class R extends Q{
	 private R(int y){
		 super(y);     		//<<<construcker that type 100 in
	 }					//super mean you use Q constructor and type 100 in
	private void print(){
		P p = getValue(); //in getvalue we have p lek
		System.out.println(p.getValue());
	}
	public static void main(String[]args){
		R r = new R(100);
		r.print();
	}
}
