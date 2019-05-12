package report;

public class testreport {

	public static void main(String[] args) {
		
		Horde undead = new Horde(5000,"Syvanas","undead","priest");
		undead.getAmount();
		undead.setAmount(200);
		undead.getAmount();
		undead.getWarchiefName();
		undead.getTribe();
		undead.getClasss();
		
		System.out.println(undead.toString());
		
		Alliance human = new Alliance(5000,"king lane","human","warrior");
		human.getAmount();
		human.setAmount(500);
		human.getAmount();
		human.getKingName();
		human.getTribe();
		human.getClasss();
		
		System.out.println(human.toString());
	}

}
