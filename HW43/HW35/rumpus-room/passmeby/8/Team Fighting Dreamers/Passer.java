public class Passer {
    static int a = 5;
    
    static void foo(int n) {
	a = n;
    }
    
    public static void main(String[] args) {
	System.out.println("value of a:");
	System.out.println(a);
	System.out.println("foo(10):");
	foo(10);
	System.out.println("new value of a:");
	System.out.println(a);
    }
}
