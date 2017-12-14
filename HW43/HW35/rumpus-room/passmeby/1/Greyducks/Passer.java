public class Passer {

    // foo with int
    public static void foo (int a) {
	a += 5;
    }

    // foo with String 
    public static void foo (String a) {
	a += "Hello";
    }

    // Main method
    public static void main (String[] args) {
	int b = 5;
	System.out.println (b);
	
	foo(b);
	System.out.println (b);
	
	String c = "ret";
	System.out.println (c);
	
	foo(c);
	System.out.println (c);
    }
}
    
