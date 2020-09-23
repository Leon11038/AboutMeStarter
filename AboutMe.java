/*
 * Programmer: Ryan Dubeau
 * Date: 9/22/2020
 * Purpose: To print my name, age in height from storing it in a variable
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
        // TODO: Write the code the declares the variables
    	
    	String myName = "Ryan";
    	int myAge = 16;
    	double myHeightInMeters = 1.56;
        
    	// Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        // TODO: Write the code that changes the variables
        myAge = 17;
        myHeightInMeters = 1.58;
        // Print the new values
        System.out.println("Some time passes...");
        // TODO: Write the last two print statements
    }
}
