/*Mrs. Krauland
  9/22/2015
  This program will go over the different types of loops that can be implemented
  in a program */

import java.util.Scanner;

public class Loops
{
	public static void main(String[] args)
	{
		/*We know 3 types of loops:
			- for loops
			- while loops
			- do-while loops


		 IMPORTANT AP INFO: do-while loops are not part of the AP subset.


		 for loops:
		 	for(initialization; termination condition; counter)
		 	{
				CODE;
				CODE;
			}

			In a for loops the variable is initialized and then the termination
			condition is tested, the loops runs, then goes to the counter,
			then to termination condition, etc...

			Just like if statements if their is one line of code for the for
			loop braces are not needed.


			So if you declare the variable in the for loop the variable can
			only be used in the for loop.


			Notes:
				- The loop variable should not have its value changed inside
				  the loop's body
				- The initialization and update statement can use any valid
				  constant, variable, or expressions
				- You could have a for loop that is skipped all together
					for(int i=0; i>1; i++)
				- You could also have a loop that would run infinitly
					for(int i=0; i<1; i--)
				- Use a for loop when we have a set number of times we want
				  the loop to run.



	WHILE-LOOP:
		while(boolean expression)
		{
			CODE;
			CODE;
		}

		The boolean expression is performed at the beginning of the loop.
		If it is true the loop body is executed and will continue to run
		until that expression becomes false.

		If the boolean expression is false to begin the loop is skipped
		entirely.

		NOTES:
			- It is possible for the body of while to never be executed
			- Disaster can strike in the form of an infinite loop
			- Be sure the loop variable is changed in the body so we could
			  eventually get of the loop.

			  INFINITE LOOP:
			  	while(true)
			  	{
					System.out.println("I'm stuck");
				}

	SENTINEL: This is a value that will terminate the loop.
			  This value could NEVER be part of the data.
			  It signals the end of the list */

			  final int SENTINEL = -999;

			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter a list of positive integers, end the list with " + SENTINEL);
			  int value = sc.nextInt();

			  while(value != SENTINEL)
			  {
				  value = sc.nextInt();
			  }



	/*DO-WHILE LOOPS:
		do
		{
			CODE;
			CODE;
		}
		while(boolean expression);

			This is the only loop that runs that set of code ATLEAST once.
			All the other loops could be completely skipped.

			Notice the boolean expression is at the bottom so it is not
			checked right away allowing you to fall right into the loop.




	NESTED LOOPS:
		This is a loop that is in another loop.	*/



	}
}