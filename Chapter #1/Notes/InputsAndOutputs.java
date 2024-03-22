/*Mrs. Krauland
  9/15/2016
  This program will demonstrate the Input/Output code

IMPORTANT AP EXAM INFO:
	Since there are so many ways to provide input to a program, user input
	is not part of the AP subset.  If reading input is a necessary part a
	question it will be indicated something like this:

		double x = call to a method that reads a floating-point

			OR

		double x = IO.readDouble(); 	//reads user input

	Dealing with output to the user testing will be restricted to using
		System.out.print();
			and
		System.out.println();

	Formatting out will not be tested */

import java.text.DecimalFormat;
import java.util.Scanner;

public class InputsAndOutputs
{
	public static void main(String[] args)
	{
		/*DECIMAL FORMATTER:
			import java.text.DecimalFormat;
			Creating an object: */
				DecimalFormat df = new DecimalFormat("#,###.##");
				DecimalFormat dfMoney = new DecimalFormat("$#,###.00");
				DecimalFormat dfPercent = new DecimalFormat("#.###%");
					//The percent df automatically multiplies by 100

			double num = 348203482309.43493349;
				//We can only use a df in a print line.
					System.out.println(df.format(num));

			double num1 = .523232;
			System.out.println(dfPercent.format(num1));




		/*INPUT:
			What import is needed to read in data from the user?
				import java.util.Scanner;

			How do I declare the scanner?
				Scanner sc = new Scanner(System.in);
					  reference variable	parameter

				A reference must be used to the store the memory of the Scanner
				object.

			What are the methods in the Scanner class?
				.nextLine()		//reads in the full line of information
				.nextInt()
				.nextDouble()
				.nextFloat()
				.next()			//reads in a single word/letter
				.nextLong()
				.nextShort()
				.nextByte()
			*/

			//Create a Scanner
				Scanner sc = new Scanner(System.in);

			//Get info from the user:
				System.out.print("Please enter your first name: ");
				String name = sc.nextLine();

				System.out.print("\nPlease enter your age: ");
				int age = sc.nextInt();

				System.out.print("\nWrite a sentence about computer programming: ");
				sc.nextLine(); 			/*RECALL: When going from reading in an int
											to a string we must pick up the whitespace
											by reading in a blank line */
				String sentences = sc.nextLine();

			//Output
				System.out.println(name + " is " + age + " years old.  " + name + "\'s " +
									"thoughts on computer programming is " + sentences);










	}
}