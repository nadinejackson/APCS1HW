//JAVA IS PASS-BY-VALUE
//IF YOU SAY OTHERWISE YOU ARE WRONG
//HERE IS THE PROOF
//Courtesy of Baa_Baa_Beet
//Bosso, Lynne the Bold, and Wubin

public class Passer {

	public static String foo (int b) {
		b += 5;				//take in an int, add 5 to it
		return b + " woo";  //append " woo" to the end of the int, making it a string now
	}	

	public static String bar(String b) {
		b += " b";		//append " b" to the end of the given string
		return b;
	}

	public static Monster ahh(Monster test) {	
		test = new Nyoom();		 //make the monster variable given a more specific subclass of type Nyoom, which is one of our monsters 
		return test; 
	}

	public static void main (String[] args) {

		System.out.println("=====INT TEST=====");
		
		int a = 4;									//original value of a
		System.out.println("value of a: " + a);		//print out original value
		
		System.out.println("RUNNING METHOD");
		System.out.println(foo(a));					//run foo function

		System.out.println("\nvalue of a now: " + a); //print value of a, see if it changed
		
		
		System.out.println("=====STRING TEST====");
		
		String meme = "a"; //original variable

		System.out.println("\nvalue of meme: " + meme); //print out original value
	
		System.out.println("RUNNING METHOD"); 
		System.out.println(bar(meme)); //run the method bar() and print its result
		
		System.out.println("\nvalue of meme now: " + meme); //print value of meme, see if it changed

		System.out.println("=======OBJECT TEST========");

		Monster monster = new Monster("smaug"); //new object of type Monster
		System.out.println("\nvalue of monster: " + monster);	//print out memory address

		System.out.println("RUNNING METHOD");
		System.out.println(ahh(monster));					//run the method ahh() on the monster object

		System.out.println("\nvalue of monster: " + monster);  //print value of monster, see if it changed
	}


}
