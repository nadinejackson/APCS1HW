public class Passer {

    private int b;

    public Test() {
	this.b = 10;
    }

    private  void foo (int b) {
	b = 5;
	b *= 1000;
	b -= 999;
	System.out.println( b );
    }

    private void printFoo(int b) {
	System.out.println( b );
    }

    private static void staticFoo(int a) {
      	a = 5;
	a *= 1000;
	a -= 999;
	System.out.println( a );
    }

    private static void staticPrintFoo(int a) {
	System.out.println( a );
    }
    
    public static void main ( String[] args ) {
	Test t = new Test();

	System.out.println("=========Instanced Tests=========");
	t.printFoo( t.b );
	t.foo( t.b );
	t.printFoo( t.b );

	
	System.out.println("=========Static Tests=========");
	int a = 10;

	staticPrintFoo( a );
	staticFoo( a );
	staticPrintFoo( a );
    }

}
