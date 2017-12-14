public class passer{


    
    public static void foo(int b){
	b = b + 5;
	System.out.println(b);
    }

    public static void foo2(String string){
	string = string + "idk";
	System.out.println(string);
	
    }

    public static void foo3(BankAccount bankaccount){
	bankaccount = new BankAccount();
	System.out.println(bankaccount);
    }

    
    public static void main(String[] args){
	int a =4;
	String s = "string";
	BankAccount bank = new BankAccount();
	Integer integer = 4;
	
	System.out.println("a before: " + a);
	foo(a);
	System.out.println("a after: " + a + "\n");


	System.out.println("s before: " + s);
	foo2(s);
	System.out.println("s after: " + s + "\n");

	System.out.println("bank before: " + bank);
	foo3(bank);
	System.out.println("bank after: " + bank + "\n");

	System.out.println("integer before: " + integer);
	foo(integer);
	System.out.println("integer after: " + integer);
    }

}
