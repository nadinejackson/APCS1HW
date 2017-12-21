//Nadine Jackson
//APCS1 pd2
//HW36 -- Be Rational
//2017-11-18

public class Rational
{
    //instance vars
    private int numerator;
    private int denominator;
    public Rational() //initializes rational number to 0/1
    {
	numerator = 0;
	denominator = 1;
    }
    
    public Rational(int n, int d)
    {
	if (d==0)
	    {
		numerator = 0; //the user is too stupid to have this kind of power
		denominator = 1;
		System.out.println("You can't divide by 0, fool");
	    }
	else
	    {
		numerator = n;
		denominator = d;
	    }
    }
    
    public String toString()
    {
	String retStr = "" + numerator;
	retStr += " / ";
	retStr += denominator;
	return retStr;
    }
    
    public double floatValue()
    {
	return ((double) numerator) / denominator; //use typecasting
    }
    
    public void multiply(Rational frac)
    {
	numerator *= frac.numerator; //multiply numerators
	denominator *= frac.denominator; //and denominators
    }
    
    public void divide(Rational frac)
    {
	if (frac.numerator != 0) //don't allow division by 0
	    {
		numerator *= frac.denominator; //flip and multiply
	        denominator *= frac.numerator;
	    }
	else
	    {
		System.out.println("Cannot divide by zero, stop it.");
	    }
    }
    public static void main(String[] args)
    {
	//all of the test cases work how I want them to
	Rational zero = new Rational();
	System.out.println("Initialized a Rational, but with no value -> should automatically be 0 / 1");
	System.out.println(zero);
	System.out.println("Initialized a Rational with a 0 denominator -> should be 0 / 1");
	Rational bad = new Rational(6, 0);
	System.out.println(bad);
	Rational good = new Rational(17, 76);
	System.out.println("Initialized a Rational(17, 76) -> should be 17 / 76");
	System.out.println(good);
	Rational friend = new Rational(2, 3);
	good.multiply(friend);
	System.out.println("Multiplied 17 / 76 by 2 / 3: should be 34 / 228");
	System.out.println(good);
	System.out.println("friend should remain 2 / 3");
	System.out.println(friend);
	good.divide(friend);
	System.out.println("34 / 228 divided by 2 / 3 -> 102 / 456");
	System.out.println(good);
	System.out.println("The following should print an error, and the next line should be 102 / 456:");
	good.divide(bad);
	System.out.println(good);
	good.multiply(bad); //good has gone to the evil side
	System.out.println("Multiplied 102 / 456 by 0, should get 0 / 456");
	System.out.println(good);
	System.out.println("Printing r = 2 / 3 and s = 1 / 2");
	Rational r = new Rational(2, 3);
	System.out.println(r);
	Rational s = new Rational(1, 2);
	System.out.println(s);
	r.multiply(s);
	System.out.println("After being multiplied by 1 / 2, r (originally 2 / 3) is:");
	System.out.println(r);
	System.out.println("Expected: 0, 0, 0.3333..., 0.5");
	System.out.println(good.floatValue() + "");
	System.out.println(bad.floatValue() + "");
	System.out.println(r.floatValue() + "");
	System.out.println(s.floatValue() + "");
    }//end main()
}//end Rational
