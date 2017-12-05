//Nadine Jackson
//APCS1 pd2
//HW46 -- Al<B> Sorted!
//2017-12-04

import java.util.ArrayList;

public class ALTester
{
    public static void populateRandom(ArrayList<Comparable> array)
    {
	for(int i = 0; //go through each index
	    i < 23;
	    i++)
	    {
		array.add((int) (Math.random() * 10)); //stolen from previous hw
	    }
    }

    public static void populateAscending(ArrayList<Comparable> array)
    {
	for(int i = 0; //go through each index
	    i < 23;
	    i += 1)
	    {
		array.add(i); //overwrite that index to the index
	    }
    }
    
    public static void populateIdentical(ArrayList<Comparable> array)
    {
	for(int i = 0; //go through each index
	    i < 23;
	    i += 1)
	    {
		array.add(251); //overwrite that index to 251
	    }
    }

    public static String makeString(ArrayList<Comparable> array) //stolen from previous hw
    {
	String retStr = ""; //returned string
	for (int i = 0; //visit each index in the array
	     i < array.size() - 1;
	     i += 1)
	    {
		retStr += array.get(i) + ", "; //add the int at the location and ", "
	    }
	retStr += array.get(array.size() - 1); //don't need a comma after last element
	return "[" + retStr + "]"; //add brackets to make it look like an array
    }

    public static boolean isSorted(ArrayList<Comparable> array)
    {
	for (int i = 1;
	     i < array.size();
	     i++)
	    {
		if (array.get(i).compareTo(array.get(i - 1)) < 0) //if the thing to the left of you is bigger, you're unsorted :(
		    {
			return false;
		    }
	    }
	return true;
    }
    
    public static void main(String[] args)
    {
	ArrayList<Comparable> lilSammy = new ArrayList<Comparable>(); //after my child
	
	System.out.println("Now testing random population:");
	populateRandom(lilSammy); //random ints from 0 to 9
	System.out.println(makeString(lilSammy));
	System.out.println("Is it sorted?");
	System.out.println(isSorted(lilSammy));

	//'tworks
	
	ArrayList<Comparable> Geoffrey = new ArrayList<Comparable>();
	
	System.out.println("Now testing ascending population:");
	populateAscending(Geoffrey); //add elements 0 to 22
	System.out.println(makeString(Geoffrey)); //show me whatchu got
	System.out.println("Is it sorted?");
	System.out.println(isSorted(Geoffrey)); //time for a boolean (true)

	ArrayList<Comparable> KD = new ArrayList<Comparable>();
	
	System.out.println("Now testing random population:");
	populateIdentical(KD); //stick 23 251s in there
	System.out.println(makeString(KD));
	System.out.println("Is it sorted?");
	System.out.println(isSorted(KD));//true
    }
}
