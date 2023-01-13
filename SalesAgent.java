/*
* File name: [SalesAgent.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab05]
* Date: [Nov 07, 2022]
* Professor: [Daniel]
* Purpose: [creating a superclass and two subclasses to know how inheritance works in Java, and use super keyword to perform
* 			inheritance function between classes and overriding method]
*/

// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/**
   This class shows a Sales Agent with a name and age.
*/
public class SalesAgent
{  
   private String name;
   private int age;

   /**
      In this portion of your code, construct a SalesAgent object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
   */
   // START CODE
   public SalesAgent(String n, int a) {
	   this.name = n;
	   this.age = a;
   }
   // END CODE
/**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */
   //toString method to display Sales Agent info
   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
}
   