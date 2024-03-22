/*Mrs. Kerr
  10/12/2020
  This program will show students examples of Method Overloading
*/

import java.util.Scanner;

public class MethodOverloadingNotes3
{
	public static void main(String[] args)
	{
		/*Overloading methods are two or more methods that have the same name
		  and different parameter list.

		  The process of matching a method call statement with the correct
		  method is called binding. */

		  System.out.println(product(3.1, 5.2));		//2nd Method
		  System.out.println(product(3,5)); 			//1st Method
		  System.out.println(product(5, 10, 20)); 		//4th Method
		  System.out.println(product(5.11, 3)); 		//3rd Method
		  System.out.println(product(4, 6.1)); 			//2nd Method
		  		/*Why does this go into the second method?
		  			Since we do not have a parameter list (int, double)
		  			Java automatically performs the widening conversion.
		  			It does not fall into the 3rd because order matters
		  				and 6.1 is not an int */



	}

	/*This method displays a message and multiplies two numbers
	  @param x is a integer number
	  @param y is a integer number
	  @return x*y */

	  	public static int product(int x, int y)
	  	{
			System.out.println("The two numbers are integers");
			return x*y;
		}





	/*This method displays a message and multiplies two numbers
	  @param x is a double number
	  @param y is a double number
	  @return x*y */

	  	public static double product(double x, double y)
	  	{
			System.out.println("The two numbers are doubles");
			return x*y;
		}



	/*This method displays a message and multiplies two numbers
	  @param x is a double number
	  @param y is a integer number
	  @return x*y */

	  	public static double product(double x, int y)
	  	{
			System.out.println("One number is a double and one number is an int");
			return x*y;
		}



	/*This method displays a message and multiplies two numbers
	  @param x is a integer number
	  @param y is a integer number
	  @param z is a integer number
	  @return x*y*z */

	  	public static int product(int x, int y, int z)
	  	{
			System.out.println("The three numbers are integers");
			return x*y*z;
		}


	/*Why would this method give me an error?
		This is an error because it has the same name AND same parameter
		list as another method. Java does not recognize the difference
		of the return type

		public static double product(int x, int y)
		{
			return x*y;

		}
		*/





}