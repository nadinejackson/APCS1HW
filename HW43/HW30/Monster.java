//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08  

public class Monster extends Character {
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private int defenseStor;
    private double attackRate;
    private double attackStor;

    public Monster(){
	HP = 100;
	strength = 50;
	defense = 50;
	attackRate = 0.5;
	defenseStor = defense;
	attackStor = attackRate;
	name = "ye olde monster";
    }
    //start of main method
    public static void main (String [] args){
	System.out.println("THis works");
    }//end of main method
}
