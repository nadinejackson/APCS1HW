//Team Unbroken -- Angela Tom, Jackie Li, Bing Li

public class Passer {

    public static int test(int x) {
	x += 4;
	return x;
    }

    public static int test2 (int[] x) {
	x[0] = 4;
	return x[0];
    }

    
    public static void main(String[] args) {
	//pass by value
	int a = 3;
	System.out.println("print out value assigned: " + a);
	System.out.println("result of test1: " + test(a));

	//pass by reference
	int[] hello = {1,2,3};
	System.out.println("print out memory location: " + hello);
	System.out.println("result of test2: " + test2(hello)); //expects 4
	
	

    }
}
