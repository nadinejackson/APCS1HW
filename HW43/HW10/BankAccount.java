// Team C.R.E.A.M. (Group 6)-- Nadine Jackson, Hasif Ahmed, and Raunak Chowdhury
// APCS1 pd02
// HW09 -- building a more meaningful class
// 2017-10-03

public class BankAccount
{
  //instance variables
  private String name;
  private String passwd;
  private int pin;
  private int acctNum;
  private double balance;

    public BankAccount(){
	setName("No name has been set");
	setPasswd("");
	setPin(1111);
	setBalance(0.00);
	setAcctNum(111111111);
    }
    public BankAccount( int accountNumber ){
	setName("No name has been set");
	setPasswd("");
	setPin(1111);
	setBalance(0.00);
	setAcctNum(accountNumber);
    }
	
  //mutators
  public String setName( String newName )
  {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd )
  {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public int setPin( int newPin )
  {
      if (1000 <= newPin && newPin <= 9998){
	  int oldPin = pin;
	  pin = newPin;
	  return oldPin;
      }
      else{
	  int oldPin = pin;
	  pin = 9999;
	  System.out.println("Invalid PIN. Please enter a PIN with four digits and not beginning with 0. The PIN has been set to 9999.");
	  return oldPin;
      }
  }

  public int setAcctNum( int newAcctNum )
  {
      if (100000000 <= newAcctNum && newAcctNum <= 999999998){
	  int oldAcctNum = acctNum;
	  acctNum = newAcctNum;
	  return oldAcctNum;
      }
      else{
	  int oldAcctNum = acctNum;
	  acctNum = 999999999;
	  System.out.println("Invalid account number, please enter a nine digit number that does not begin with zero. The account number has been set to 999999999.");
	  return oldAcctNum;
      }
  }

  public double setBalance( double newBalance )
  {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }

  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }
    public boolean withdraw( double withdrawal ) {
	if (balance >= withdrawal){
	    balance = balance - withdrawal;
	    return true;
	}
	else{
	    System.out.println("You don't have enough cha-ching.");
	    return false;
	}
    }

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }
    public boolean authenticate( int accountNum,  String password ){
	if (accountNum == acctNum && password == passwd){
	    return true;
	}
	else{
	    return false;
	}
    }

    
  //main method for testing
  public static void main( String[] args )
  {/* Some test cases
      BankAccount testAcct = new BankAccount(123456789);
      testAcct.setPasswd("pies");
      System.out.println(testAcct.toString());
      System.out.println(testAcct.authenticate(123456789, "pies"));
      System.out.println(testAcct.authenticate(123456789, "pie"));
      System.out.println(testAcct.authenticate(119037575, "pies"));
      System.out.println(testAcct.authenticate(1938859, ""));*/
  }//end main()

}//end class BankAccount
