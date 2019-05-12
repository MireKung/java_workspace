package report;

public class Alliance extends Azeroth implements Describe {
	private int amount;
	public String king,tribe,Class;

	Alliance(){}
	Alliance(int amount,String king,String tribe,String Class){
		this.amount=amount;
		this.king=king;
		this.tribe=tribe;
		this.Class=Class;
	}
	public int setAmount(int amount){
		return this.amount=amount;
	}
	public void getAmount(){
		System.out.println(amount);
	}
	public void getKingName(){
		System.out.println(king);
	}
	public void getTribe(){
		System.out.println(tribe);
	}
	public void getClasss(){
		System.out.println(Class);
	}
	public String toString(){
		return "amount : "+amount+"\nking : "+king+"\ntribe : "+tribe+"\nClass : "+Class;
	}
	}

