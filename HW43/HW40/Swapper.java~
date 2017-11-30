/***********************\
Nadine "the Bold" Jackson
APCS1 pd2
HW38 -- Put it Together
2017-11-21
\***********************/

/*
There's an array (with t w o   d i m e n s i o n s) called straray. In populate(), three character Strings are assigned to each index. (Which are unique up to 8174 values, but no reasonable person would make an array that big just to mess with me, right?)

The swap() method takes in three inputs: the array and the two indeces to be swapped.

The main() method utilizes Keyboard.readInt() to assess user input and calls swap(), and explains what is going on.
 */

import cs1.Keyboard;

public class Swapper
{
    private static String[][] straray = new String[4][6];
    private static final String LETTERS = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm`1234567890-=[]',./~!@#$%^&*()_+{}|:<>?";
    public static void populate(String[][] twoDArray) //I took the int[][] populate and changed part of it to make strings
    {
	int v = 0;
	for (int ctr = 0;
	     ctr < twoDArray.length;
	     ctr += 1)
	    {
		for (int i = 0;
		     i < twoDArray[0].length;
		     i += 1)
		    {
			v = twoDArray[0].length*ctr + i;
			if (v <= 93)
			    {
				twoDArray[ctr][i] = LETTERS.substring(v, v + 1); //the first 93 numbers will be in the form QQQ, AAA, %%%, etc, but then we run into a problem
				twoDArray[ctr][i] += LETTERS.substring(v, v + 1);
				twoDArray[ctr][i] += LETTERS.substring(v, v + 1);
			    }
			else 
			    {
				twoDArray[ctr][i] = LETTERS.substring(v, v + 1);
				twoDArray[ctr][i] += LETTERS.substring(v % 67, v % 67+ 1); //with a really big array, to avvoid repetition, use mods of kinda big primes so there will probably be not that much repetition
				twoDArray[ctr][i] += LETTERS.substring(v % 61, v % 61+ 1);
			    }
		    }
	    }
    }

    public static void printTwoDArray(String[][] twoDArray)
    {
	for (String[] array:
		 twoDArray)
	    {
		for (String word:
			 array)
		    {
			System.out.println(word); //this was taken from homework 34, slightly modified
		    }
		System.out.println();
	    }
    }

    public static void swap (String[][] array, int one, int two)
    {
	one = one % (array.length * array[0].length); //legalize the inputs if the user messed up
	two = two % (array.length * array[1].length);
	String oneStuff = array[one / array[0].length][one % array[0].length]; //find one by finding row, then column
	String twoStuff = array[two / array[0].length][two % array[0].length];
	array[one / array[0].length][one % array[0].length] = twoStuff; //put twoStuff in one's location and vice versa
	array[two / array[0].length][two % array[0].length] = oneStuff;
    }

    public static void main (String[] args)
    {
	/*//testing randomization
	populate(straray);
	printTwoDArray(straray);
	System.out.println("*****************");
	populate(straray);
	printTwoDArray(straray);
	System.out.println("*****************");
	populate(straray);
	printTwoDArray(straray);
	System.out.println("*****************");
	populate(straray);
	printTwoDArray(straray);

	//testing swappage
	System.out.println("***************** TESTING SWAP: BEFORE");
	populate(straray);
	printTwoDArray(straray);
	System.out.println("***************** AFTER SWAPPING 16 AND 5:");
	swap(straray, 16, 5);
	printTwoDArray(straray);*/

	populate(straray);
	System.out.println("This is the current array");
	printTwoDArray(straray);
	System.out.println("Enter the first location in the array to be swapped with another location. (WARNING FOR NERDS: NOT ZERO INDEXED, THE FIRST IS THE FIRST AS IN EVERYDAY USAGE)");
	int first = Keyboard.readInt() - 1; //see what the user typed and modify it to work with zero-indexing
	System.out.println("Enter a second location to swap.");
	int second = Keyboard.readInt() - 1;
	swap (straray, first, second); //swap first and second location
	printTwoDArray(straray);
	System.out.println("The above array is the result of your actions. Peace.");
	
    }
}
