/***************************************
Nadine Jackson
APCS pd2
HW51 -- Selection, Natch
2017-12-11 
* class SelectionSort -- implements SelectionSort algorithm
***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // Helper function min
    // Takes in a list of Comparables and an index
    // returns the index w/ min val from that index onward
    public static int min(ArrayList<Comparable> alc, int index)
    {
	int min = index;
	for(int i = index; i < alc.size(); i++) //iterate through each element at or past the index
	    {
		if ((alc.get(i)).compareTo(alc.get(min)) < 0) //if it's less than the min
		    {
			min = i;//it is the min
		    }
	    }
	return min; //index of minimum value
    }

    //Swap function
    //Swaps the elements at specified indeces
    public static void swap(ArrayList<Comparable> alc, int a, int b)
    {
	alc.set(a, alc.set(b, alc.get(a))); //set b to what's at a and set a to what was at b
    }

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	for (int passes = 0; passes < data.size() - 1; passes++) //pass through the array until the second-to-last element
	    {
		swap(data, passes, min(data, passes)); //in al data, swap the next number with the index of the minimum value
	    }
    }//end selectionSortV


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>
	selectionSort( ArrayList<Comparable> input ) 
    {
	ArrayList<Comparable> paste = new ArrayList<Comparable>(); // to copy the array
	for (int i = 0; i < input.size(); i++) //element by element
	    {
		paste.add(input.get(i)); //add it
	    }
	selectionSortV(paste); //sort the copy
	return paste; //return the copy
    }//end selectionSort 


    public static void main( String [] args ) 
    {
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	selectionSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	/*===============for VOID methods=============  ============================================*/

	
	  ArrayList ben = new ArrayList<Integer>(); //used some find and replace
	  ben.add(7);
	  ben.add(1);
	  ben.add(5);
	  ben.add(12);
	  ben.add(3);
	  System.out.println( "ArrayList ben before sorting:\n" + ben );
	  ArrayList benSorted = selectionSort( ben );
	  System.out.println( "sorted version of ArrayList ben:\n" 
	  + benSorted );
	  System.out.println( "ArrayList ben after sorting:\n" + ben );

	  ArrayList jojo = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList jojo before sorting:\n" + jojo );
	  ArrayList jojoSorted = selectionSort( jojo );
	  System.out.println( "sorted version of ArrayList jojo:\n" 
	  + jojoSorted );
	  System.out.println( "ArrayList jojo after sorting:\n" + jojo );
	  System.out.println( jojo );
	/*==========for AL-returning methods==========  ============================================*/

    }//end main

}//end class SelectionSort
