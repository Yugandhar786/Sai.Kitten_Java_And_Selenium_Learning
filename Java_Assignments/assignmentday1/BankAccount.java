package assignmentday1;

public class BankAccount {
//instance variables
static	String Accountname="SAI";
static	Double balance=158000.00;
	
	//constructor to initialize instance variables
//	public BankAccount(String Accountname, Double balance) {
//		this.Accountname = Accountname;
//		this.balance = balance;	
//	}
	//methods declaration


public static void main(String[] args) {
	BankAccount obj = new BankAccount();
	// output : Current balance for SAI is : 98398403.09
	System.out.println("Current balance for "+Accountname+" is  : "+obj.getbalance());
	System.out.println("After Deposit your current balance is : "+obj.deposit(12548.0));
	System.out.println("After withdrawal you current balnace is : "+obj.withdrawal(1000.0));
}


public double deposit(double amount) {
		return amount+balance;	
}

public double withdrawal(double amount) {

	return balance-amount;
}

public double getbalance()
{
	return balance;
}

}
