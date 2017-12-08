// Nadine Jackson
// APCS1 pd2
// HW45 -- In America, The Driver Sits on the Left
// 2017-12-03

/***************************
 * class SuperArray version 4.0
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 *
 * ...and now SuperArray complies with the specifications of the
 * ListInt interface. (ListInt.java must be in same dir as this file)
 ***************************/

public class SuperArray implements List //new syntax comin' in hot
{

    private Object[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new Object[10];
	_size = 0;
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
	String foo = "[";
	for( int i = 0; i < _size; i++ ) {
	    foo += _data[i] + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
	return foo;
    }


    //double capacity of SuperArray
    private void expand()
    {
	Object[] temp = new Object[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }


    //accessor -- return value at specified index
    public Object get( int index )
    {
	if(index < 0 || index >= size())
	    {
	    throw new IndexOutOfBoundsException ("I'm starting to get sick of you people. You input an invalid index into get().");
	    }
	return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public Object set( int index, Object o )
    {
	if(index < 0 || index >= size())
	    {
	    throw new IndexOutOfBoundsException ("I'm starting to get sick of you people. You input an invalid index into set().");
	    }
	Object temp = _data[index];
	_data[index] =  o;
	return temp;
    }


    //adds an item after the last item
    public boolean add(Object o)
    {
	add( _size, o); //wow.
	return true; //when would this be useful
    }


    //inserts an item at index
    public void add( int index, Object o)
    {
	_size += 1;
	if(index < 0 || index >= size())
	    {
	    throw new IndexOutOfBoundsException ("I'm starting to get sick of you people. You input an invalid index into add().");
	    }
	//first expand if necessary
	if ( _size >= _data.length )
	    expand();
	for( int i = _size; i > index; i-- ) {
	    _data[i] = _data[i-1]; //each slot gets value of left neighbor
	}
	_data[index] = o;
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public Object remove( int index )
    {
	if(index < 0 || index >= size())
	    {
	    throw new IndexOutOfBoundsException ("I'm starting to get sick of you people. You input an invalid index into remove().");
	    }
	Object oldVal = _data[index];
	for( int i = index; i < _size - 1; i++ ) {
	    _data[i] = _data[i+1];
	}
	_size--;
	return oldVal;
    }


    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }

    //main method for testing
    public static void main( String[] args )
    {
 
	List mayfield = new SuperArray();
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add("I");
	mayfield.add("Said");
	mayfield.add("Hey");
	mayfield.add("What's");
	mayfield.add("you complete it");

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);

	System.out.println("But how big is it?");
	System.out.println(mayfield.size());
	
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);

	System.out.println("But how big is it now?");
	System.out.println(mayfield.size());
	
	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);

	System.out.println("But how big is it after all of this insertion business?");
	System.out.println(mayfield.size());//6 big
	
	System.out.println("When you add something, does it return true?");
	System.out.println(mayfield.add(12));//yep

	System.out.println("What if you get what's at index 3?");
	System.out.println(mayfield.get(3));//88

	System.out.println("What if I set index 3 to 5?");
	System.out.println(mayfield.set(3,5));//88

	System.out.println("Nah, let's remove it. What does that return?");
	System.out.println(mayfield.remove(3)); //5

	//it all works :)
	
    }//end main()


}//end class


