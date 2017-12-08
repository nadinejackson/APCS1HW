//Nadine Jackson
//APCS1 pd2
//HW37 -- Be More Rational
//2017-11-20

public class Rational
{
    //instance vars
    private int _numerator;
    private int _denominator;
    public Rational() //initializes rational number to 0/1
    {
	_numerator = 0;
	_denominator = 1;
    }
    
    public Rational(int n, int d)
    {
	if (d==0)
	    {
		_numerator = 0; //the user is too stupid to have this kind of power
		_denominator = 1;
		System.out.println("You can't divide by 0, fool");
	    }
	else
	    {
		_numerator = n;
		_denominator = d;
	    }
    }
    
    public String toString()
    {
	String retStr = "" + _numerator;
	retStr += " / ";
	retStr += _denominator;
	return retStr;
    }
    
    public double floatValue()
    {
	return ((double) _numerator) / _denominator; //use typecasting
    }
    
    public void multiply(Rational frac)
    {
	_numerator *= frac._numerator; //multiply _numerators
	_denominator *= frac._denominator; //and _denominators
    }
    
    public void divide(Rational frac)
    {
	if (frac._numerator != 0) //don't allow division by 0
	    {
		_numerator *= frac._denominator; //flip and multiply
	        _denominator *= frac._numerator;
	    }
	else
	    {
		System.out.println("Cannot divide by zero, stop it.");
	    }
    }

    public static int gcd(int a, int b) { //from hw 19
	if (b % a == 0) {
	    return a;
	}
	else {
	    while (a != 0 && b != 0) { //while neither is 0
		if (a > b) { //this is the subtraction part
		    a -= b;
		}
		else {
		    b -= a;
		} 
	    }
	    if (a == 0) {
		return b;
	    }
	    else { //b would equal 0
		return a;
	    }
	}
    }

    
    public void add(Rational frac)
    {
        int lcm = this._denominator * frac._denominator
	    / gcd(this._denominator, frac._denominator); //least common multiple	
	_numerator *= lcm / _denominator;
	_denominator = lcm;
	_numerator += frac._numerator * lcm / frac._denominator;
    }

    public void subtract(Rational frac)
    {
        int lcm = this._denominator * frac._denominator
	    / gcd(this._denominator, frac._denominator); //least common multiple	
	_numerator *= lcm / _denominator;
	_denominator = lcm;
	_numerator -= frac._numerator * lcm / frac._denominator;
    }
    
    
    public int gcd()
    {
	if(_numerator > _denominator)
	    {
		return gcd(Math.abs(_numerator), Math.abs(_denominator));
	    }
	return gcd(Math.abs(_denominator), Math.abs(_numerator));
    }

    public void reduce()
    {
	if (_numerator == 0)
	    {
		_denominator = 1;
	    }
	else
	    {
	    int cd = gcd(_numerator, _denominator);
	    _numerator /= cd;
	    _denominator /= cd;
	    }
    }

    public int compareTo(Rational frac)
    {
	Rational fract = new Rational(frac._numerator, frac._denominator);//copies to compare
	Rational og = new Rational(_numerator, _denominator);
	fract.reduce();
	og.reduce();
	if (fract._numerator == og._numerator
	    && fract._denominator == og._denominator) //after reduction, if nums and dens are the same:
	    {
		return 0;
	    }
	if (fract.floatValue() > og.floatValue())
	    {
		return 1;
	    }
	return -1;
    }

    public static void main(String[] args)
    {
	//all of the test cases work how I want them to
	Rational zero = new Rational();
	System.out.println("Initialized a Rational, but with no value -> should automatically be 0 / 1");
	System.out.println(zero);
	System.out.println("Initialized a Rational with a 0 _denominator -> should be 0 / 1");
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
	Rational a = new Rational(2, 3);
	System.out.println(a);
	Rational b = new Rational(1, 2);
	System.out.println(b);
	a.multiply(b);
	System.out.println("After being multiplied by 1 / 2, a (originally 2 / 3) is:");
	System.out.println(r);
	System.out.println("Expected: 0, 0, 0.3333..., 0.5");
	System.out.println(good.floatValue() + "");
	System.out.println(bad.floatValue() + "");
	System.out.println(a.floatValue() + "");
	System.out.println(b.floatValue() + "");

	//new test cases all work how I want them to
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
        Rational u = new Rational(2, 4);
	Rational v = new Rational(3, 9);
	Rational w = new Rational(9, 3);
	
	System.out.println("\n\nr = " + r);
	System.out.println("s = " + s);
	System.out.println("t = " + t);
	
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9
	System.out.println("\nAfter adding s to r and reducing t,");
	System.out.println("r = " + r);
	System.out.println("s = " + s);
	System.out.println("t = " + t);

	t.subtract(r);
	System.out.println("\nAfter subtracting r from t");
	System.out.println("r = " + r);
	System.out.println("s = " + s);
	System.out.println("t = " + t);

	System.out.println("\nGCDs");
	System.out.println("GCD of r = " + r.gcd());
	System.out.println("GCD of s = " + s.gcd());
	System.out.println("GCD of t = " + t.gcd());
	System.out.println("GCD of u = " + u.gcd());
	System.out.println("GCD of v = " + v.gcd());
	System.out.println("GCD of w = " + w.gcd());


        System.out.println("Compare " + r + " to " + s + ": " + r.compareTo(s));
	System.out.println("Compare " + r + " to " + t + ": " + r.compareTo(t));
	System.out.println("Compare " + r + " to " + u + ": " + r.compareTo(u));
	System.out.println("Compare " + s + " to " + u + ": " + s.compareTo(u));
	System.out.println("Compare " + t + " to " + s + ": " + t.compareTo(s));
	
	System.out.println(gcd(2, 1));
    }//end main()
}//end Rational
