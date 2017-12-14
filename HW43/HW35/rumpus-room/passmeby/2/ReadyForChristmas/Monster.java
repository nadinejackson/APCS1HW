public class Monster extends Character {

    //constructor:
    public Monster() {
	setStrength(20 + (int)(Math.random()*(65-20)));
	setHP(150);
	setDefense(20);
	setAttackrating(1);
    }

}
