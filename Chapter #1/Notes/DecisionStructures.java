/*Mrs. Krauland
  9/21/2015
  This program will go over how to use if-else and switch statements. */

import java.util.Scanner;

public class DecisionStructures
{
	public static void main(String[] args)
	{
		/*Control Structure statements is a way you makes of a program run
		  in nonsequential order.

		  There are 2 general types: if statements/switch statements and iterations

		DECISION STRUCTURE:
			The computer decides which path to follow based on the truth value
			of the boolean expression.

			***AP EXAM: The switch is not part of the AP subset

			IF STATEMENT
				if(boolean expression)
				{
					CODE;
					CODE;
				}

				or

				if(boolean expression)
					CODE;

			IF ELSE STATEMENT
				if(boolean expression)
					CODE;
				else
					CODE;

				If the boolean expression is true it falls into the if statement
				if it is false it automatically falls into the else.


			IF, ELSE IF,...ELSE STATEMENTS:
				if(boolean expression)
					CODE;
				else if(boolean expression)
					CODE;


				else
					CODE;

				We use else if statements if there is more than 2 possibilities.


			NESTED IF STATEMENT:
				It is an if statement that inside another if statement.

				if(boolean expression 1)
					if(boolean expression 2)
						CODE;

				What is an equivalent line of code to a nested if statement:
					if(boolean expression1 && boolean expression2)
						CODE;


				What would this output be? */
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter an integer ");
					int n = sc.nextInt();

				/*
					if(n>=0)
						if(n%2 ==0)
							System.out.println(n + " is positive and even");

					else
						System.out.println(n + " is not positive");



					n = 4			4 is positive and even
					n = 5			5 is not positive
					n = -1			-1 is not positive

					Based on the way the code is written it is not correct.  Even
					thought it looks like the else statement goes with the first
					if, the else always gets matched with the nearest unpaired if
					statement*/


					if(n>=0)
					{
						if(n%2 ==0)
							System.out.println(n + " is positive and even");
					}

					else
						System.out.println(n + " is not positive");


			/*SWITCH STATEMENTS:
				The if statement is the most popular decision structure, but a
				switch statement could be used when we have a finite set of
				possibilities.

				What primitive data type do switch statements get used on?
					int
					char


				switch(variableNameInt)					switch(variableNameChar)
				{										{
					case 1:									case 'a':
						CODE; 									CODE;
					break;									break;

					case 2: 								case 'b':
						CODE; 								case 'B':
					break; 											CODE;
															break;
					default:
				}										}


				After each case we need a break.  If there is no break what happens?
				If there is no break it runs into the next case until hit breaks a break
				or goes into the default. */





	}
}