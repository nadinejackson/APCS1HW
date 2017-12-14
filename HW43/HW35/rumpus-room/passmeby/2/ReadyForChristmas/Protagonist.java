public class Protagonist extends Character{
    //attribute:
    private static String name;
    
    //constructor:
    public Protagonist(String inputName) {
        name = inputName;
	setHP(150);
	setStrength(65);
	setDefense(40);
	setAttackrating(0.4);
    }
    
    //String getName(): returns value of name attribute
    public static String getName() {
	return name;
    }

    /***
	void specialize(): prepares Protagonist to do special attack
	precond: 
	postcond: defense decreases, attack increases
    ***/
    public void specialize() {
	setDefense(getDefense()/2);
	setStrength(getStrength()*2);
    }

    /***
	void normalize(): prepares Protagonist to do normal attack
	precond: 
	postcond: defense is reset, attack is reset
    ***/
    public void normalize() {
	setDefense(40);
	setStrength(100);
    }

    /*public String toString() {
	String s = "";
	s += Protagonist.getName();
	return s;
	}*/
}
