package banking;
/*
 * Represents a customer of a bank
 */
public class Customer {

	//instance vars
	
	
	/*
	 * name of customer
	 */
	String name;
	
	/*
	 * Address of customer
	 */
	String address;
	
	/*
	 * Create a customer with the given name.
	 * name of customer
	 */
	public Customer(String name) {
		//sets instance var name to give name
		this.name = name;
		
		
}
	//methods
	/*
	 * sets the address of customer to be give address
	 * address for customer
	 */
	 public void setAddress(String address) {
		 this.address = address;
	 }
	
	 /*
	  * Return customer's name
	  * 
	  */
	 public String getName() {
		 return this.name;
	 }
	 
	 /*
	  * Returns customer's address
	  */
	 public String getAddress() {
	     return this.address;        
	 
	 
	 
}
}
