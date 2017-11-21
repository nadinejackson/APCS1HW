//Nadine Jackson
//APCS1 pd2
//HW25 -- All Hallow's Eve
//2017-11-01

public class Loopier
{
    public static void populate(int[] array)
    {
	for(int i = 0; //go through each index
	    i < array.length;
	    i += 1)
	    {
		array[i] = (int) (Math.random() * 10); //overwrite that index to random int from 0 to 10
	    }
    }
    public static String toString(int[] array)
    {
	String retStr = ""; //returned string
	for (int i = 0; //visit each index in the array
	     i < array.length - 1;
	     i += 1)
	    {
		retStr += array[i] + ", "; //add the int at the location and ", "
	    }
	retStr += array[array.length - 1]; //don't need a comma after last element
	return "[" + retStr + "]"; //add brackets to make it look like an array
    }
    public static int linSearch(int[] a, int target)
    {
	for (int i = 0; //visit each element
	     i < a.length;
	     i += 1)
	    {
		if (a[i] == target) //if you've got the target
		    {
			return i; //return the index
		    }
	    }
	return -1; //or return -1 if not found
    }
    
    public static int linSearchR(int[] a, int target)
    {
	if (a.length < 1)
	    {
		return -1; //if the array is empty, it's not there
	    }
	if (a[0] == target)
	    {
		return 0; //if it's at the 0th element, its index is 0
	    }
	int[] newArray = new int[a.length - 1]; //make a copy of the old arra without the 0th element
	for (int i = 0;
	     i < a.length - 1;
	     i += 1)
	    {
		newArray[i] = a[i + 1];
	    }
	if (linSearchR(newArray, target) == -1) //if the newArray doesn't have the target either, it's not there
	    {
		return -1;
	    }
	return 1 + linSearchR(newArray, target); //otherwise, add 1 to the index of the element in the newArray (since you remove 1 element each time)	
    }

    /* The following two functions amost exactly copy the algorithms from the previous two functions, with minor changes in the output. */
    public static int freq(int[] a, int target)
    {
	int ctr = 0; //counts the number of times target is in a
	for (int i = 0;
	     i < a.length; //visit each index
	     i += 1)
	    {
		if (a[i] == target) //if the number is the target
		    {
			ctr += 1; //add 1
		    }
	    }
	return ctr;
    }
    
    public static int freqRec(int[] a, int target)
    {
	if (a.length < 1) //target can't be found in a zero element array
	    {
		return 0;
	    }
	int[] newArray = new int[a.length - 1]; //build a new array without 0th element
	for (int i = 0;
	     i < a.length - 1;
	     i += 1)
	    {
		newArray[i] = a[i + 1];
	    }
	if (a[0] == target) //if the 0th element is the target
	    {
		return (1 + freqRec(newArray, target)); //add 1 to the amount of times it appears in the new array
	    }

	return freqRec(newArray, target); //if it's not the 0th element, check the new array
    }

    //Everything works how I want it to
    public static void main(String[] args)
    {
	int[] test0 = {0};
	int[] test1 = {0, 1, 2, 3, 4, 5};
	int[] test2 = {5, 5, 5, 5};
	int[] test3 = {2, 2, 2, 4, 4, 4};
	int[] test4 = {3, 1, 3, 1, 3};
	int[] test5 = {0, 0, 0, 0, 0, 0};
	System.out.println("Now testing iterative linSearch:");
	System.out.println("expected: 0 -- " + linSearch(test0, 0));
	System.out.println("expected: 3 -- " + linSearch(test1, 3));
	System.out.println("expected: 0 -- " + linSearch(test2, 5));
	System.out.println("expected: -1 -- " + linSearch(test3, 6));
	System.out.println("expected: 1 -- " + linSearch(test4, 1));
	System.out.println("expected: 0 -- " + linSearch(test5, 0));
	System.out.println("Now testing recursive linSearchR:");
	System.out.println("expected: -1 -- " + linSearchR(test0, 5));
	System.out.println("expected: 2 -- " + linSearchR(test1, 2));
	System.out.println("expected: -1 -- " + linSearchR(test2, 3));
	System.out.println("expected: 3 -- " + linSearchR(test3, 4));
	System.out.println("expected: -1 -- " + linSearchR(test5, 38));
	System.out.println("Now testing toString");
	System.out.println(toString(test0));
	System.out.println(toString(test1));
	System.out.println(toString(test2));
	System.out.println(toString(test3));
	System.out.println(toString(test4));
	System.out.println(toString(test5));
	System.out.println("Now testing iterative freq:");
	System.out.println("expected: 1 -- " + freq(test0, 0));
	System.out.println("expected: 1 -- " + freq(test1, 3));
	System.out.println("expected: 4 -- " + freq(test2, 5));
	System.out.println("expected: 0 -- " + freq(test3, 6));
	System.out.println("expected: 2 -- " + freq(test4, 1));
	System.out.println("expected: 6 -- " + freq(test5, 0));
	System.out.println("Now testing recursive freqRec:");
	System.out.println("expected: 0 -- " + freqRec(test0, 5));
	System.out.println("expected: 1 -- " + freqRec(test1, 2));
	System.out.println("expected: 0 -- " + freqRec(test2, 3));
	System.out.println("expected: 3 -- " + freqRec(test3, 4));
	System.out.println("expected: 0 -- " + freqRec(test5, 38));
	System.out.println("Now testing the populate method");
	int[] test6 = new int[7];
	populate(test6);
	System.out.println(toString(test6));
	populate(test6);
	System.out.println(toString(test6));
    }
}
