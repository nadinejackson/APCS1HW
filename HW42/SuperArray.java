//The Partyer Partners -- Nadine Jackson and Shayan Chowdhury
//APCS1 pd2
//HW42 -- Array of Grade 316
//2017-11-28

/***************************
 * class SuperArray version 2.0
 * (SKELETON + ORGANS)
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10];
	_size = 0; //no meaningful elements
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
	String foo = "["; //so it looks like an array
	for( int i = 0; i < _size; i++ ) {
	    foo += _data[i] + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]"; //DON'T FORGET TO CLOSE BRACKETS
	return foo;
    }


    //double capacity of SuperArray
    private void expand()
    {
	int[] temp = new int[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ ){ //why no curly brackets?
	    temp[i] = _data[i]; //data points to temp
	}
	_data = temp;
    }


    //accessor -- return value at specified index
    public int get( int index )
    {
	return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
	int temp = _data[index];
	_data[index] = newVal;
	return temp; //when would this be useful?
    }


    //adds an item after the last item
    public void add( int newVal )
    {
	if (_size == _data.length) //if there is already a meaningful element at every array
	    {
		expand(); //make room for more
	    }
	_size += 1; //add one to each
	_data[_size - 1] = newVal; //now add the value at the last index
    }


    //inserts an item at index
    public void add( int index, int newVal )
    {
	if (_size == _data.length || index > _size - 1)//if the contents are getting too big for their britches
	    {
		expand();//increase the britches
	    }
	_size += 1; //increase the size, because there is one more meaningful element
	shift(index, false);
	_data[index] = newVal;
    }

    //helper function for remove and add: moves everything one to the left or right
    public void shift(int index, boolean left)
    {
	if (left) //indicates shift direction
	    {
		for (int i = index;
		     i < _size;
		     i++)
		    {
			_data[i] = _data[i + 1]; //going from left to right, copy the integer one index to the right
		    }
	    }
	else
	    {
		for (int i = _size;
		     i > index;
		     i -= 1)
		    {
			_data[i] = _data[i - 1]; //right to left, copy integer to the left
		    }
		_data[index] = 0; //clear it out, no real need for it
	    }
    }
    
    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index )
    {
	_size -= 1;
	shift(index, true);
    }


    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }



    //main method for testing
    public static void main( String[] args )
    {

	SuperArray curtis = new SuperArray();
	System.out.println( "Printing empty SuperArray curtis..." );
	System.out.println( curtis );

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set( i, i * 2 );
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < 3; i++ ) {
	    curtis.expand();
	    System.out.println("Printing expanded SuperArray curtis...");
	    System.out.println(curtis);
	    System.out.println("new length of underlying array: "
			       + curtis._data.length );
	}

	SuperArray mayfield = new SuperArray();
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);

	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);

	//everthing works
	
    }//end main()


}//end class
