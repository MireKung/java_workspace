package report;

public class Horde extends Azeroth implements Describe {
	private int amount;
	public String warchief,tribe,Class;

	Horde(){}
	Horde(int amount, String warchief, String tribe,String Class){
		this.amount=amount;
		this.warchief=warchief;
		this.tribe=tribe;
		this.Class=Class;
	}
	public int setAmount(int amount){
		return this.amount=amount;
	}
	public void getAmount(){
		System.out.println(amount);
	}
	public void getWarchiefName(){
		System.out.println(warchief);
	}
	public void getTribe(){
		System.out.println(tribe);
	}
	public void getClasss(){
		System.out.println(Class);
	}
	public String toString(){
		return "amount : "+amount+"\nwarchief : "+warchief+"\ntribe : "+tribe+"\nClass : "+Class;
	}}