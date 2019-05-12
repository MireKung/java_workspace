package report;
public abstract class Azeroth {
	private int amount;

	Azeroth(){}
	Azeroth(int amount){
		this.amount=amount;
	}
	public int setAmount(int amount){
		return this.amount=amount;
	}
	public void getAmount(){
		System.out.println(amount);
	}}

