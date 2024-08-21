package banking;
/*
 * Represents a checking/saving bank account for a customer
 * 
 */
public class BankAccount {

	//instant vars
	/*
	 * Type of accounts
	 */
	String accountType;
	
	/*
	 * banlance for  bank account
	 * 
	 */
	double balance;
	
	/*
	 * customer for this account
	 */
	Customer customer;
	
	/*
	 * create a bank account of given type for given customer
	 */
	public BankAccount(String accountType, Customer customer ) {
	   this.accountType = accountType ;
	   this.customer = customer ;
}

	//methos
	/*
	 * deposits the given amount to add to balance
	 */
	public void deposit (double amount) {
	   this.balance += amount;
	}
	   /*
	    * withdraw the given amount from balance
	    * amount to withdraw
	    * exception if given amount is larger than available balance
	    */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("amount is greater than available balance");
		}
		this.balance -= amount;
	}
	public String getAccountInfo() {
	 return this.accountType + ": " + this.balance;
	}
	
	/*
	 * return the custoer name and address for this bank account
	 * 
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
	
	
	
	
	
	
	
	
}	

	