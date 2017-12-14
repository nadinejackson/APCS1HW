//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #32: Ye Olde Role Playing Game, Unchained
//2017-11-15

public class Character {

    //Initialize attributes
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;

    //Return if Character is alive
    public boolean isAlive() {
		return HP > 0;
    }

    //Return value of defense
    public int getDefense() {
		return defense;
    }

    //Lower Character HP by inputted amount
    public void lowerHP( int amount ) {
		HP -= amount;
    }

    //Attack method:
    //Calculate damage
    //Lower Character HP by calculated damage
    //Return calculated damage
    public int attack( Character character ) {
		int damage = (int) (strength * attackRating) - (character.getDefense()/2);

		if (damage < 0) {
			damage = 0;
		}
		character.lowerHP(damage);

		return damage;

    
	}
}
