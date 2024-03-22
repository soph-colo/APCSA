/*Mrs. Kerr
  10/26/2020
  This program is a template for our review of the concept of classes */

public class ClassExample
{
	//NO MAIN METHOD!!!
	//the word static is not used when defining the methods

	//INSTANCE VARIABLES/FIELDS
      /*these are variables that can be used throughout the entire class
        so, these are variables that make sense/used in the majority of methods
        	-where local variables are ones that are only in a specific method
        	-KEYWORD PRIVATE is an access specifier and indicates these variables
        	  may not be accessed by statements outside of thsi class using objects
        	-public means they can be changed by any progam
        	-protected means they can be changed by any program that is in its "Package"
      */
		private int one, two;
		private double answer;


	//CONSTRUCTOR
	  /*used to set instance variabls or call methods as soon as an object is created
	    -this code automatically occurs when an object is created (only used in the inital setup)
	    -there does not have to be a constructor
	    -constructors do NOT have a return type
	    -the name of a constructor HAS TO BE the same as the class
	    -has to be public so that the driver program has access
	    -the instance variables automatically set to their defaults
	    	int 	0
	    	double 	0.0
	    	boolean false
	    	char 	''
	    	Strig	""
	  */
		public ClassExample()
		{
			one = 8;
			two = 3;
		}

	//OVERLOADING CONSTRUCTOR *you can have overloadig methods in a class)
		public ClassExample(int num1, int num2)
		{
			one = num1;
			two = num2;
		}

	//MUTATOR METHODS (set methods)
	  /*these methods are the ONLY way to change instance variables ater they
	      have been set originally
	  */
		public void setNum1(int num1)
		{ one = num1; }

		public void setNum2(int num2)
		{ two = num2; }

		public void setNumbers(int num1, int num2)
		{
			one = num1;
			two = num2;
		}

	//ACCESSOR METHODS (get methods)
	  /*these methods allow us to return information about the status of the
	      instance variables
	  */
		public int getNum1()
		{ return one; }

		public int getNum2()
		{ return two; }

		public double getAnswer()
		{ return answer; }


	//This method will add two integers together
		public void add()
		{ answer = one + two; }

	//This method will subtract the second number from the first
		public void subtract()
		{ answer = one - two; }

	//The method will multiply two numbers
		public void multiply()
		{ answer = one * two; }

	//The method will divide the first number by the second number
		public void divide()
		{
			//Declare local variable
				double division;

			if(two != 0)
			{
				division = (double)one/two;
				answer = division;
			}
			else
				divisionError();
		}

	/*This method states there is an error because of dividing by 0
	  @throws ArithmeticException for division by 0 */
	  	private void divisionError()
	  	{
			throw new ArithmeticException("You cannot divide by zero");
		}

		/*We declare this method as private because there is no reason for
		the driver program/an object to access it*/


	//This method will print answer of the operation
		public void print()
		{ System.out.println("\n\n" + answer); }





}



