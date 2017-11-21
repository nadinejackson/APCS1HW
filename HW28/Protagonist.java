//Team THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER -- Soojin Choi, Nadine Jackson, Tabassum Fabiha
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Protagonist{
    //Attributes
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double attackRate;
    
    public Protagonist (String givenName)
    {
	name = givenName;
	HP = 125;
	strength = 100;
	defense = 40;
	attackRate = 0.4;
    }
    
    public static void main(String [] args)
    {
	System.out.println(" This works");
    }//end of the main method
}
