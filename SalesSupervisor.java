/*
* File name: [SalesSupervisor.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab05]
* Date: [Nov 07, 2022]
* Professor: [Daniel]
* Purpose: [creating a subclass to inherit from superclass SalesAgent]
*/
/**
 * This class inherits variables and method from superclass SalesAgent
 * and also contains its own instance variable, and override the toSring method to have its own output
 * @author Yalin Su
 *
 */
public class SalesSupervisor extends SalesAgent{
	 private String location;
	   /**
	    * 
	    * @param n the name of the Sales Agent that inherited from superclass SalesAgent
	    * @param a the age of the Sales Agent that inherited from superclass SalesAgent
	    * @param location the location of the SalesSupervisor
	    */
	   public SalesSupervisor(String n, int a, String location) {
		super(n, a); //inherit the variables of name and age from superclass SalesAgent
		this.location = location;
	}
	   /**
	    * This is the SalesSupervisor subclass's toString method that is inherited and override from superclass SalesAgent
	    * @return a string representation of the object
	    */
	   //override the toString method from superclass SalesAgent, and add the info that the SalesAgent does not have.
	   @Override
	   public String toString() {
		   return "Sales Supervisor [super="+super.toString()+", location="+location+"]";

	   }
}
