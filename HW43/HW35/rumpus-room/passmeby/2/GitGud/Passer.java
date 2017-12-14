// Team GitGud - Alexia Leong, Peter Cwalina, and Alan Wang

public class Passer{
    public static void main(String[] args){
	//int version
	int x = 5;
	System.out.println("x now is:" + x); // returns 5
	System.out.println(shazaam(x)); //returns 15 wazaam
	System.out.println("x now after shazaam is:" + x); //returns 5
	System.out.println("---------------------");
	
	//String version
	String b = "Happy";
	System.out.println("b now is:" + b);// returns Happy
	System.out.println(stringed(b)); //returns Happy or sad
	System.out.println("b now after stringed is:" + b);// returns Happy
	System.out.println("---------------------");
	
	//array version
	int[] anArray = {1,2,3,4,5};
	System.out.println("anArray now is " + anArray[0]);//returns 1
	System.out.println(arrayed(anArray)); //returns 2
	System.out.println("anArray now after arrayed is:" + anArray[0]);// returns 2
	System.out.println("---------------------");
	
	}
    public static String shazaam(int a){
        a += 10;
	return a + " wazaam";
    }

    public static String stringed(String c){
	c += " or sad";
	return c;
    }

    public static int arrayed(int[] d){
	d[0] = d[0] + 1;
	return d[0];
    }
}
