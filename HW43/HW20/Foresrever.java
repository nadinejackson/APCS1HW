//Nadine Jackson
//APCS1 pd2
//HW20 -- For the Love of Strings
//2017-10-19

public class Foresrever{
    
    public static String fenceF(int posts){
	String fence;
	fence = "";
	for (int ctr = posts;
	     ctr > 1;
	     ctr -= 1){ //counts down from  umber of posts
	    fence += "|--";
	}
	if (posts > 0){
	    fence += "|"; //final post
	}
	return fence;
    }
    
    public static String reverseF(String s){
	String reversed;
	reversed = "";
	for (int ctr = s.length() - 1;
	     ctr >= 0;
	     ctr -= 1){ //count down from the last letter to the first letter
	    reversed += s.substring(ctr, ctr + 1); //add the letter in that place
	}
	return reversed;
    }
    public static String reverseR(String s){
	if (s.length() > 0){
	    return (s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1))); //return the last letter + reverse the rest
	}
	else{
	    return (""); //when there are zero letters left (base case)
	}
    }
    public static void main(String[] args){
	System.out.println("\nNow we're gonna print some fences.");
	System.out.println("Fence of length 0:");
	System.out.println(fenceF(0));
	System.out.println("Fence of length 1:");
	System.out.println(fenceF(1));
	System.out.println("Fence of length 2:");
	System.out.println(fenceF(2));
	System.out.println("Fence of length 3:");
	System.out.println(fenceF(3));
	System.out.println("Fence of length 15:");
	System.out.println(fenceF(15));
	
	System.out.println("\nQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ\n");
	
	System.out.println("Testing for loop version of reverse");
	System.out.println("stressed");
	System.out.println(reverseF("stressed"));
	System.out.println("taco cat");
	System.out.println(reverseF("taco cat"));
	System.out.println("a");
	System.out.println(reverseF("a"));

	System.out.println("\n000000000000000000000000000000\n");
	
	System.out.println("Testing the reursive version of reverse");
	System.out.println("java");
	System.out.println(reverseR("java"));
	System.out.println("peels ot tnaw yllaer I");
	System.out.println(reverseR("peels ot tnaw yllaer I"));
	System.out.println("racecar");
	System.out.println(reverseR("racecar"));
	System.out.println("stressed");
	System.out.println(reverseR("stressed"));
    }
}
