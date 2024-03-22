/*Mrs. Kerr
  10/12/20
 This program will demonstrate Method Examples*/


  public class MethodExamplesNotes2
  {
 	 public static void main (String[] args)
 	 {

	//This example shows a method being called in an if statement
 		int value = 20;

 		if(isValid(value))
 			System.out.println("The value is in the range");

 		else
 			System.out.println("The value is out of the range");


	//This example shows methods being called from other methods
		System.out.println("Beginning in the main method");
		deeper();
		System.out.println("I survived!!");



 	 }

 	 /*This method will accept an integer as a paramter, determine if it is
 	   in the range of 1 to 100, and return a boolean
 	   @param number is an integer number
 	   @return status true or false*/

 	   public static boolean isValid(int number)
 	   {
		   boolean status;

		   if(number <=100 && number >=1)
		   	status = true;

		   else
		   	status = false;

		   return status;

	   }

	   public static void deeper()
	   {
		   System.out.println("I am in method A");
		   gettingDeeper();
		   System.out.println("I see the light!!");
	   }

	   public static void gettingDeeper()
	   {
		   System.out.println("I am in method B");
		   deepest();
		   System.out.println("I found my way back to method B");
	   }

	   public static void deepest()
	   {
		   System.out.println("I am in the deepest method");
		   System.out.println("It's scary in here!!");
	   }

  }