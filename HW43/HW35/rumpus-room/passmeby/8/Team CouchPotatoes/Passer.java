public class Passer {
    public static void testInt(int a){
	a += 1;
    }
    public static void testStr(String a){
	a += " Rock";
    }
    public static void main(String[] args){
	// testing primitives
	int x = 0;
	System.out.println("==========Primitive tests==========");
	System.out.println("Initial Value: ");
	System.out.println(x); // 0
	testInt(x);
	System.out.println("Post Value: ");
	System.out.println(x); // 0

	// testing Objects
	String s = "You";
	System.out.println("==========Object tests==========");
	System.out.println("Initial Value: ");
	System.out.println(s); // You
	testStr(s);
	System.out.println("Post Value: ");
	System.out.println(s); // You

	// Conclusion: Java is pass-by-value.
    }
}
