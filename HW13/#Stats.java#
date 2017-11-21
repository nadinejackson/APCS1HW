//Nadine Jackson
//APCS1 pd2
//HW13 -- May ah Hahv S'maur, Please?
//2017-10-07

//All of the functions come in pairs, with the integer and double versions completeing the same process with different inputs

public class Stats{

    //Formula for mean: add together and divide by the number of numbers (two)
    public static int mean(int a, int b)
    {
	return (a + b) / 2;
    }
    public static double mean(double a, double b)
    {
	return (a + b) / 2;
    }

    //If a is greater, return a. Otherwise (including when both are equal), return b.
    public static int max(int a, int b)
    {
	if (a > b){
	    return a;
	}
	else{
	    return b;
	}
    }
    public static double max(double a, double b)
    {
	if (a > b){
	    return a;
	}
	else{
	    return b;
	}	    
    }

    //These two functions compare 3 numbers, by seeing if the first is >= the other two, or the second is >= the other two, and if not, then the third is the max
    public static int max(int a, int b, int c)
    {
	if (a >= b && a >= c){
	    return a;
	}
	if (b >= a && b >= c){
	    return b;
	}
	else{
	    return c;
	}
    }
    public static double max(double a, double b, double c)
    {
	if (a >= b && a >= c){
	    return a;
	}
	if (b >= a && b >= c){
	    return b;
	}
	else{
	    return c;
	}
    }

    //Formula for geometric mean of two numbers: square root of  the numbers' product.
    public static int geoMean(int a, int b)
    {
	return (int) Math.sqrt( a * b );
    }
    public static double geoMean(double a, double b)
    {
	return Math.sqrt( a * b );
    }
    //Formula for geometric mean of three numbers: cube root of the numbers' product.
    //Formula for geometric mean of n numers: nth root of the numbers' product.
    public static int geoMean(int a, int b, int c)
    {
	return (int) Math.pow((a * b * c), (1.0 / 3.0));
    }
    public static double geoMean(double a, double b, double c)
    {
	return Math.pow((a * b * c), (1.0 / 3.0));
    }
    public static void main(String[] args){
	//all test cases moved to StatsDriver
    }
}
