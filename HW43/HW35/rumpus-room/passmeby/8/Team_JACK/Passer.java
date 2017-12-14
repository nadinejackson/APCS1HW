//Team Stefan and Clara
//Team JACK - Clara Mohri, Jessica Wu, Kevin Wang

public class Passer{

    //method addOne returns the sum of input num and 1
    public static int addOne(int num){
	num += 1;
	return num;
    }

    //method addFOO returns a string with "FOO" concatenated
    public static String addFOO(String word){
	word += "FOO";
	return word;
    }

    public static void main (String[] args){
	int a= 3;
	System.out.print("original value of a:");
	System.out.println(a);
	//	System.out.println(addOne(3));
	System.out.print("addOne(a): ");
	System.out.println(addOne(a));
	System.out.print("Value of a after addOne(a): ");
	System.out.println(a);
	//here the value of a remains unchanged

	System.out.println("==============");

	String str = "foo";
	System.out.print("Original string str: ");
	System.out.println(str);
	System.out.print("addFOO(str): ");
	System.out.println(addFOO(str));
	System.out.print("Value of str after addFOO(str): ");
	System.out.println(str);
	//here the value of str remains unchanged
	System.out.println("Java is pass-by-value");

	/**
	 *the value of a does not change after addOne()
	 *the value of str does not change after addFOO()
	 *therefore, Java is pass-by-value
	 **/



    }

}