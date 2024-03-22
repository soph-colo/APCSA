/*Mrs. Krauland
  9/3/2017
  This program will be a review how to start declaring variables in programs*/

public class VariableTypes
{
	public static void main(String[] args)
	{
		/*What is an identifier?
			It is aname for a variable, parameter, user-defined methods,
			and defined classes
			   - first letter should be lowercase
			   - name should be relivent to what it represents (not x, but age)
			   - no spaces
			   - Cannot be a Java keyword
			   - constant variables use the keyword final and should be all capital
			     letters
			   - cannot start with a number, must be a letter
			   - If we are using muliple words:
			   		surfaceArea
			   		surface_area

		  PRIMITIVE DATA TYPES:

		  	INTEGER
		  		byte
		  		short
		  		int
		  		long

		  	WORD/LETTERS
		  		char
		  		String

		  	DECIMALS
		  		float
		  		double

		  	TRUE/FALSE
		  		boolean

		  	***IMPORTANT AP EXAM INFO: int, double, boolean, char, String

	 If you put in a number too large for an interger you get what type of error?
	 	Overflow Error: Java will give no warning, you just get a wrong result

	 Why should you avoid declaring a variable as a long if an int would suffice?
	 	Uses less memory so the compile and run time are better



	 INITIALIZING VARIABLES: */
	 	int a = 6; 		//we initialized and declared
	 	double x = 5.2, y = 1.1;
	 	boolean found = false;
	 	String word = "hello";
	 	char letter = 'a';

	 	//Declaring a variable to have scientific notation
	 		double d = 1.45567E23;
	 		double f = 34343.232344e10;
	 		double p = 1.921e-16;
	 		System.out.println(d);
	 		System.out.println(f);
	 		System.out.println(p);

	 /*CASTING:
	 	What is casting?
	 		Force a change for a variable from one type to another.

	 	Why would you need to use casting?
	 		Using Math.pow to get an int instead of a double
	 		Changing an int to a double to properly divide. */

			int total = 10, num = 3;
			double average = total / num;
			System.out.println(average);

			average = (double)total/num;
			System.out.println(average);

		//What would happen here?
			average = (double)(total/num);
			System.out.println(average);
				//Orders of operation does parenthesis first before casting


		//Can I do this?
			int number = 5;
			double realNum = number;
				//Yes this is allowed, a double is larger than an int
				//Java automatically will perform a widening operation

			double G = 6.79;
			//int intNum = G;	ERROR: Possible loss of conversion
			//need to cast since double is larger than int
			int intNum = (int)G;

	//ROUNDING TO WHOLE NUMBERS:
		long cost = Math.round(10.95);
		System.out.println(cost);
			//Math.round returns a double or a long

		//Another way:
			int numDollars = (int)(10.15 + 0.5);

			double negAmt = -4.8;
			int roundNeg = (int)(negAmt - 0.5);


	/*STRING METHODS:
		.toUpperCase()		converts string to upper/lower case letters
		.toLowerCase()

		.length()			counts how many characters are in the string

		.equalsIgnoreCase() compares to strings to see if they are the same
		.equals()

		.charAt()			tells you what character is at a specific position

		.substring()		returns the part of the string from the starting
							position to the ending position - 1

							returns from starting to position to the end if
							their was only 1 argument

		.indexOf()			what position a char is at in the String
							returns -1 if the char is not in the String

		.toCharArray() */


	String beginning = "Donald", end = "Duck";
	String name = beginning + " " + end;
	System.out.println("\n" + name);

	//What will be printed?
		System.out.println(name.length());
				//11
		System.out.println(name.substring(2,5));
				//nal
		System.out.println(name.substring(7));
				//Duck
		System.out.println(name.indexOf(' '));
				//6

	//What would the code using the variable name to print Donald Duck is a Duck
		System.out.println(name + " is a " + name.substring(7));

			int type = name.indexOf("Duck");
		System.out.println(name + " is a " + name.substring(type));

		System.out.println(name + " is a" + name.substring(name.indexOf(' ')));


	System.out.println(name.charAt(4));
		//l

	System.out.println(name.toUpperCase());
	}
}








