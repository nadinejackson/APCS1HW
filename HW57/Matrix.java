//Nadine Jackson
//APCS1 pd2
//HW57 -- How Deep Does the Rabbit Hole Go?
//2017-12-19

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) //O(n^2) in relation to default size or O(1) if default size is always 2
    {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE]; //all 4 items set to null
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) //O(n)
    {
	matrix = new Object[a][a]; //every item set to null
    }


    //return size of this matrix, where size is 1 dimension
    private int size() //O(sqrt(n)) where n is the number of elements in the matrix
    //O(n) where n is the number of columns/rows
    {
	int size = 0;
	for (Object thing: this.matrix[0])//count every thing in the first row
	    size += 1;
	return size;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) 
    {
	return matrix[r - 1][c - 1]; //O(1)
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty() //O(n^2) where n is the size
    {
	for (int r = 0; r < this.size(); r++) //in every row
	    for (int c = 0; c < this.size(); c++) //in every column
		if(matrix[r][c] != null) //if there's something
		    return false; //it's not empty
	return true;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) //O(n)
    {
	Object retVal = matrix[r - 1][c - 1]; //store old value
	matrix[r - 1][c - 1] = newVal; //change to new value
	return retVal; //return old value
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() //O(n^2)
    {
	String retStr = new String();
	//one problem is that longer numbers make for longer rows
	//but
	//it's 2:13 AM and I want to sleep
	for(int r = 0; r < this.size(); r++)
	    {
		retStr += "|"; //row ends
		for(int c = 0; c < this.size(); c++)
		    {
			retStr += " " + this.matrix[r][c]; //add a space and the string of the object
		    }
		retStr += " |\n"; //other end
	    }
	return retStr;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) //O(n^2)
    {
	if (((Matrix)rightSide).size()  != this.size())
	    return false;
	for (int r = 1; r <= this.size(); r++)
	    for (int c = 1; c <= this.size(); c++) //1 indexing confuses me
		if (! this.get(c, r).equals(((Matrix)rightSide).get(c, r))) //if any things in the same spot in both matrices are not equal, the whole matrices aren't equal
		    return false;
	return true;
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) //O(n)
    {
	for(int r = 1; r < this.size(); r++) //go to each row
	    this.set(r, c1, this.set(r, c2, matrix[r - 1][c1 - 1])); //swap the columns
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) //O(n)
    {
	for(int c = 1; c <= this.size(); c++) //same thing as rows, just switch some variables
	    this.set(r1, c, this.set(r2, c, matrix[r1 - 1][c - 1]));
    }


    //main method for testing
    public static void main( String[] args ) //O(n^2)
    {
	//it all works now
	Matrix red = new Matrix(5);
	System.out.println("New matrix red, is it empty? It should be.\n" + red.isEmpty());
      
	//populate with ints 1 to 25
	for(int i = 0; i < red.size() * red.size(); i++)
	    {
		red.set((i / 5) + 1, (i % 5) + 1, i + 1);
	    }
	System.out.println("Here's what we have post-population:\n" + red);
	System.out.println("So, now is it empty?\n" + red.isEmpty());

	//another one, for comparison's sake
	Matrix blue = new Matrix(5);
	for(int i = 0; i < blue.size() * blue.size(); i++)
	    {
		blue.set((i / 5) + 1, (i % 5) + 1, i + 1);
	    }
	System.out.println("If we make an identical matrix, will .equals return true?\n" + red.equals(blue));

	//testing swaps
	red.swapColumns(2, 3);
	System.out.println("What we have now after swapping rows 2 and 3 in red:\n" + red);
	red.swapColumns(2, 3);
	red.swapRows(1, 5);
	System.out.println("After reversing the effects and swapping rows 1 and 5, red looks like this:\n" + red);
	System.out.println("But now, they should no longer be equal, are they?\n" + red.equals(blue));
    }

}//end class Matrix
