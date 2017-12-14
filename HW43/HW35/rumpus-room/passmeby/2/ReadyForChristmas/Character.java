/*
Team Ready for Christmas: Henry Carver, Maxwell Vale, Lily Yan
APCS1 pd2
HW30 -- Ye Olde Role Playing Game, Improved
2017-11-10
 */

public class Character {

    private int HP;
    private int strength;
    private int defense;
    private double attackrating;

    //mutators:
    public int setHP(int newHP) {
	int oldHP = HP;
	HP = newHP;
	return oldHP;
    }

    public int setStrength(int newStrength) {
	int oldStrength = strength;
	strength = newStrength;
	return oldStrength;
    }

    public int setDefense(int newDefense) {
	int oldDefense = defense;
	defense = newDefense;
	return oldDefense;
    }

    public double setAttackrating (double newAttackrating) {
	double oldAttackrating = attackrating;
	attackrating = newAttackrating;
	return oldAttackrating;
    }

    //accessors:
    public int getDefense() {
	return defense;
    }

    public int getStrength() {
	return strength;
    }

    //methods:
    /***
	boolean isAlive(): indicates if living or dead
	precond: 
	postcond: returns boolean (true means living, false means dead)
     ***/
    public boolean isAlive () {
	return (HP > 0);
    }

    /***
	void lowerHP(int lostHP): lowers HP by input
	precond: lostHP >= 0
	postcond: HP is lowered by lostHP
     ***/
    public void lowerHP (int lostHP) {
	HP -= lostHP;
    }

    /***
	int attack(Character name): attacks instance of class Character
	precond: input isn't null
	postcond: calculates damage, damage >= 0, lowers name's HP by damage, 
	returns damage
     ***/
    public int attack (Character name) {
	int damage = (int) (strength * attackrating) - name.getDefense();
	if (damage < 0) damage = 0;
	name.lowerHP(damage);
	return damage;
    }
    
} // end class
