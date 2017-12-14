//Team NotEA: Hasif Ahmed, Mohtasim Howlader, Kyle Tau
public class Passer {
    public String change(String x) {
	x += "t";
	System.out.println("RUNS"); //prints RUNS if the function is called
	//System.out.println(x);
	return x;
    }
    public static void main(String[] args) {
	Passer hi = new Passer();
	String x = new String("foo"); 
	System.out.println(hi.change(x));//change x to foot?
	System.out.println(x); //prints foo
	String s = "foo";
	System.out.println(hi.change(s));//change s to foot?
	System.out.println(s); //prints foo 
    }
}
