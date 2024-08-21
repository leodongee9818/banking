package banking;

import java.util.Scanner;

/*
 * Represents a bank for managing customer and their bank accounts
 * 
 */
public class Bank {

	public static void main(String[] args) {
		
		// creates new instance of Bank class
        Bank bank = new Bank();
        
        //calls the run method in the bank class
        bank.run();
	}
/*
 * Runs the program by initilizing and managing, bank accounts and customers.
 */
	
	public void run() {
         System.out.println("welcome to the Bank! what is your name? ");
         
         //create scanner to get user input
         Scanner scanner = new Scanner(System.in);
         
        //get the next token (word), whihc is the customer's name
        String name = scanner.next();
         
        System.out.println("Hello " + name + " ! We are creating checking and saving accounts for you.");
         
       //create customer with given name
        Customer customer = new Customer(name);
         
        //get address
        System.out.println("what is your addresss?");
        
        //get the next token (word), which is the customer's address
        String address = scanner.next();
     
        		
        //set the customer address
        customer.setAddress(address);		
        		
        //create a checking account for customer
        BankAccount checkingAccount = new BankAccount("checking", customer);
        
        //create a savings account for customer
        BankAccount savingsAccount = new BankAccount("savings", customer);
        
        //gets and prints the customer infor associated with checking account
        System.out.println();
        System.out.println("customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());
        
        //get and print account info for checking account
        System.out.println("Checking account: ");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("Savings account: ");
        System.out.println(savingsAccount.getAccountInfo());
        
        //deposits
        
        //into checking
        System.out.println();//blank line
        System.out.println("Amount (decimal) to deposit into your checking account?");
        double amount = scanner.nextDouble();//get next token
        checkingAccount.deposit(amount);//deposit into checking account
        
        //into csaving
        System.out.println();//blank line
        System.out.println("Amount (decimal) to deposit into your saving account?");
         amount = scanner.nextDouble();//get next token
        savingsAccount.deposit(amount);
        
        //print new balances
        System.out.print(checkingAccount.getAccountInfo());
        System.out.print(savingsAccount.getAccountInfo());
        
        //withdrawsl
        
        //from checkings
        System.out.println(); //blank line
        System.out.println("Amount (decimal) to wtihdraw from your checking account?");
        amount = scanner.nextDouble();//get next token(double)
        
        try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//prints custom error message  from withdraw method
			System.out.println(e.getMessage());
		} //withdraw from checking
        
        //from savings
        System.out.println(); //blank line
        System.out.println("Amount (decimal) to wtihdraw from your checking account?");
        amount = scanner.nextDouble();//get next token(double)
        
        try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//prints custom error message  from withdraw method
			System.out.println(e.getMessage());
		} //withdraw from saving
        
        //print new balances
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());
        
        scanner.close();
      
   }
}