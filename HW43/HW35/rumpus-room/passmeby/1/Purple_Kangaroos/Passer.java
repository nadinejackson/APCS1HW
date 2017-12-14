public class Passer{
    public static void main(String[] args){
	int x = 5;
	String a ="apple";
	System.out.println(x);
	System.out.println(a);
	foo(x);
	foo(y);
	System.out.println(x);
	foo2(a);
	System.out.println(a);
	
    }
    public static void foo(int a){
	a += 4;
    }
    public static void foo2(String a){
	a += ".";
    }

}
