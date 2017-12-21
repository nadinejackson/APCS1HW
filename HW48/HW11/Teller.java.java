public class Teller{
    public static void main(String [] args){
	BankAccount acct1 = new BankAccount();
	System.out.println(acct1);
	System.out.println("                    ");
	
	acct1.setPin(444);
	acct1.setAcctNum(426);

	System.out.println(acct1);
	System.out.println("                    ");

	acct1.authenticate("dank","memes");
	acct1.withdraw(40);
	
    }
}
