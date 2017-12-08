//Team BigCoders -- Nadine Jackson, Kevin Feng, Tim Marder
//APCS1 pd2
//HW23: Etterbay Odingcay Oughthray Ollaborationcay
//2017-10-25

/*     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]

 To do:
 -fix firstVowel() to better deal with the letter y and count it as a vowel
 -generate rules for contractions and punctuation (such as hypens) (may need to manipulate substrings somehow)
 -generate exceptions for punctuation such as periods, question marks, etc.
 -allow multiple words to be inputted
*/

public class Pig {
    //Q: How does this initialization make your life easier?
    //A: I don't have to check if each letter is "aeiou", I can just reference this string instead of retyping it
    private static final String VOWELS = "aeiouAEIOU"; //added the capital versions


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	if (w.indexOf(letter) != -1) //if the letter is in w
	    {
		return true; 
	    }
	return false;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	if (VOWELS.indexOf(letter) == -1) //if letter not in VOWELS
	    {
		return false;
	    }
	return true;
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
	int vowelCount = 0; //the count of vowels in the word
	for (int index = 0; //index of each letter it'll check
	     index < w.length();
	     index += 1)
	    {
		if (isAVowel(w.substring(index, index + 1))) //if the letter at the index is a vowel, add 1 to the count
		    {
			vowelCount += 1;
		    }
	    }
	return vowelCount;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	if (countVowels(w) > 0) //if there's more than 0 vowels
	    {
		return true;
	    }
	return false;
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
	String wordVowels = ""; //what it's gonna return: all vowels in the word
	for (int index = 0;
	     index < w.length();
	     index += 1) //same for loop setup as countVowels
	    {
		if (isAVowel(w.substring(index, index + 1)))
		    {
			wordVowels += w.substring(index, index + 1); //except you add (String) letters instead of (int) 1 per letter
		    }
	    }
	return wordVowels;
         
    }

    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"

    public static String firstVowel(String w) {
        if (allVowels(w).equals("")) {
            return "";
        }
        return allVowels(w).substring(0,1);
    }
 

    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w) {
        if (w.equals(""))
            {
		return false;
            }
        if (w.substring(0,1) == "y")
	    {
		if (w.length() > 1 && isAVowel(w.substring(1,2)))
		    {
			return false;
		    }
		return true;
	    }
        return isAVowel(w.substring(0,1));  
    }

    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w) 
    { 
        if (beginsWithVowel(w) && (((w.substring(0,1)).toLowerCase()).equals(w.substring(0,1) ))) 
	    {
		return (w + "way");
	    } 
	if (beginsWithVowel(w) && (((w.substring(0,1)).toUpperCase()).equals(w.substring(0,1) ))){
	    return (w.substring(0,1)).toUpperCase() + w.substring(1) + "way";
	}
			
        int vowelPlace = w.indexOf(firstVowel(w));
        //Simple case:
	if (((w.substring(0,1)).toLowerCase()).equals(w.substring(0,1) )){ //checks if it is lower case
	    return (w.substring(vowelPlace) + (w.substring(0, vowelPlace)).toLowerCase() + "ay");
	} else { //runs when strings starts as an uppercase
	    return ((w.substring(vowelPlace, vowelPlace + 1)).toUpperCase() + w.substring(vowelPlace + 1) + (w.substring(0, vowelPlace)).toLowerCase() + "ay");
	}
    }		

    public static void main( String[] args )  {
	//hasA Test Cases:
	System.out.println("==========[hasA]==========");
	System.out.println(hasA("hello", "h")); // true
	System.out.println(hasA("hello", "w")); // false
	System.out.println(hasA("aaaaa", "e")); // false
	System.out.println("\n");
	  
	//isAVowel Test Cases:
	System.out.println("==========[isAVowel]==========");
	System.out.println(isAVowel("a")); // true
	System.out.println(isAVowel("y")); // false
	System.out.println(isAVowel("o")); // true
	System.out.println("\n");
	  
	//countVowels Test Cases:
	System.out.println("==========[countVowels]==========");
	System.out.println(countVowels("Tim")); // 1
	System.out.println(countVowels("Racecar")); // 3
	System.out.println(countVowels("Awesome")); // 4
	System.out.println("\n");
	  
	//hasAVowel Test Cases:
	System.out.println("==========[hasAVowel]==========");
	System.out.println(hasAVowel("xyz")); // false
	System.out.println(hasAVowel("abc")); // true
	System.out.println(hasAVowel("super")); // true
	System.out.println("\n");
	  
	//allVowels Test Cases:
	System.out.println("==========[allVowels]==========");
	System.out.println(allVowels("abracadabra")); // aaaaa
	System.out.println(allVowels("supercalifragilisticexpialidocious")); // ueaiaiiieiaioiou
	System.out.println(allVowels("RSVP")); // none
	System.out.println("\n");
	  
	//firstVowel Test Cases:
	System.out.println("==========[firstVowel]==========");
	System.out.println(firstVowel("football")); // o
	System.out.println(firstVowel("animal")); // a
	System.out.println(firstVowel("penguin")); // e
	System.out.println("\n");
	  
	  
	//beginsWithVowel Test Cases:
	System.out.println("==========[beginsWithVowel]==========");
	System.out.println(beginsWithVowel("apple")); // true
	System.out.println(beginsWithVowel("super")); // false
	System.out.println(beginsWithVowel("irritating")); // true
	System.out.println("\n");
	  
	//engToPig Test Cases:
	System.out.println("==========[engToPig]==========");
	System.out.println(engToPig("apple")); // appleway
	System.out.println(engToPig("Apple")); // Appleway
	System.out.println(engToPig("Strong")); // Ongstray
	System.out.println(engToPig("Mykolyk")); // Olykmykay
	System.out.println(engToPig("sky")); // skyay
	System.out.println(engToPig("dance")); //anceday
	System.out.println(engToPig("Yip")); // Ipyay
	System.out.println(engToPig("yip")); // ipyay
	System.out.println(engToPig("homework")); // omeworkhay
	System.out.println(engToPig("emacs")); // emacsway
    }//end main()
}//end class Pig
