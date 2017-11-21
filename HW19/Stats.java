// Nadine Jackson
// APCS1 pd2
// HW19 -- gcd 3 ways
// 2017-10-18

public class Stats {
    //Stats methods
    public static int mean(int a, int b) { //returns the mean of two ints
        return((a + b) / 2);
    }
    
    public static double mean(double a, double b) { //returns the mean of two doubles
        return((a + b) / 2);
    }
    
    public static int max(int a, int b) { //returns the max of two ints
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int min(int a, int b) { //returns the max of two ints
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static double max(double a, double b) { //returns the max of two doubles
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static int geoMean(int a, int b) { //returns the geometric mean of two ints as an approximate (truncated) int
       return (int)Math.sqrt(a * b);
    }
    
    public static double geoMean(double a, double b) { //returns the geometric mean of two doubles
        return Math.sqrt(a * b);
    }

    public static int gcd(int a, int b) {
	int divisor; //this is the gcd, but I feel like calling it gcd would make confusion
	int ctr;
	divisor = 1;
	ctr = 1;
	while (ctr <= min(a,b)){
	    if (a % ctr == 0 && b % ctr == 0){ //if ctr is a factor of both
		divisor = ctr; //the gcd becomes that num
	    }
	    ctr += 1;
	}
	return divisor;
    }

    /*
      Euclid's algorithm:
      1) Check if one number is divisible by the other
      2a) If so, the number by which you divided the first number is your answer. You're done.

      2b) If not, subtract the smaller number from the larger number.
      3a) If one number is 0, the other is your gcd. You're done.
      3b) Repeat steps 2b-3
      
*/
    public static int gcdEW(int a, int b) {
	if (a % b == 0) { //I don't actually think this part is necessary, but it's in the algo
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

    public static int gcdER(int a, int b){
	if (a == 0 || a % b == 0){ //utilizing that short-circuiting
	    return b;
	}
	else if (b == 0 || b % a == 0){ //don't have to worry abt mod 0
	    return a;
	}
	else{
	    return gcdER((max(a,b)-min(a,b)), min(a,b)); //I wrote a min fxn above
	}
    }

    
    //augmented methods
    public static int mean(int a, int b, int c) { //returns the mean of three ints
        return((a + b + c) / 3);
    }
    
    public static double mean(double a, double b, double c) { //returns the mean of three doubles
        return((a + b + c) / 3);
    }

    public static int max (int a, int b, int c) { //returns the max of three ints
	int num = max(a, b);
	return max(num, c);
    }
    
     public static double  max (double a, double b, double  c) { //returns the max of three doubles
    double num = max(a, b);
    return max(num, c);
    }
    
    public static int geoMean(int a, int b, int c) { //returns the geometric mean of three ints as an approximate (truncated) int
	return (int) Math.pow((a * b * c), 3);
    }
    
    public static double geoMean(double a, double b, double c) { //returns the geometric mean of three doubles
        return Math.pow((a * b * c), 3);
    }
  
    public static void main (String[] args) {
	System.out.println("Testing gcd: should be 3,1,7,9");
	System.out.println(gcd(3,24)); //3
	System.out.println(gcd(18,5)); //1
	System.out.println(gcd(21,28)); //7
	System.out.println(gcd(54,45)); //9

	System.out.println("Testing gcdEW: should be 1, 16, 6");
	System.out.println(gcdEW(17, 21)); //1
	System.out.println(gcdEW(16, 64)); //16
	System.out.println(gcdEW(18, 24)); //6

       	System.out.println("Testing gcdER: should be 1, 5, 8");
	System.out.println(gcdER(26, 15));//1
	System.out.println(gcdER(15, 25));//5
	System.out.println(gcdER(16, 8));//8
    }
}
    
