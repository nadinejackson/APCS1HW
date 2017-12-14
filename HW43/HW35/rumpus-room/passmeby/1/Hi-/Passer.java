/*
  Team Hi?
  Daniel Jiang, Woosuk Lee, Sophia Xia
  APCS1 pd1
  HW #35: A Rising Tide of Knowledge Lifts All Thinkers
  Date: 2017-11-17
*/
public class Passer{
    public static String foo(int b){
	b = b + 5;
	return b + "woo";
    }
    public static void main(String [] args){
	int a = 3;
	int b = 4;
	String str = "hiii";
	
	
	System.out.println(a);//3
	System.out.println(foo(a));//8woo
	System.out.println(a);//3
	System.out.println(b);//4
	System.out.println(foo(b));//9woo
	System.out.println(b);//4
	
    }
}