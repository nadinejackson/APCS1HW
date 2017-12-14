/*
  Rohan Ahammed, Joan Chirinos, Aaron Li - Team RPGers
  APCS pd08
  2017-11-15
*/

public class Passer {

    public static void main( String[] args) {

	// Initialize vars
	int i = 5;
	sop("\nint i was set to 5");
	String str = "henlo";
	sop("String str was set to \"henlo\"");
	int[] arr = {1, 2, 3, 4};
	sop("int[] arr was set to {1, 2, 3, 4}");
	Integer x = new Integer(9);
	sop("Wrote Integer x = new Integer(9)\n");

	//Test PRIMITIVES
	sop("Testing addToInt(i), which should make i = 6");
	addToInt(i);
	sop(i + "\n");
	
	sop("Testing addToString(str)," +
	    " which should make str = \"henlo friend\"");
	addToString(str);
	sop(str + "\n");
	
	sop("Testing doubleArrayVals(arr), which should make " +
	    "arr = {2, 4, 6, 8}");
	doubleArrayVals(arr);
	sop(arr);
	sop("\n");

	sop("Testing addToInt(x), which should make x = 10");
	sop(x);

	String prtStr;
	prtStr = "\nIn conclusion, we believe that Java is pass-by-value";
	prtStr += " for primitives and Objects, but pass-by-reference";
	prtStr += " for arrays\n";
	sop(prtStr);
	
    }

    //Methods for testing
    public static void addToInt(int n) {
	n += 1;
    }

    public static void addToString(String n) {
	n += " friend";
    }

    public static void doubleArrayVals(int[] array) {
	for (int i = 0; i < array.length; i++) array[i] = array[i] * 2;
    }

    //SOP methods
    public static void sop(int x) {
	System.out.println(x);
    }
    public static void sop(String x) {
	System.out.println(x);
    }
    public static void sop(int[] array) {
	String retStr = "{";
	for (int i : array) {
	    retStr += i + ", ";
	}
	System.out.print(retStr.substring(0, retStr.length() - 2) + "}");
    }
}


// ========== Conclusions ==========
// Java is:
// pass-by-value for primitives + strings
