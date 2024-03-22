/*Mrs. Kraulad
  9/30/15
 This program will discuss the different types of Errors*/

import java.util.Scanner;

 public class Errors
 {
	 public static void main (String[] args)
	 {
		/* ERRORS and EXCEPTIONS:

			ERROR: Occurs when compiling the program
				- Semi-colon
				- Spelling

			EXCEPTIONS: Is an error condition that occurs during
			    the execution of a Java program:
			    	- Dividing by zero
			    	- Array out of bounds
			    	- String out of bounds	*/


			 	//System.out.println(5/0); // ARITHMETIC EXCEPTION

			 int[] array = new int[5];
			 //System.out.println(array[6]); ARRAY INDEX OUT OF BOUND EXCEPTION

			 /*AN  UNCHECKED EXCEPTION is one where you don't provide code to
			   deal with the errors

			   A CHECKED EXCEPTION is one where you provide code to handle exception
			   either by:
			   		- try/catch
			   		- finally statement
			   		- explicit throw new...exception clause

			   		IMPORTANT AP EXAM: Checked exceptions are NOT part of the AP subset

			   			The following exceptions are part of it:
			   				- ArithmeticException
			   				- NullPointerException
			   				- ClassCastException
			   				- ArrayIndexOutOfBoundException
			   				- IndexOutOfBoundException
			   				- IllegalArgumentException	*/

			 //ARITHMETIC EXCEPTION

				Scanner sc = new Scanner(System.in);
				int total = 50;

				System.out.println("Enter a number to divide 50 by");
				double num = sc.nextDouble();

				if(num ==0)
					throw new ArithmeticException("Cannot divide by zero");
				else
					System.out.println("\n" + total/num);

				//If we did not have the if statement it would display infinity


			/*IllegalArgument Exception: this would be an exception when the user types
			  			in an incorrect value that does not make sense	*/

			  	System.out.println("\nPlease enter a radius length");
			  	double radius = sc.nextDouble();

			  	if(radius <0)
			  		throw new IllegalArgumentException("A radius cannot be negative");

			  	else
			  		radius = radius;

			 /*When an operation is performed that gives undefined result
			   Java expresses it as NaN	(Not a Number)
			   		- Taking square root of a neg number
			   		- Divide by 0.0

			   	An operation that gives an Infinitely large or infintely small
			   	number, the result is Infinity or -Infinity
			   		- Divide by 0	*/

	 }
 }