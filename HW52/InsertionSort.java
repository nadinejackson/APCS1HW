/***************************************
Nadine Jackson
APCS1 pd2
HW52 -- Poker Face
2017-12-12
*  class InsertionSort -- implements InsertionSort algorithm
***************************************/

import java.util.ArrayList;

public class InsertionSort
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

    //Swap function
    //Swaps the elements at specified indeces
    public static void swap(ArrayList<Comparable> alc, int a, int b)
    {
        alc.set(a, alc.set(b, alc.get(a))); //set b to what's at a and set a to what was at b
    }


    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSortV( ArrayList<Comparable> data )
    {
	Comparable current; //comparable you're looking at
	for(int part = 1; part < data.size(); part++) //partition (beginning of unsorted)
	    {
		current = data.get(part); //look at the next thing
		for(int place = part - 1; place >= 0; place--) //go through the sorted region backwards (walk it down)
		    {
			if(current.compareTo(data.get(place)) < 0) //if the thing you're looking at to place is smaller than this one
			    {
				swap(data, place, place + 1); //swap the bigger one to the right (the one on the right will always be current)
			    }
			else //final resting place
			    {
				break; //don't check anything else
			    }
		    }
	    }
    }//end insertionSortV


    // ArrayList-returning insertionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>
	insertionSort( ArrayList<Comparable> input )
    {
	ArrayList<Comparable> paste = new ArrayList<Comparable>();
	for(int i = 0; i < input.size(); i++)
	    {
		paste.add(input.get(i));
	    }
	insertionSortV(paste);
	return paste; //essentially the same as yesterday's, but with a different algorithm
    }//end insertionSort


    public static void main( String [] args )
    {
	/*===============for VOID methods=============	
	  System.out.println("\n*** Testing sort-in-place (void) version... *** ");
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "\nArrayList glen before sorting:\n" + glen );
	  insertionSortV(glen);
	  System.out.println( "\nArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "\nArrayList coco before sorting:\n" + coco );
	  insertionSortV(coco);
	  System.out.println( "\nArrayList coco after sorting:\n" + coco );
	  ============================================*/

	
	  System.out.println( "*** Testing non-void version... *** " );
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "\nArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = insertionSort( glen );
	  System.out.println( "\nsorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "\nArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "\nArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = insertionSort( coco );
	  System.out.println( "\nsorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "\nArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	/*==========for AL-returning methods==========  ============================================*/

    }//end main

}//end class InsertionSort
