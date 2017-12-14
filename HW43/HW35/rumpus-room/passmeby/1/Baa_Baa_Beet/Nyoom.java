//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #32: Ye Olde Role Playing Game, Unchained
//2017-11-15

public class Nyoom extends Monster {
	
	private String name;

	public Nyoom() {
		
		name = "NYOOM";
		HP = 30;
		defense = 5;
		attackRating = 2;
		strength = (int)((Math.random() * 50) + 30);

	}

	public String getName() {
		return name;
	}

	public static String about() {
		return "The Nyoom is all about hitting hard - it has very low defense, but high attack\nIf you aren't lucky enough to kill it in one hit, good luck!";
	}
}
