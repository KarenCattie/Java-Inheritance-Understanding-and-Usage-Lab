/*
* File name: [SalesAgentTest.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab05]
* Date: [Nov 07, 2022]
* Professor: [Daniel]
* Purpose: [This is the main class to test the superclass and the first subclass that created in SalesAgent.java]
*/
/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
*/
/**
 * This is the main class to test the superclass and the first subclass that created
 * instantiate two objects for testing
 * then display the sale agent's information as requested
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see SalesAgent
 * @see SalesSupervisor
 */
public class SalesAgentTest
{  
	/**
	 * This is the entry point for this program
	 * instantiate two objects and passed values 
	 * for testing method from superclass and subclass
	 * @param args passing arguments that is given
	 */
   public static void main(String[] args)
   {

	//... your code starts here!
	   SalesAgent agentTest = new SalesAgent("Andrew",42);
	   System.out.println(agentTest.toString());
	   SalesSupervisor supervisorTest = new SalesSupervisor("James",26,"Perth");
	   System.out.println(supervisorTest.toString());
	   
   }
}  