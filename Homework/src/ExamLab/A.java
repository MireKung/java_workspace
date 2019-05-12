package ExamLab;

public class A {

	private int n;
	protected int m;
	
	public A(){
		super(0,0); //ไม่มี super class
	}
	private A(int a){
		this(a,0);
	}
	protected A(int a, int b){
		super(a,b); //no super class
	}
}

public class B{ //you can't make class in class
				//except you use default class
				//like class B not public class B
	public A(){  //ชื่อไม่ตรง Class
		super(0);  //no superclass
	}
	public B(int a){
		this(a,0);
	}
	private B(int a , int b ){
		A(a,b); //don't have method name A
				//that have 2 int paramiter 
	}
}
