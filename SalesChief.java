/*
* File name: [SalesChief.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab05]
* Date: [Nov 07, 2022]
* Professor: [Daniel]
* Purpose: [creating a subclass to inherit from subclass SalesSupervisor]
*/
/**
 * This class inherits variables and method from subclass SalesSupervisor
 * and also contains its own instance variable, and override the toSring method to have its own output
 * @author Yalin Su
 */
public class SalesChief extends SalesSupervisor{
	private String department;
	   /**
	    * 
	    * @param n the name of the Sales Agent that inherited from subclass SalesSupervisor
	    * @param a the age of the Sales Agent that inherited from subclass SalesSupervisor
	    * @param location the location of the Sales Agent that inherited from subclass SalesSupervisor
	    * @param department the department of the SalesChief
	    */
	   public SalesChief (String n, int a, String location, String department) {
	   super(n,a,location);//inherit the variables of name, age and location from subclass SalesSupervisor
	   this.department = department;
	   }
	   /**
	    * This is the SalesChief subclass's toString method that is inherited and override from subclass SalesSupervisor
	    * @return a string representation of the object
	    */
	   //override the toString method from subclass SalesSupervisor, and add info that the SalesSupervisor does not have.
	   @Override
	   public String toString() {
		   return "Sales Chief [super="+super.toString()+", department="+department+"]";
	   }
}
