/*Mrs. Krauland
  This program will review recursion methods  */

import java.util.Scanner;

 public class RecursionNotes
 {
	 public static void main(String[] args)
	 {
			/*Recursion occurs when a method calls itself.

			  The recursive method will continue to run until it runs out of
			  memory (crashes) or you use a BASE CASE to stop the recursive
			  method.

			  The base case typically occurs for the simplest case of the problem,
			  such as when an integer is a value or 0 or 1.  Other examples are when
			  a "key" is found or an end of the file is reached.

			  Every resursive method has two distinct parts:
			     1.) BASE CASE or termination condition
			     2.) A nonbase case whose actions move the algorithm toward the
			         base case to terminate.


			  EXAMPLE 1: */
			     run(10);


		/*A method that has no pending statements following the recursive statement
		  is an example of TAIL RECURSION.

		  AP EXAM: You will be asked to understand and trace resursive methods,
		   		   you will not be asked to come up with code in a free-response
		   		   section.


		  FIBONACCI SEQUENCE:
		  	1, 1, 2, 3, 5, 8, 13,....
		  	The nth number equals the sum of the previous two number if n
		  	is greater or equal to 3.

		  	Create a recursive method that would state what the nth value is.*/

		  	//Print the next Fibonacci Number
		  		System.out.println(fibonacci(8));
		  		System.out.println(fib(8));




	}
	public static int fibonacci(int n)
	{
		if(n < 3)
			return 1;

		return fibonacci(n-1)+fibonacci(n-2);

	}
	/*notice that we have 2 recurisve call statements.
	  how many call statements would it take to find fibonacci(5)?


	  for each call statement, it makes 2 more call statements (exponentially growing)
	  when a method does this, it is very inefficient and a red flag you should NOT
	  do it this way

	  if we start asking for a higher n value, our runtime is much slower

	  we should be user an iterative algorithm (loops) */


	public static int fib(int n)
	{
		int n1 = 1, n2 = 1, sum = 0;

		for(int i = 2; i < n; i++)
		{
			sum = n1+n2;
			n2 = n1;
			n1 = sum;
		}

		return sum;



	}




	//This method accept an int and display the integer
	public static void run(int num)
	{

		if(num < 20)
			run(num + 1);

		System.out.println(num);
		/*BE CAREUFL where print lines or code is with recursive methods
		  	if they come after the BASE CASE then the code is "backwards"
		  	since all the call statements happen BEFORE you reach that part

*/

	}

/*Since every recursive algorthim could be used iterative, when do we use
  recurssion?
  	1.) Avoid recursion for algorithms that have too many recursive call statements
  	2.) Avoid recursion when we are dealing with larg arrays
  	3.) Avoid recursion for simple iterative methods
  	4.) Use recursion when it simplfies code
  	5.) Use recursion for
  		- Branching processes like traversing trees or directories
  		- Divide-and-conquer algorithms like mergesort or binary search*/










 }