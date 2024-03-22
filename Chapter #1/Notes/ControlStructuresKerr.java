/*Mrs. Kerr
  9/21/2020
  This program will go over how to use if-else, switch statements, and loops.
 */

import java.util.Scanner;

public class ControlStructuresKerr
{
	public static void main(String[] args)
	{

		/*Control Structures is the way make statement of a program run in
			nonsequential order.

		  There are 2 general types: Decision Statements and Iterations


		  DECISION-MAKING CONTROL STATEMENTS:
		  	if					Checking 1 thing
		  	if/else				Checking 2 things
		  	if/else if/ else	Checking more than 2 things
		  	switch				Checking 2 or more

		  	***AP EXAM INFO: switch statement is NOT part of the AP subset


		  What will the output of this be? */
		  	Scanner sc = new Scanner(System.in);
		  	System.out.println("Enter a number");
		  	int num = sc.nextInt();

		  	if(num >= 0)
		  		if(num % 2 == 0)
		  			System.out.println(num + " is positive and even");

			else
				System.out.println(num + " is a negative");


			/* BECAREFUL: Even thought it looks like the else goes with the first
				if, its bad formatting, the else always gets matched with the
				nearest unpaired if statement.  What would we need to do to make this
				work properly? (Would need brackets and to change logic)


		SWITCH:

			switch(variableName)
			{
				case 1: 			case 'a': 			case "apple":
					CODE;
					break;

				case 2:
					CODE;
					break;

				default:
					CODE;

			break; saves a lot of execuition time becuase it "ignores" the execution of all the
			rest of the code in the switch block

			default: specifices some code to run if there is no case match; if it is the last
			statement in the switch block, it does not need a break
			}
		*/
		System.out.println("\n\nEnter a number 1 - 7");
		int day = sc.nextInt();
		switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Looking forward to the Weekend");
		}

 		/*
		ITERATIONS:
			for			Know the number of iterations

						for (statement 1; statement 2; statement 3){
							//code block to be executed
							//statement 1: executed (one time) before the execution of the block
							//statement 2: defines the condition for executing the code block
							//statement 3: executed (ever time) after the code block has been executed
						}

						for (int i=0; i<5; i++){
							System.out.println(i);
						}

			while		Run unknown of times/may never run
						loops through a block of code as long as a specific condition is true

						while (condition){
							//code block to be executed
						}

			do-while	Run atleast onces
						loop will execute the code block ones before checking
						if the condition is true and then repeat as long as
						the condition is true

						do{
							//code block to be executed
						}
						while (condition);


			***AP INFO: do-while is NOT part of the AP subset


			SENTINEL: This a value that will terminate the loop
					  That value would NEVER be part of the data
					  It signals the end of the list*/


				final int SENTINEL = -999;

				System.out.println("\n\nEnter a list of positive integers, end this list with " + SENTINEL);
				int value = sc.nextInt();

				while(value != SENTINEL)
				{
					value = sc.nextInt();
					System.out.println(value);
				}

				//Try input: 1 2 5 6 7 100 25 -999 36 -45 7


	}
}