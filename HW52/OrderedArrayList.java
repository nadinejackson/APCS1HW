//Nadine Jackson
//APCS1 pd2
//HW47 -- ascENDING
//2017-12-05

import java.util.ArrayList;
    
public class OrderedArrayList extends ArrayList
{
    
    public boolean add(Comparable c)
    {
	if (this.size() > 0 && c.compareTo(this.get(this.size() - 1)) < 0)
	    return false; //hopefully I'm using this correctly.
	//It was either this or throwing an exception, but throwing
	//an exception seemed excessive.
	else
	    {
	    super.add(c);
	    return true;
	    }
    }
    
    /*
      This doesn't completely work right now, but I realized it probably wasn't 
      what we were supposed to do tonight, anyway. This version of add() would insert
      the Comparable where it would fit in the ArrayList, thus maintaining the 
      sortedness, but the homework didn't specify any new functionality, so I 
      neverminded.
    
    public boolean add(Comparable c)
    {
	int insertion = 0;
	for(int i = 0; i < this.size() - 1; i++)
	    {
		if (c.compareTo(this.get(i + 1)) <= 0
		    && c.compareTo(this.get(i)) >= 0)
		    insertion = i + 1;
	    }
	add(insertion, c);
	return true;
    }
    */
   
    
    public boolean add( int index, Comparable c)
    {
	if (this.size() == 0 ||
	    (c.compareTo(this.get(index - 1)) > 0 && this.size() == 1) ||
	    (c.compareTo(this.get(index - 1)) > 0 && c.compareTo(this.get(index)) < 0)
	    ) //if this is the right place to put it
	    {
		super.add(index, c); //put it
		return true;
	    }
	else
	    return false;
    }

    public static String makeString(ArrayList<Comparable> array) //stolen from previous hw 2x
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
    
    public static void main(String [] args)
    {
	OrderedArrayList hi = new OrderedArrayList();
	System.out.println("How big is it?");
	System.out.println(hi.size());
	System.out.println("Let's add something.");
	hi.add(4);
	hi.add(36); 
	hi.add(10); //shouldn't work (doesn't)
	System.out.println(makeString(hi));
	System.out.println("Let's add more");
	for(int i = 30; //go through each index (reusing HW46)
	    i < 50; //doesn't add anything before 36 because add() refuses
	    i += 1)
	    {
		hi.add(i);
	    }
	System.out.println("What is it now?");
	System.out.println(makeString(hi)); 
	System.out.println("Let's do something illegal: will it be true?");
	System.out.println(hi.add(2, 10)); //nope
	System.out.println("End.");
	//:)
    }
    
}
