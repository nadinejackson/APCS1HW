//Nadine Jackson
//APCS1 pd02
//HW07 -- On the Origins of a Big Sib
//2017-09-26

public class Greet {
 
    public static void main (String [] args) {
	String greeting;

	BigSib leah = new BigSib("Word up");
	BigSib yulia = new BigSib("Salutations");
	BigSib topher = new BigSib("Hey ya");
	BigSib sam = new BigSib("Sup");

	greeting = leah.greet("freshman");
	System.out.println(greeting);

	greeting = yulia.greet("Dr. Spaceman");
	System.out.println(greeting);

	greeting = topher.greet("Kong Fooey");
	System.out.println(greeting);

	greeting = sam.greet("mom");
	System.out.println(greeting);

	System.out.println(leah.helloMsg);
    }
}
