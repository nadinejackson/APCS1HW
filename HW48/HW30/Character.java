//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08   
public class Character{
    //Attributes
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private int defenseStor;
    private double attackRate;
    private double attackStor;
	
    //Constructors
    public Character(){
	HP = 100;
	strength = 50;
	defense = 50;
	attackRate = 0.5;
	defenseStor = defense;
	attackStor = attackRate;
    }
    public Character (String newName){
	this();
	name = newName; 
    }
	
	
    //Methods
    public int setAttackRate()
    {
    }
    public boolean isAlive(){
	return HP > 0;
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void lowerHP(int lostHP){
	if (HP < lostHP){
	    HP = 0;
	}
	else{
	    HP -= lostHP;
	}	
    } 
    public int attack(Character enemy){
	int damage = (int)(strength * attackRate) - enemy.getDefense();
	enemy.lowerHP(damage);
	return damage;
    }
    //start of main method
    public static void main(String [] args){
	System.out.println(" This works");
    }//end of the main method
}
