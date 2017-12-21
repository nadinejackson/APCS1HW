//Team BigCoders -- Nadine Jackson, Kevin Feng, Tim Marder
//APCS1 pd2
//HW24: Inetay Otay Ineshay
//2017-10-29

/*     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
Added functionality:
- Scanner functionality now accepts text files as inputs
- Now, when words with hyphens are entered, both parts are pig-latinified
- Y is now appropriately recognized as a vowel
- Capitalization is fixed
- Punctuation now works in all positions of a word
- 
*/

import java.util.Scanner;

public class Pig {
    //Q: How does this initialization make your life easier?
    //A: I don't have to check if each letter is "aeiou", I can just reference this string instead of retyping it
    private static final String VOWELS = "aeiouAEIOU"; //added the capital versions
    private static final String LETTERS = "'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; //apostrophes are most commonly used in contractions and possesive adjectives


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

 

    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w)
    {
        if (w.equals(""))
            {
		return false;
            }
        if (w.substring(0,1).equals("y"))
	    {
		if (w.length() > 1 && isAVowel(w.substring(1,2)))
		    {
			return false;
		    }
		return true;
	    }
        return isAVowel(w.substring(0,1));  
    }

    
    public static String firstVowel(String w) //returns the first vowel in a word
    {
	if (beginsWithVowel(w)) //changed to call beginsWithVowel
	    {
		return w.substring(0,1);
	    }
	else if (w.length() < 2)
	    {
		return "";
	    }
	else
	    {
		return firstVowel(w.substring(1));
	    }
	
    }

    public static boolean isCapital(String w) //returns whether the string begins with a capital letter
    {
	return ((w.substring(0,1)).toUpperCase()).equals(w.substring(0,1));
    }

    public static String capitalize(String w) //makes the first letter capital
    {
	if (w.length() > 1)
	    {
		return ((w.substring(0,1)).toUpperCase() + w.substring(1));
	    }
	return w.toUpperCase();
    }

    public static String addToEnd(String w, int cutOff) //cuts the word like a deck of cards (taking the final portion of the word and making it the beginning)
    {
	if (isCapital(w))
	    {
		return (capitalize(w.substring(cutOff) + (w.substring(0,cutOff)).toLowerCase()));		
	    }
	return (w.substring(cutOff) + w.substring(0,cutOff));
    }

    
    public static boolean isHyphenated(String w) //returns whether the word is hyphenated
    {
	return (hasA(w, "-") && w.indexOf("-") != 0);
    }
    
    public static boolean isPunctuated(String w) //returns whether the string contains non-apostrophe punctuation
    {
	for (int inndex = 0;
	     inndex < w.length();
	     inndex += 1)
	    {
		String letter = w.substring(inndex, inndex + 1);
		if (! hasA(LETTERS, letter))
		    {
			return true;
		    }
	    }
	return false;
    }
    
    public static int firstPunc(String w) //returns the index of the first punctuation
    {
	for (int inndex = 0;
	     inndex < w.length();
	     inndex += 1)
	    {
		String letter = w.substring(inndex, inndex + 1);
		if (! hasA(LETTERS, letter))
		    {
			return w.indexOf(letter);
		    }
	    }
	return -1;
    }

    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w) 
    {
	if (isHyphenated(w)) //splits up hyphenated words
	    {
	        int split = w.indexOf("-");
		return (engToPig(w.substring(0,split)) + "-" + engToPig(w.substring(split + 1)));
	    }
	if (isPunctuated(w)) //takes of punctuation
	    {
		if (firstPunc(w) == 0)
		    {
			return w;
		    }
		return (engToPig(w.substring(0,firstPunc(w))) + w.substring(firstPunc(w)));
	    }
        if (beginsWithVowel(w)) //checks for vowelship
	    {
		return (w + "way");
	    }
        int vowelPlace = w.indexOf(firstVowel(w)); //locates first vowel
        return (addToEnd(w, vowelPlace) + "ay"); //cuts at the vowel and reconstructs word
    }		

    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in); //scanner functionality allows input from the terminal
	while( sc.hasNext() )
	    {
	    System.out.println(engToPig(sc.next()));
	}
    }//end main()
}//end class Pig
