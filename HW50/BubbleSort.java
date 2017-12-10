/******************************
 Nadine Jackson
 APCS1 pd2
 HW50 -- Dat Bubbly Tho
 2017-12-08
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 ******************************/

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>(); //arraylist to return 
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) { //looks like a good thing to add to the main method
	int randomIndex;
	//setup for traversal fr right to left
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    {
	Comparable left;//the two values to compare
	Comparable right;
	boolean swap; //has anything been swapped in the pass?
	for(int pass = 1; pass < data.size(); pass++) //n - 1 passes if n elements
	    {
		swap = false; //nothing has been swapped yet
		for(int i = 0; i < data.size() - pass; i++) //go through each element except the last
		    {
			left = data.get(i); //element and its neighbor
			right = data.get(i + 1); //making aliases
			if (left.compareTo(right) > 0) //if in wrong order
			    {
				data.set(i, right); //set it right
				data.set(i + 1, left);
				swap = true; //there has been a swap
			    }
		    }
		if (swap == false)
		    {
			return; //if there are no swaps in a pass, the list is sorted
		    }
	    }
    }


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	ArrayList<Comparable> steven = new ArrayList<Comparable>(); //output
	for (int i = 0; i < input.size(); i++) //copy the array element by element
	    {
		steven.add(input.get(i));
	    }
	bubbleSortV(steven); //sort the copy
	return steven; //and return it
    }


    public static void main( String [] args )
    {

	/*===============for VOID methods=============
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  bubbleSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  bubbleSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = bubbleSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  shuffle(glenSorted);
	  System.out.println("After shuffling: " + glenSorted);
	  bubbleSortV(glenSorted);
	  System.out.println("After bubble sorting: " + glenSorted);
	  
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = bubbleSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  //System.out.println( coco );
/*==========for AL-returning methods==========	  ============================================*/
	  //it all works, just not at the same time

    }//end main

}//end class BubbleSort
