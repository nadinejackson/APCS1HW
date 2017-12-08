/********************************
Nadine Jackson
APCS1 pd2
HW49 -- Halving the Halves (Suffering)
2017-12-07
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = new ArrayList<Comparable>();    
    }


    public String toString()
    {
	return _data.toString(); 
    }


    public Comparable remove( int index )
    {	
	return _data.remove(index); 
    }


    public int size()
    { 
	return _data.size();
    }

    
    public Comparable get( int index )
    { 
	return _data.get(index); 
    }


    /***
     * add takes as input any comparable object 
     * (i.e., any object of a class implementing interface Comparable)
     * inserts newVal at the appropriate index
     * maintains ascending order of elements
     * uses a linear search to find appropriate index
     ***/
    
    public void add( Comparable newVal )
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
		//newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end 
    }

    /***
     * addBin takes as input any comparable object 
     * (i.e., any object of a class implementing interface Comparable)
     * inserts newVal at the appropriate index
     * maintains ascending order of elements
     * uses a binary search to find appropriate index
     ***/
    public void addBin( Comparable newVal )
    {
	//System.out.println(newVal); diagnostic print statement
	if (_data.size() == 0)
	    {
		_data.add(newVal); //simple case
		//System.out.println("  0"); more dps
		return;
	    }
        int blt = 0; //blt - not a sandwich but the biggest num less than newVal
	int sbt = _data.size(); //smallest bigger than newVal
	int med = (blt + sbt) / 2; //middle number
	while (sbt - blt > 1) //while there's a range to search
	    {
		if (newVal.compareTo(_data.get(med)) > 0) //if it's in the second half
		    {
			blt = med; //move the search to the second half
			med = (blt + sbt) / 2; //adjust the middle
		    }
		else if (newVal.compareTo(_data.get(med)) < 0) //if in second half
		    {
			sbt = med; //move search to the left half
			med = (blt + sbt) / 2; //adjust the middle
		    }
		
		else
		    {
			blt = med; //if it's the middle
			sbt = med; //we can exit
		    }
		
	    }
	//so now you have two elements between which you'll decide the final location
	if (newVal.compareTo(_data.get(blt)) <= 0) //if it belongs in the first spot
	    {
		_data.add(blt, newVal); //put it there
	    }
	else
	    {
		_data.add(sbt, newVal); //put it in the second spot
	    }
	//System.out.println("  " + sbt); dps
	
    }
    // main method solely for testing purposes
	public static void main( String[] args )
    {
	OrderedArrayList Franz = new OrderedArrayList();

	// testing binary search
	for( int i = 0; i < 15; i++ )
	    Franz.addBin( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " ); //makes me sad
		break;
	    }
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList
