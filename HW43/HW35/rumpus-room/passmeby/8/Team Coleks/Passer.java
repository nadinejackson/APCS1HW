
/* Team Coleks - Aleksandra Koroza, Colin H. Johnny W.
   APCS1 pd 8
   2017-11-16
 */

public class Passer{
    //============Methods=====================
    public static void changeInt(int n){
	n += 1; 
    }
    public static void changeArray(int [] a){
	a[0] = 2;
    }
    public static void addToString(String str){
	str += "hi";
    }
    public static String strArray(int [] a){
	String newA = "";
	for (int num: a){
	    newA += num + ",";
	}
	return newA.substring(0,newA.length()-1);
    }

	
    public static void main (String [] args){
	//========== Initial Variables ============
	int num = 10; // init int
	Integer numBoxed = 10; // init Integer (Object representation of an int)
	
	int [] array = { // init array
	    1, 2, 3
	};
	String s = "abc"; // init String
     
	//===============Test Changes==============
	// testing primitives such as ints
	System.out.println("Initial variable num and numBoxed:");
	System.out.println(num); // print var
	System.out.println(numBoxed); // print var
	
	System.out.println("changeInt supposedly adds 1 to num...");
	changeInt(num); // fxn modifies num to 11
	changeInt(numBoxed); // fxn modifies numBoxed to 11
	
	System.out.println(num); // print var after "changes", but remains as 10
	System.out.println(numBoxed); // print var after "changes", but remains as 10
	System.out.println();
	// end of testing primitives

	// testing arrays
	System.out.println(array); // print var
	System.out.println(strArray(array)); // String version of the array

	System.out.println("changeArray supposedly changes the first element from a 1 to a 2 in array...");
	changeArray(array); // fxn modifies the 1 to a 2 at index 0
	
	System.out.println(array); // print var after "changes" - location of stored memory is the same
	System.out.println(strArray(array)); // String version of "changed" array
	System.out.println();
	// end of testing arrays

	// testing Objects like Strings
	System.out.println(s); // print var

	System.out.println("addToString should concatenate 'hi' to the inputted String...");
	addToString(s); // fxn should cocatenate 'hi' to the end of s
	System.out.println(s); // print var again after "changes" but remains as 'abc'
	// end of testing Objects like Strings
    }
    //================Conclusions===============
    // Original:
    // Primitives and Strings are passed-by-value
    // while arrays are passed-by-reference

    // After learning what reference really means - the memory location -
    // everything in Java is passed-by-value, since the memory locations such as the array's
    // do not change
}
