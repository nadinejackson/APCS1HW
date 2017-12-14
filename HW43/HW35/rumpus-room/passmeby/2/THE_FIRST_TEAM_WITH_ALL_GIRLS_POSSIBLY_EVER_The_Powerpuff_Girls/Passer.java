//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Soojin Choi, T. Fabiha, Nadine Jackson
//APCS1 pd2
//HW35 -- A Rising Tide of Knowledge Lifts All Thinkers
//2017-11-16

public class Passer
{
    public static void changeInt(int num)
    {
	num = 1;
    }
    public static void changeStr(String thing)
    {
	thing = "no";
    }
    public static void changeStray(String[] thing)
    {
	thing[0] = "no";
    }
    public static String toString(String[] array)
    {
	String retStr = ""; //returned string
	for (int i = 0; //visit each index in the array
	     i < array.length - 1;
	     i += 1)
	    {
		retStr += array[i] + ", "; //add the int at the location and ", "
	    }
	retStr += array[array.length - 1]; //don't need a comma after last element
	return "[" + retStr + "]"; //add brackets to make it look like an array
    }
    public static void main(String[] args)
    {
	int a;
	a = 3;
	System.out.println("Intital value of a = " + a);
	changeInt(a);
	System.out.println("We \"changed\" a from 3 to 1, did it change?");
	System.out.println("Final value of a = " + a);
	
	String stringling;
	stringling = "alingaling";
	System.out.println("Intital value of stringling = " + stringling);
	changeStr(stringling);
	System.out.println("We \"changed\" stringling from alingaling to no, did it change?");
	System.out.println("Final value of stringling = " + stringling);

	String[] straray = {"alingaling","diarray","no", "i refuse", "because", "no we're not", "now we are"};
	System.out.println("Intital value of straray = " + toString(straray));
	changeStray(straray);
	System.out.println("We \"changed\" straray[0] from alingaling to no, did it change?");
	System.out.println("Final value of straray = " + toString(straray));
    }
}
