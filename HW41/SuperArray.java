//Ndaine Jackson
//APCS1 pd2
//HW41 -- Array of Steel (like Kal El, inspired by Curtis)
//2017-11-17

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10]; //will now have zeroes
	_size = 10; //how big? 10 big.
    }

    public String toString() //from HW25
    {
	String retStr = ""; //returned string
	for (int i = 0; //visit each index in the array
	     i < _data.length - 1;
	     i += 1)
	    {
		retStr += _data[i] + ", "; //add the int at the location and ", "
	    }
	retStr += _data[_data.length - 1]; //don't need a comma after last element
	retStr = ("[" + retStr + "]" ); //add brackets to make it look like an array
	return retStr;
    }
    //copies an array
    public static void copyArray(int[] olde, int[] newe)
    {
	for (int i = 0;
	     i < olde.length;
	     i++)
	    {
		newe[i] = olde[i];
	    }
    }


    //double capacity of SuperArray
    private void expand()
    {
	int[] oldData = new int[_size]; //new array to store former contents of _data
	_size *= 2; //double the size, as above
	copyArray(_data, oldData); //copy the contents for storage
	_data = new int[_size]; //make a new array for _data
	copyArray(oldData, _data); //bring the data back to the now larger array
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
	int oldVal = _data[index];
	_data[index] = newVal;
	return oldVal; //when would this be useful?
    }


    //main method for testing
    public static void main( String[] args )
    {

	SuperArray curtis = new SuperArray(); //after that musician guy Curtis Mayfield
            
	System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis ); //bunch o' zeroes

	  for( int i = 0; i < curtis._data.length; i++ )
	      {
		  curtis.set( i, i * 2 ); //puts double the index in each slot of the array
	      }

	  System.out.println("Printing populated SuperArray curtis..."); 
	  System.out.println(curtis); //0, 2, 4, etc.

	  for( int i = 0; i < 3; i++ )
	      {
		  curtis.expand(); //expand 3 times
		  System.out.println("Printing expanded SuperArray curtis...");
		  System.out.println(curtis);
	      }
        
    }//end main()


}//end class
