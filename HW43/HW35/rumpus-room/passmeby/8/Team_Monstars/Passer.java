public class Passer {
    public static void modif(int i){
	i+=1; 
    }
    public static void moddy(String a){
	a += " world";
    }
	
    public static void main(String [] args){
	int a = 5;
	String s= "hello";
	System.out.println(a); //is 5
	modif(a);// adds 1 to the integer 
	System.out.println(a); //either 5 or 6. IS 5
	System.out.println(s);// "hello" 
	moddy(s); // adds " world" to the String 
	System.out.println(s); // either "hello" or "hello world". IS "hello"
	// Conclusion: Java is pass-by-value.
    }}
	
