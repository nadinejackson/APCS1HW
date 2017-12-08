//Nadine Jackson
//APCS1 pd2
//HW22 -- Onay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
//2017-10-24

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
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


    public static void main( String[] args ) 
    {
	//I may have gone overboard
	System.out.println("TESTING hasA!!!!!!!!!!!!!!!");
	System.out.println("Does cat have an a? " + hasA("cat", "a"));
	System.out.println("Does cat have a p? " + hasA("cat", "p"));
	System.out.println("Does apple have a p? " + hasA("apple", "p"));
	System.out.println("Does apple have an L?" + hasA("apple", "L"));
	System.out.println("Does zebra have a c? " + hasA("zebra", "c"));
	
	System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("TESTING isAVowel!!!!!!!!!!!");
	System.out.println("Is a a vowel? " + isAVowel("a"));
	System.out.println("Is e a vowel? " + isAVowel("e"));
	System.out.println("Is i a vowel? " + isAVowel("i"));
	System.out.println("Is o a vowel? " + isAVowel("o"));
	System.out.println("Is u a vowel? " + isAVowel("u"));
	System.out.println("\n The following should all be falso:");
	System.out.println("Is y a vowel (debatable)? " + isAVowel("y"));
	System.out.println("Is b a vowel? " + isAVowel("b"));
	System.out.println("Is c a vowel? " + isAVowel("c"));
	System.out.println("Is d a vowel? " + isAVowel("d"));
	System.out.println("Is f a vowel? " + isAVowel("f"));
	System.out.println("Is g a vowel? " + isAVowel("g"));
	System.out.println("Is h a vowel? " + isAVowel("h"));
	System.out.println("Is j a vowel? " + isAVowel("j"));
	System.out.println("Is k a vowel? " + isAVowel("k"));
	System.out.println("Is l a vowel? " + isAVowel("l"));
	System.out.println("Is m a vowel? " + isAVowel("m"));
	System.out.println("Is n a vowel? " + isAVowel("n"));
	System.out.println("Is p a vowel? " + isAVowel("p"));
	System.out.println("Is q a vowel? " + isAVowel("q"));
	System.out.println("Is r a vowel? " + isAVowel("r"));
	System.out.println("Is s a vowel? " + isAVowel("s"));
	System.out.println("Is t a vowel? " + isAVowel("t"));
	System.out.println("Is v a vowel? " + isAVowel("v"));
	System.out.println("Is w a vowel? " + isAVowel("w"));
	System.out.println("Is x a vowel? " + isAVowel("x"));
	System.out.println("Is z a vowel? " + isAVowel("z"));

	
	System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("TESTING countVowels!!!!!!!!!!!!");
	System.out.println("The number of vowels in meatball is: " + countVowels("meatball"));
	System.out.println("The number of vowels in Mykolyk is (probably problamatic as far as pronunciation goes): " + countVowels("Mykolyk"));
	System.out.println("The number of vowels in Orange is: " + countVowels("Orange"));
	System.out.println("The number of vowels in Happiness is: " + countVowels("Happiness"));
	System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("TESTING hasAVowel!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("Does you have a vowel? " + hasAVowel("you"));
	System.out.println("Does zzz have a vowel? " + hasAVowel("zzz"));
	System.out.println("Does cat have a vowel? " + hasAVowel("cat"));
	System.out.println("Does sky have a vowel? " + hasAVowel("sky"));
	System.out.println("Does Art have a vowel? " + hasAVowel("Art"));

	System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("FINALLY TESTING allVowels!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("All vowels in: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay: " + allVowels("Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay"));
	System.out.println("All vowels in: disembowel: " + allVowels("disembowel"));
	System.out.println("All vowels in: tired: " + allVowels("tired"));	
	System.out.println("All vowels in: hyphenated: " + allVowels("hyphenated"));
	System.out.println("All vowels in: Jason Koo: " + allVowels("Jason Koo"));
	System.out.println("All vowels in: Area: " + allVowels("Area"));
	System.out.println("TEST CASES DONE.");
    }//end main()

}//end class Pig
