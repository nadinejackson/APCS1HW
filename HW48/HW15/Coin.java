//Nadine Jackson
//APCS1 pd2
//HW15 -- Wayne's World
//2017-10-11

public class Coin{
    private double value; //monetary value of coin
    private String upFace; //face currently showing
    private String name; //type of coin (penny, nickel, dime, etc.)
    private int flipCtr; //number of times it's been flipped
    private int headsCtr; //number of times its gotten heads
    private int tailsCtr; //'' tails
    private double bias; //probability of getting heads out of 1
    
    public Coin(){
	bias = 0.5; //wasn't sure about this one, but there were no instructions about how to set the bias, but it needs to be there to flip
	flip(); //it sets an upFace, but should the ctrs be 0? at this point they're not 0
    }
    public Coin(String denomination){
	this(); //a version of ditto
	name = denomination; //but now we can assign more variables
	assignValue();
    }
    public Coin(String denomination, String face){
	this(denomination); //ditto (sends to other overloaded constructor)
	upFace = face;
    }
    public String flip(){
	flipCtr += 1;
	if (Math.random() >= bias){
	    headsCtr += 1;
	    upFace = "heads";
	    return "heads";
	}
	else{
	    tailsCtr += 1;
	    upFace = "tails";
	    return "tails";
	}
    }
    public String toString(){
	return name + " -- " + upFace;
    }
    public boolean equals(Coin firstCoin, Coin secondCoin){
	return firstCoin.upFace == secondCoin.upFace; //returns whether the coins have the same side up
    }
    public void assignValue(){
	if (name == "penny"){
	    value = 0.01;
	}
        if (name == "nickel"){
	    value = 0.05;
	}
	if (name == "dime"){
	    value = 0.10;
	}
	if (name == "quarter"){
	    value = 0.25;
	}
	if (name == "halfDollar"){
	    value = 0.50; //I'm thorough
	}
	if (name == "dollar"){
	    value = 1.00;
	}
	else{
	    value = 0.0; //because it's not legal tender
	}
    }
}
