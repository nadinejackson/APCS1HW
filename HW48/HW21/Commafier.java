//Nadine Jackson
//APCS1 pd2
//HW21 -- Karmacomma
//2017-10-23

public class Commafier{
    
    public static String commafyR(int num){
	if (num > 999){ //need more commas
	    if (num % 1000 < 10){ //don't lose any numbers (010 instead of 10, 007 instead of 7), because we could end up with things like 4009 --> 4,9 if we skip this part
		return commafyR (num/1000) + ",00" + (num % 1000);
	    }
	    if (num % 1000 < 100){
		return commafyR (num/1000) + ",0" + (num % 1000); //add zeroes when needed
	    }
	    else{
		return commafyR (num/1000) + "," + (num % 1000);
	    }
	}
	else { //no need for more commas
	    return "" + num; //to make it a string
	}
    }

    
    public static String commafyF(int number){
	String num = "" + number; //make it a string
	for (int commaplace = 3; //how many characters after the comma
	     commaplace < num.length(); //we're only putting commas IN the number
	     commaplace += 4){ //3 zeroes and a comma from last time
	    num = num.substring(0, num.length() - commaplace) + "," + num.substring (num.length() - commaplace); //okay, this is a bit scary looking, but it's just take the part before the comma, add the comma, and then add the part after the comma
	}
	return num; //once the comma would no longer be inside the number, you're done
    }

    public static void main(String[] args){
	for(String s: args){ //for every String you input
	    System.out.println(commafyF(Integer.parseInt(s))); //take the integer version of s, and put it in commafyF (I chose that one because Intro2 made me favor iterative functions over recursive ones)
	}
	/*System.out.println("Now testing recursive commafication");
	System.out.println("\nCommafying 1: " + commafyR(1));
	System.out.println("Commafying 999: " + commafyR(999));
	System.out.println("Commafying 1000: " + commafyR(1000));
	System.out.println("Commafying 264328: " + commafyR(264328));
	System.out.println("Commafying 82394837: " + commafyR(82394837));
	System.out.println("\n\nNow testing iterative commafication");
	System.out.println("\nCommafying 38: " + commafyF(38));
	System.out.println("Commafying 9999: " + commafyF(9999));
	System.out.println("Commafying 1234567890: " + commafyF(1234567890));
	System.out.println("Commafying 1001: " + commafyF(1001));
	System.out.println("Commafying 0: " + commafyF(0));
	System.out.println("TEST CASES DONE");*/
    }

    
}
