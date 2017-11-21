//Nadine Jackson
//APCS1 pd2
//HW17 -- Do I repeat myself?
//2017-10-16

public class Repeater{
    private static String fence; //I still don't know what static does, but I know I need it
    
    public static String fenceW(int numPosts){
	if (numPosts == 0){
	    return ""; //this isn't really a base case, more of a "just in case" case
	}
	fence = "";
	while (numPosts > 1){
	    fence += "|=="; //for each number above 1, add |==
	    numPosts -= 1;
	}
	fence += "|"; //and end the fence with the final post
	return fence;
    }
    public static String fenceR(int numPosts){
	if (numPosts == 0){ //another "just in case" case
	    return "";
	}
	else if (numPosts == 1){ //this is an actual base case
	    return "|";
	}
	else{
	    return "|==" + fenceR(numPosts - 1); //add |== to the fence with one less post
	}
    }
    public static void main(String[] args){
	System.out.println("Testing the while loop version of fence:");
	System.out.println(fenceW(0)); //isn't really a fence
	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(3));
	System.out.println(fenceW(30));
	System.out.println(fenceW(20));
	System.out.println(fenceW(100));
	System.out.println("Testing the recursive fence:");
	System.out.println(fenceR(0)); //is just an empty string
	System.out.println(fenceR(1));
	System.out.println(fenceR(2));
	System.out.println(fenceR(3));
	System.out.println(fenceR(30));
	System.out.println(fenceR(20));
	System.out.println(fenceR(100));
    }

}
