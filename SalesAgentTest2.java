/*
* File name: [SalesAgentTest2.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab05]
* Date: [Nov 07, 2022]
* Professor: [Daniel]
* Purpose: [This is the main class 2 to test the superclass and all the subclass that created in SalesAgent.java]
*/
/**
   This program is the second test for the SalesAgent class including the subclasses.
*/
/**
 * This is the second main class to test the superclass and all the subclasses that created
 * instantiate four objects for testing
 * then display the sale agent's information as requested
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see SalesAgent 
 * @see SalesSupervisor
 * @see SalesChief
 */
public class SalesAgentTest2
{  
	/**
	 * This is the entry point for this program
	 * instantiate four objects and passed values 
	 * for testing method from superclass and subclass
	 * @param args passing arguments that is given
	 */
   public static void main(String[] args)
   {

	//... your code starts here!
	   SalesAgent agentTest = new SalesAgent("Peter",56);
	   System.out.println(agentTest.toString());
	   SalesAgent agentTest2 = new SalesAgent("John",48);
	   System.out.println(agentTest2.toString());
	   SalesSupervisor supervisorTest = new SalesSupervisor("Ifeoma",53,"Toronto");
	   System.out.println(supervisorTest.toString());
	   SalesChief chiefTest = new SalesChief("Yalin Su",18,"Ottawa","Sales Representitive");
	   System.out.println(chiefTest.toString());
   }
}  