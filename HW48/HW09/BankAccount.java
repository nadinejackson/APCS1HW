/*
LoanSharks(Group 6) -- Mohtasim Howlader, Nadine Jackson, Ryan Kim
APCS1 pd02
HW09 -- CMYM/Dollar Dollar Bills Y'all...
2017-10-02 
*/

public class BankAccount{

    //Instance variables
    private String acctName; //Account Name
    private String password; //Password
    private double balance;  //Balance
    private String acctNum;  //Account Number
    private String PIN;      //Personal Identification Number
 
    //Default constructor
    public BankAccount(){
	acctName = "LoanSharks";
	password = "LoanSharks";
	balance = 0.00;
	acctNum = "000000000";
	PIN = "0000";
    }
    //Overriding constructor 
    public BankAccount(String name, String pwd, double initDep, String nineDigit, String fourDigit){
	acctName = name;
	password = pwd;
	balance = initDep;
	acctNum = nineDigit;
	PIN = fourDigit;	
    }
    
    //Main method
    public static void main(String[] args){
	/*BankAccount Potassum = new BankAccount();
	Potassum.deposit(0.01);
	Potassum.withdraw(1.01);
	System.out.println(Potassum.getAllStats());
	Test Case Yeah.*/
    }
    //Methods to set values to variables
    public void setName(String name){
	acctName = name;
    }
    public void setPassword(String pwd){
	password = pwd;
    }
    public void setBal(double money){
	balance = balance + money;
    }
    public void setAcctNum(String nineDigit){
	acctNum = nineDigit;
    }
    public void setPIN(String fourDigit){
	PIN = fourDigit;
    }
    //Method to return all statistics
    public String getAllStats(){
	return("Account Name: " + acctName
	       + "\n" +
	       "Password: " + password
	       + "\n" +
	       "Balance: " + balance
	       + "\n" +
	       "Account Number: " + acctNum
	       + "\n" +
	       "Personal Identification Number: " + PIN);
    }
    //Methods to deposit and withdraw money
    public void deposit(double deposit){
        balance = balance + deposit;
    }
    public void withdraw(double withdrawal){
	balance = balance - withdrawal;
    }

}
