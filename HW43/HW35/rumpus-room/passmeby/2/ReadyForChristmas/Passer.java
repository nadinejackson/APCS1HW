public class Passer {
    //inst vars

    //constructors
    
    //methods
    public static int changeInt(int x) {
	x += 1;
	return x;
    }

    public static void changeString(String s) {
	s += "banana";
    }

    //public static 

    //main
    public static void main( String[] args) {
	//testing passing on Primitives (ex: Int)
	int x = 4;
	System.out.println("Value of x before passing: " + x); //4
	changeInt(x); //changes x to 5 within function
	System.out.println("Value of x after passing: " + x); //4
	x = changeInt(x); //I thought doing this would make x's value 6,
	//since I'd already done changeInt(4) which would've made x == 5
	//but in actuality...
	System.out.println(x); //it printed out 5!
	//this shows the value of x used was 4. changeInt(x) did not make x 5.
	
	//testing passing on Strings 
	String s = "apple";
	System.out.println("s before passing: " + s); // apple
	changeString(s); //changes s to "applebanana" within function
	System.out.println("s after passing: " + s); //apple
	
	//testing passing on Objects (ex: Protagonist)
	Protagonist bob = new Protagonist("bob");
	Monster doof = new Monster();
	System.out.println("Protagonist before passing: " + bob); //Protagonist@6c2fdbb1
	doof.attack(bob); 
	System.out.println("Protagonist after passing: " + bob); //Protagonist@6c2fdbb1
	//even after you change an attribute of bob, you will get the same "location code" when you print it!
	
    }

    //conclusion: Java MUST be pass-by-value. If it were pass-by-reference, Java would have modified the variable using its memory address, thus modifying the actual variable.
    //Let me explain with my integer example:
    //The variable x is assigned the value 4. With changeInt(x), the value of x, 4, is passed into the function, and that value becomes 5. However, because only the value of x and not x itself was passed into the function, x does not become 5. 
}

