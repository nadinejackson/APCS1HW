//Nadine Jackson
//APCS1 pd02
//HW06 -- On Big Sib Individuality and the Elimination of Radio Fuzz
//2017-09-25

public class Greet {
    public static void main( String[] args ) {
	String greeting1; //probably how to say "about to define this variable right quick"

	BigSib leah = new BigSib(); //creating a new instance of class BigSib
	leah.setHelloMsg("Word up"); //and she can call the function

	greeting1 = leah.greet("seal pup"); //and also call the other function
	System.out.println(greeting1); //and we've done the first greeting

	String greeting2;

	BigSib topher = new BigSib();
	topher.setHelloMsg("What's happenin'");

	greeting2 = topher.greet("captain");
	System.out.println(greeting2);

	String greeting3;

	BigSib yulia = new BigSib();
	yulia.setHelloMsg("Oh hi");

	greeting3 = yulia.greet("french fry");
	System.out.println(greeting3);

	String greeting4;

	BigSib sam = new BigSib();
	sam.setHelloMsg("Salutations");

	greeting4 = sam.greet("person not currently on the International Space Station");
	System.out.println(greeting4);
    }
}
